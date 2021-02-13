package exercicio.um;

import java.sql.SQLOutput;

public class Filme {
    private String nome;
    private String descricao;
    private int anoDeLancamento;
    private double duracao;
    private int avaliacao;
    private Diretor diretor;

    public Filme(String nome, String descricao, int anoDeLancamento, double duracao, int avaliacao, Diretor diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoDeLancamento = anoDeLancamento;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }

    public void reproduzir(){
        System.out.println("Nome do filme: "+this.nome);
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Duração: "+this.duracao);
        System.out.println("Diretor: "+diretor.getNome());
        System.out.println("");
    }
}



