package br.com.bandtec.starwars;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("star-wars/")
public class StarWarsController {
    Filme aNewHope = new Filme("Uma nova Esperança",
            "A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader.",
            "George Lucas", 125);

    Filme attackOfClones = new Filme("Ataque dos clones",
            "Tentado por promessas de poder, Anakin Skywalker se aproxima de Darth Sidious e participa de um plano para acabar com os Cavaleiros Jedi.",
            "George Lucas", 122);

    Filme theLastJedi = new Filme("Os Útilmos Jedi",
                        "A tranquila e solitária vida de Luke Skywalker sofre uma reviravolta quando ele conhece Rey, uma jovem que mostra fortes sinais da Força.",
                          "Rian Johnson", 152);

    @PostMapping("/jedi/")
    public Jedi addJedi(@RequestBody Jedi jedi){
        aNewHope.addPersonagem(jedi);
        System.out.println("Personagem adicionado com sucesso");
        return jedi;
    }

//    @GetMapping("/comissao/{id}")
//    public Double comissao(@PathVariable Integer id){
//
//    }


}
