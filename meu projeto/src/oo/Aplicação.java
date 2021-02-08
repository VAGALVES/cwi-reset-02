package oo;

public class Aplicação {
    public static void main(String[] args) {

        //Execício 1
        /*System.out.println("Exercício 1: classe calculadora");
        Calculadora calculadora = new Calculadora();

        int resultadoSoma1 = calculadora.soma(8,2);
        int resultadoSoma2 = calculadora.soma(6,3);
        int resultadoSubtracao1 = calculadora.subtracao(8,2);
        int resultadoSubtracao2 = calculadora.subtracao(6,3);
        int resultadoDivisao1 = calculadora.divisao(8,2);
        int resultadoDivisao2 = calculadora.divisao(6,3);
        int resultadoMultiplicacao1 = calculadora.multiplicacao(8,2);
        int resultadoMultiplicacao2 = calculadora.multiplicacao(6,3);

        System.out.println(resultadoSoma1);
        System.out.println(resultadoSoma2);
        System.out.println(resultadoSubtracao1);
        System.out.println(resultadoSubtracao2);
        System.out.println(resultadoDivisao1);
        System.out.println(resultadoDivisao2);
        System.out.println(resultadoMultiplicacao1);
        System.out.println(resultadoMultiplicacao2);
        System.out.println("");*/

        //Exercício 2
        System.out.println("Exercício 2: classe Comparador");
        Comparador comparador = new Comparador();
        boolean resultadoComparador1 = comparador.menorQue(1, 2);
        boolean resultadoComparador2 = comparador.menorQue(1, 1);
        boolean resultadoComparador3 = comparador.menorQue(2, 1);
        System.out.println("É menor? "+resultadoComparador1);
        System.out.println("É menor? "+resultadoComparador2);
        System.out.println("É menor? "+resultadoComparador3);
        System.out.println("");

    }
}
