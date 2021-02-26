package br.com.bandtec.starwars;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private String descricao;
    private String diretor;
    private Integer duracao;

    public List <Comissao> comissao;

    public Filme(String titulo, String descricao, String diretor, Integer duracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.diretor = diretor;
        this.duracao = duracao;
        comissao = new ArrayList<>();
    }

    public void addPersonagem(Personagem p){
        comissao.add(p);
    }

    public String deletePersonagem(Integer index){
        Comissao producao = comissao.get(index);

        if((comissao.size() >= (index + 1))){
            comissao.remove(producao);
            return "Personagem excluído com sucesso";
        }else{
            return "Personagem não encontrado";
        }
    }

//    public Comissao exibePersonagens(){
//
//    }


}
