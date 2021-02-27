package br.com.bandtec.starwars;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private String descricao;
    private String diretor;
    private Integer duracao;


    public Filme(String titulo, String descricao, String diretor, Integer duracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.diretor = diretor;
        this.duracao = duracao;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDiretor() {
        return diretor;
    }

    public Integer getDuracao() {
        return duracao;
    }
}
