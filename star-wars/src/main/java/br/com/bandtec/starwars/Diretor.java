package br.com.bandtec.starwars;

public class Diretor implements Comissao{
    private String nome;
    private Integer avaliacao;
    private Double custoBase;

    public Diretor(String nome, Integer avaliacao, Double custoBase) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.custoBase = custoBase;
    }

    @Override
    public Double comissao() {
        return custoBase * (avaliacao / 100);
    }
}
