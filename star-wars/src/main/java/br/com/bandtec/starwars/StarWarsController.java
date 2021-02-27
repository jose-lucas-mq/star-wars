package br.com.bandtec.starwars;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/star-wars")
public class StarWarsController {
    private List<Jedi> jedi = new ArrayList<>();
    private List<Sith> sith = new ArrayList<>();
    private List<Diretor> diretores = new ArrayList<>();
    private List<Filme> filmes = new ArrayList<>();

    public StarWarsController() {
        jedi.add(new Jedi("Obi Wan Kenobi",
                47,
                "Verde",
                87,
                "Treinou o cara errado",
                "Tatooine",
                4327.2,
                9));

        sith.add(new Sith("Darth Maul",
                12,
                "Vermelho",
                92,
                "Orfão",
                "Dathomir",
                3102.0,
                false));

        diretores.add(new Diretor("J J Abrams",
                3,
                6430.4));

        filmes.add(new Filme("Uma nova Esperança",
                "A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader.",
                "George Lucas",
                125));

    }

    // Metodos de GET, retornando os objetos correspondentes

    @GetMapping("/filme")
    public List<Filme> getFilme() {
        return filmes;
    }

    @GetMapping("/diretor")
    public List<Diretor> getDiretor() {
        return diretores;
    }

    @GetMapping("/jedi")
    public List<Jedi> getJedi() {
        return jedi;
    }

    @GetMapping("/sith")
    public List<Sith> getSith() {
        return sith;
    }

    // Metodos de GET, retornando os objetos correspondentes, segundo o indice passado na URI

    @GetMapping("/filme/{index}")
    public Filme getFilme(@PathVariable int index) {
        if (index < filmes.size())
            return filmes.get(index);
        else
            return null;
    }

    @GetMapping("/diretor/{index}")
    public Diretor getDiretor(@PathVariable int index) {
        if (index < diretores.size())
            return diretores.get(index);
        else
            return null;
    }

    @GetMapping("/jedi/{index}")
    public Jedi getJedi(@PathVariable int index) {
        if (index < jedi.size())
            return jedi.get(index);
        else
            return null;
    }

    @GetMapping("/sith/{index}")
    public Sith getSith(@PathVariable int index) {
        if (index < sith.size())
            return sith.get(index);
        else
            return null;
    }

    // Metodos de DELETE de cada objeto
    @DeleteMapping("/filme/{index}")
    public String deleteFilme(@PathVariable int index) {
        if (index < filmes.size()) {
            filmes.remove(index);
            return "Filme excluido com sucesso";
        } else {
            return "Filme não encontrado";
        }
    }

    @DeleteMapping("/diretor/{index}")
    public String deleteDiretor(@PathVariable int index) {
        if (index < diretores.size()) {
            diretores.remove(index);
            return "Diretor excluido com sucesso";
        } else {
            return "Diretor não encontrado";
        }
    }

    @DeleteMapping("/jedi/{index}")
    public String deleteJedi(@PathVariable int index) {
        if (index < jedi.size()) {
            jedi.remove(index);
            return "Jedi excluido com sucesso";
        } else {
            return "Jedi não encontrado";
        }
    }

    @DeleteMapping("/sith/{index}")
    public String deleteSith(@PathVariable int index) {
        if (index < sith.size()) {
            sith.remove(index);
            return "Sith excluido com sucesso";
        } else {
            return "Sith não encontrado";
        }
    }

    // Metodos de POST de cada objeto

    @PostMapping("/filme")
    public Filme postFilme(@RequestBody Filme newFilme) {
        filmes.add(newFilme);
        return newFilme;
    }

    @PostMapping("/diretor")
    public Diretor postDiretor(@RequestBody Diretor newDiretor) {
        diretores.add(newDiretor);
        return newDiretor;
    }

    @PostMapping("/jedi")
    public Jedi postJedi(@RequestBody Jedi newJedi) {
        jedi.add(newJedi);
        return newJedi;
    }

    @PostMapping("/sith")
    public Sith postSith(@RequestBody Sith newSith) {
        sith.add(newSith);
        return newSith;
    }

    // Metodos de PUT para atualizar dados de cada objeto
    @PutMapping("/filme/{index}")
    public String getFilme(@PathVariable int index,
                          @RequestBody Filme newFilme) {
        if (index < filmes.size()) {
            filmes.set(index, newFilme);
            return "Filme atualizado com sucesso";
        }else{
            return "Filme não encontrado";
        }
    }

    @PutMapping("/diretor/{index}")
    public String getDiretor(@PathVariable int index,
                           @RequestBody Diretor newDiretor) {
        if (index < diretores.size()) {
            diretores.set(index, newDiretor);
            return "Filme atualizado com sucesso";
        }else{
            return "Filme não encontrado";
        }
    }

    @PutMapping("/jedi/{index}")
    public String getJedi(@PathVariable int index,
                             @RequestBody Jedi newJedi) {
        if (index < jedi.size()) {
            jedi.set(index, newJedi);
            return "Filme atualizado com sucesso";
        }else{
            return "Filme não encontrado";
        }
    }

    @PutMapping("/sith/{index}")
    public String getSith(@PathVariable int index,
                             @RequestBody Sith newSith) {
        if (index < sith.size()) {
            sith.set(index, newSith);
            return "Filme atualizado com sucesso";
        }else{
            return "Filme não encontrado";
        }
    }
}
