package br.com.bandtec.starwars;

public abstract class Personagem implements Comissao{
    public String nome;
    public Integer tempoTela;
    public String corSabre;
    public Integer forca;

    public Double getSalarioBase() {
        return salarioBase;
    }

    public String conviccao;
    public String planetaNatal;
    public Double salarioBase;

    public Personagem(String nome, Integer tempoTela, String corSabre, Integer forca, String conviccao, String planetaNatal, Double salarioBase) {
        this.nome = nome;
        this.tempoTela = tempoTela;
        this.corSabre = corSabre;
        this.forca = forca;
        this.conviccao = conviccao;
        this.planetaNatal = planetaNatal;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTempoTela() {
        return tempoTela;
    }

    public void setTempoTela(Integer tempoTela) {
        this.tempoTela = tempoTela;
    }

    public String getCorSabre() {
        return corSabre;
    }

    public void setCorSabre(String corSabre) {
        this.corSabre = corSabre;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {  this.forca = forca;  }

    public String getConviccao() {
        return conviccao;
    }

    public void setConviccao(String conviccao) {
        this.conviccao = conviccao;
    }

    public String getPlanetaNatal() {
        return planetaNatal;
    }

    public void setPlanetaNatal(String planetaNatal) {
        this.planetaNatal = planetaNatal;
    }
}
