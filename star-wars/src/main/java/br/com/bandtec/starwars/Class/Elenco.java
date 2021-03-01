package br.com.bandtec.starwars.Class;

import br.com.bandtec.starwars.Metods.Comissao;
import br.com.bandtec.starwars.Metods.Crud;

import java.util.ArrayList;
import java.util.List;

public class Elenco implements Crud {
    public List<Comissao> elenco;

    public Elenco() {
        this.elenco = new ArrayList<>();
    }

    public List<Comissao> getElenco() {
        return elenco;
    }

    @Override
    public void create(Object obj) {
        if (obj instanceof Jedi)
            elenco.add((Jedi) obj);
        else if (obj instanceof Sith)
            elenco.add((Sith) obj);
        else
            elenco.add((Diretor) obj);
    }

    @Override
    public void delete(int index) {
        elenco.remove(index);
    }

    @Override
    public void update(int index, Object obj) {
        if (obj instanceof Jedi)
            elenco.set(index, (Jedi) obj);
        else if (obj instanceof Sith)
            elenco.set(index,(Sith) obj);
        else
            elenco.set(index,(Diretor) obj);
    }

}
