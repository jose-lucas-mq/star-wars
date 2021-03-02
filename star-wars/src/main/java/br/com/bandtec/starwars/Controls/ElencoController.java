package br.com.bandtec.starwars.Controls;

import br.com.bandtec.starwars.Class.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static br.com.bandtec.starwars.Inject.Inject.getEstudio;

@RestController
@RequestMapping("/elenco")
public class ElencoController {
    Estudio estudio = getEstudio();

    @GetMapping("/{index}")
    public Filme get(@PathVariable int index) {
        return estudio.getFilmes().get(index);
    }

    @DeleteMapping("/{indexFilme}/{indexPersonagem}")
    public void delete(@PathVariable int indexFilme, @PathVariable int indexPersonagem) {
        if (estudio.getFilmes().size() > indexFilme)
            estudio.getFilmes().get(indexFilme).delete(indexPersonagem);

    }

    @PutMapping("/diretor/{indexFilme}/{indexDiretor}")
    public void updateDiretor(@PathVariable int indexFilme, @PathVariable int indexDiretor, @RequestBody Diretor diretor) {
        estudio.getFilmes().get(indexFilme).update(indexDiretor, diretor);
    }

    @PutMapping("/jedi/{indexFilme}/{indexJedi}")
    public void updateJedi(@PathVariable int indexfilme, @PathVariable int indexjedi, @RequestBody Jedi jedi) {
        estudio.getFilmes().get(indexfilme).update(indexjedi, jedi);
    }

    @PutMapping("/sith/{indexFilme}/{indexSith}")
    public void updateSith(@PathVariable int indexFilme, @PathVariable int indexSith, @RequestBody Sith sith) {
        estudio.getFilmes().get(indexFilme).update(indexSith, sith);
    }

    @PostMapping("/diretor/{indexFilme}/{indexElenco}")
    public void postDiretor(@PathVariable int indexFilme, @PathVariable int indexElenco, @RequestBody Diretor diretor){
        estudio.getFilmes().get(indexFilme).getElenco().get(indexElenco).create(diretor);
    }

    @PostMapping("/jedi/{indexFilme}/{indexElenco}")
    public void postJedi(@PathVariable int indexFilme, @PathVariable int indexElenco, @RequestBody Jedi jedi){
        estudio.getFilmes().get(indexFilme).getElenco().get(indexElenco).create(jedi);
    }

    @PostMapping("/sith/{indexFilme}/{indexElenco}")
    public void postSith(@PathVariable int indexFilme, @PathVariable int indexElenco, @RequestBody Sith sith){
        estudio.getFilmes().get(indexFilme).getElenco().get(indexElenco).create(sith);
    }


}
