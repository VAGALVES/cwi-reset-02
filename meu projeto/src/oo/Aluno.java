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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    //System.out.println( notaFinal >= 7? "Aluno está aprovado!": "Aluno está reprovado!")
}

