package br.com.bandtec.starwars.Controls;

import br.com.bandtec.starwars.Class.Estudio;
import br.com.bandtec.starwars.Class.Filme;
import org.springframework.web.bind.annotation.PostMapping;

import static br.com.bandtec.starwars.Inject.Inject.getEstudio;

public class FilmeController {
    Estudio estudio = getEstudio();

}
