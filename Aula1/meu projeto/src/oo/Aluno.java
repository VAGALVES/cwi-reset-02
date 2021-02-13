package oo;

public class Aluno {

    private String nome;
    private int notaFinal;
    private final String situacaoDoAluno = getSituacaoDoAluno();

    public Aluno(String nome, int notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public String getSituacaoDoAluno() {
        String s = (notaFinal >= 7)?"aprovado(a).":"reprovado(a).";
        return s;
    }
}

