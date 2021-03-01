package br.com.bandtec.starwars.Class;

public class Sith extends Personagem{
    private Boolean imortal;

    public Sith(String nome,
                Integer tempoTela,
                String corSabre,
                Integer forca,
                String conviccao,
                String planetaNatal,
                Double salarioBase,
                Boolean imortal) {
        super(nome, tempoTela, corSabre, forca, conviccao, planetaNatal, salarioBase);
        this.imortal = imortal;
    }

    public Boolean getImortal() {
        return imortal;
    }

    @Override
    public Double comissao() { return (salarioBase * tempoTela) / 10; }

    public Double getComissao(){ return comissao(); }
}
