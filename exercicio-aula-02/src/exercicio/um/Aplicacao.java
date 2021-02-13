package exercicio.um;

public class Aplicacao {
    public static void main(String[] args) {
        Diretor diretor1 = new Diretor("Rob Cohen",50,6,Genero.MASCULINO);
        Diretor diretor2 = new Diretor("Sam Raimi",45,15,Genero.MASCULINO);
        Ator ator1 = new Ator("Vin Disel",48,0,Genero.MASCULINO);
        Ator ator2 = new Ator("Tobey Maguire",36,0,Genero.MASCULINO);

        Filme filme01 = new Filme("Velozes e Furiosos", "Filme de aventura, vencedor de 2 Oscars", 2001, 130,
                4,diretor1);


        Filme filme02 = new Filme("Spider man", "Melhor filme (2002)", 2002, 105,
                5,diretor2);

        System.out.println("Informações");
        System.out.println("");
        filme01.reproduzir();
        System.out.println("");
        System.out.println("Protagonista");
        ator1.exibirInformacoes();
        System.out.println("Diretor");
        diretor1.exibirInformacoes();
        System.out.println("--------------------");

        System.out.println("Informações");
        System.out.println("");
        filme02.reproduzir();
        System.out.println("");
        System.out.println("Protagonista");
        ator2.exibirInformacoes();
        System.out.println("Diretor");
        diretor2.exibirInformacoes();
        System.out.println("--------------------");
    }
}
