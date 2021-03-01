package br.com.bandtec.starwars.Class;

import br.com.bandtec.starwars.Metods.Crud;

import java.util.ArrayList;
import java.util.List;

public class Filme implements Crud {
    private String titulo;
    private String descricao;
    private Integer duracao;

    public List<Elenco> elenco;


    public List<Elenco> getElenco() {
        return elenco;
    }

    public Filme(String titulo,
                 String descricao,
                 Integer duracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
        this.elenco = new ArrayList<>();

    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getDuracao() { return duracao; }


    @Override
    public void create(Object obj) {
        elenco.add((Elenco) obj);
    }

    @Override
    public void delete(int index) {
        elenco.get(index);
    }

    @Override
    public void update(int index, Object obj) {
        elenco.set(index, (Elenco) obj);
    }
}
