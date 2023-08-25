package Modulo2.Exercicio5;

// Crie uma classe chamada "Pessoa" com atributos nome, idade e altura. Defina
// um construtor padrão e um construtor que receba o nome e a idade como
// parâmetros. Crie uma classe derivada de "Pessoa" chamada "Atleta" com um
// atributo adicional chamado "esporte" e um construtor que receba todos os
// atributos como parâmetros. Teste a criação de objetos das classes "Pessoa" e
// "Atleta" e exiba suas informações.
public class Atleta extends Pessoa {
    String esporte;

    public Atleta(String nome, int idade, double altura, String esporte) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.esporte = esporte;
        String resultadoFormatado = String.format("%.2f", altura);

        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade + "Anos");
        System.out.println("Altura:" + resultadoFormatado);
        System.out.println("Esporte:" + esporte);
    }
}
