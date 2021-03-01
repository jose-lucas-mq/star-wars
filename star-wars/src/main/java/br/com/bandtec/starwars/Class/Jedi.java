package br.com.bandtec.starwars.Class;

public class Jedi extends Personagem{
    private Integer nivelFidelidade;

    public Integer getNivelFidelidade() {
        return nivelFidelidade;
    }

    public Jedi(String nome,
                Integer tempoTela,
                String corSabre,
                Integer forca,
                String conviccao,
                String planetaNatal,
                Double salarioBase,
                Integer nivelFidelidade) {
        super(nome, tempoTela, corSabre, forca, conviccao, planetaNatal, salarioBase);
        this.nivelFidelidade = nivelFidelidade;
    }

    @Override
    public Double comissao() { return (salarioBase * tempoTela) / 10; }

    public Double getComissao(){ return comissao(); }
}
