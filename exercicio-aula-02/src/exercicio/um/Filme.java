package exercicio.um;

public class Filme {
    private String nome;
    private String descricao;
    private Integer duracao;
    private Integer anoDeLancamento;
    private Integer avaliacao;
    private Diretor diretor;

    public Filme(String nome, String descricao, Integer anoDeLancamento, Integer duracao, Integer avaliacao, Diretor diretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoDeLancamento = anoDeLancamento;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }

    public void reproduzir(){
            System.out.println("Nome do Filme: " + this.nome);
            System.out.println("Descrição: " + this.descricao);
            System.out.println("Avaliação: " + this.avaliacao);
            System.out.println("Duração: " + this.duracao + " min.");
            System.out.println("Nome do Diretor: " + this.diretor.getNome());
        }
    private void defineAvaliacao(Integer avaliacao) {
        if (avaliacao < 1 || avaliacao > 5) {
            this.avaliacao = 3;
        } else {
            this.avaliacao = avaliacao;
        }
    }

    private void validaNomeEDefineAvaliacao() {
        if ("Batman vs Superman".equals(nome)) {
            this.avaliacao = 1;
        } else if ("Interestelar".equals(nome)) {
            this.avaliacao = 5;
        }
    }
}


