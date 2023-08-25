package Modulo2.Exercicio5;

public class Program {
    // Crie uma classe chamada "Pessoa" com atributos nome, idade e altura. Defina
    // um construtor padrão e um construtor que receba o nome e a idade como
    // parâmetros. Crie uma classe derivada de "Pessoa" chamada "Atleta" com um
    // atributo adicional chamado "esporte" e um construtor que receba todos os
    // atributos como parâmetros. Teste a criação de objetos das classes "Pessoa" e
    // "Atleta" e exiba suas informações.
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Anne", 20);
        System.out.println();
        Atleta atleta = new Atleta("Gabriel", 20, 1.70, "Futebol");
    }
}
