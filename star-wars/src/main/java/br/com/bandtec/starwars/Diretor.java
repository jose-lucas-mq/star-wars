package br.com.bandtec.starwars;

public class Diretor implements Comissao{
    private String nome;
    private Integer avaliacao;
    private Double custoBase;

    public String getNome() {
        return nome;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public Double getCustoBase() {
        return custoBase;
    }

    public Diretor(String nome, Integer avaliacao, Double custoBase) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.custoBase = custoBase;
    }

    @Override
    public Double comissao() { return (custoBase * avaliacao) / 10; }

    public Double getComissao(){ return comissao(); }
}
