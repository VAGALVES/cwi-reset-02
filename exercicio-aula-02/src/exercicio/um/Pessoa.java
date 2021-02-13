package exercicio.um;

public class Pessoa {
    private String nome;
    private int idade;
    private Genero genero;

    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: "+this.nome+"\nIdade: "+this.idade+"\nGênero: "+this.genero.getDescricao());
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }
}

