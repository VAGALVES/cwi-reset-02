package exercicio.um;

public class Aplicacao {
    public static void main(String[] args) {
        Diretor diretor1 = new Diretor("Rob Cohen",50,6);
        Diretor diretor2 = new Diretor("Sam Raimi",45,15);

        Filme filme01 = new Filme("Velozes e Furiosos", "Filme de aventura, vencedor de 2 Oscars", 2001, 130,
                4,diretor1);


        Filme filme02 = new Filme("Spider man", "Melhor filme (2002)", 2002, 105,
                4,diretor2);

        filme01.reproduzir();
        filme02.reproduzir();
    }
}
