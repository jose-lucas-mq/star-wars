package br.com.bandtec.starwars.Controls;

import br.com.bandtec.starwars.Class.Estudio;
import br.com.bandtec.starwars.Class.Filme;
import org.springframework.web.bind.annotation.*;

import static br.com.bandtec.starwars.Inject.Inject.getEstudio;

@RestController
@RequestMapping("/estudio")
public class EstudioController {
    Estudio estudio = getEstudio();

    @GetMapping
    public Estudio get(){
        return estudio;
    }

    @GetMapping("/{index}")
    public Filme get(@PathVariable int index){
        if (estudio.getFilmes().size() > index)
            return estudio.getFilmes().get(index);
        else
            return null;
    }

    @PostMapping
    public void add(@RequestBody Filme filme){
        estudio.create(filme);
    }

    @DeleteMapping("/{index}")
    public void remove(@PathVariable int index){
        if(estudio.getFilmes().size() > index)
            estudio.delete(index);
        else {
        }
    }

    @PutMapping("/{index}")
    public void set(@PathVariable int index, @RequestBody Filme filme){
        estudio.update(index, filme);
    }
}
