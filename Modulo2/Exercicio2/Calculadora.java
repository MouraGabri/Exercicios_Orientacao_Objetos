package Modulo2.Exercicio2;

// Crie uma classe chamada "Calculadora" com um método sobrecarregado chamado
// "somar()". O método "somar()" deve receber dois inteiros e retornar a soma
// deles. Crie outras versões do método "somar()" que aceitem dois números
// decimais, uma lista de inteiros e uma lista de números decimais como
// argumentos.
public class Calculadora {

    public int somar(int a, int b) {
        int soma = a + b;
        return soma;

    }

    public double somar(double a, double b) {
        double soma = a + b;

        return soma;

    }

    public int soma(int[] inteiros) {
        int soma = 0;
        for (int i = 0; i < inteiros.length; i++) {
            soma = soma + inteiros[i];
        }
        return soma;
    }

    public double soma(double[] decimais) {
        double soma = 0;
        for (int i = 0; i < decimais.length; i++) {
            soma = soma + decimais[i];

        }
        return soma;
    }

}
