package br.com.bandtec.starwars.Controls;

import br.com.bandtec.starwars.Class.Elenco;
import br.com.bandtec.starwars.Class.Estudio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.bandtec.starwars.Inject.Inject.getEstudio;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    Estudio estudio = getEstudio();

    @PostMapping("/{indexFilme}")
    public void add(@PathVariable int indexFilme, @RequestBody Elenco elenco){
        estudio.getFilmes().get(indexFilme).create(elenco);
    }

    @PutMapping("/{indexFilme}/{indexElenco}")
    public void add(@PathVariable int indexFilme, @PathVariable int indexElenco, @RequestBody Elenco elenco){
        estudio.getFilmes().get(indexFilme).update(indexElenco, elenco);
    }

    @GetMapping("/{indexFilme}")
    public List<Elenco> get(@PathVariable int indexFilme){
       return estudio.getFilmes().get(indexFilme).getElenco();
    }

    @DeleteMapping("/{indexFilme}/{indexElenco}")
    public void delete(@PathVariable int indexFilme, @PathVariable int indexElenco){
        estudio.getFilmes().get(indexFilme).delete(indexElenco);
    }

}
