package br.com.bandtec.starwars.Class;

import br.com.bandtec.starwars.Metods.Crud;

import java.util.ArrayList;
import java.util.List;

public class Estudio implements Crud {
    private List<Filme> filmes;

    public Estudio() {
        this.filmes = new ArrayList<>();
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    @Override
    public void create(Object obj) {
        filmes.add((Filme) obj);
    }

    @Override
    public void delete(int index) {
        filmes.get(index);
    }

    @Override
    public void update(int index, Object obj) {
        filmes.set(index, (Filme) obj);
    }
}
