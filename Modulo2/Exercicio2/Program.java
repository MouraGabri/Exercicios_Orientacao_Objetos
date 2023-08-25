package Modulo2.Exercicio2;

public class Program {
    // Crie uma classe chamada "Calculadora" com um método sobrecarregado chamado
    // "somar()". O método "somar()" deve receber dois inteiros e retornar a soma
    // deles. Crie outras versões do método "somar()" que aceitem dois números
    // decimais, uma lista de inteiros e uma lista de números decimais como
    // argumentos.
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma de Inteiros:" + calculadora.somar(10, 10));
        System.out.println("Soma de Decimais:" + calculadora.somar(10.15, 10.15));

        int[] inteiros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int resultado = calculadora.soma(inteiros);
        System.out.println("Soma de Inteiros:" + resultado);
        double[] decimais = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        double resultadoArrayDouble = calculadora.soma(decimais);
        System.out.println("Soma de Decimais:" + resultadoArrayDouble);
    }

}
