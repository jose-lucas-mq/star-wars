package br.com.bandtec.starwars;

public class Sith extends Personagem{
    private Boolean imortal;

    public Sith(String nome, Integer tempoTela, String corSabre, Integer forca, String conviccao, String planetaNatal, Double salarioBase, Boolean imortal) {
        super(nome, tempoTela, corSabre, forca, conviccao, planetaNatal, salarioBase);
        this.imortal = imortal;
    }

    @Override
    public Double comissao() {
        return salarioBase * tempoTela;
    }
}
