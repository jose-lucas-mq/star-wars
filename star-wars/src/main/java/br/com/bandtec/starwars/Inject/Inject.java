package br.com.bandtec.starwars.Inject;


import br.com.bandtec.starwars.Class.Elenco;
import br.com.bandtec.starwars.Class.Estudio;

import java.util.List;

public class Inject {
    private static Estudio estudio = new Estudio();

    public static Estudio getEstudio() {
        return estudio;
    }
}
