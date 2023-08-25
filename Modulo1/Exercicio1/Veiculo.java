package Modulo1.Exercicio1;

public class Veiculo {

    // Crie uma classe base chamada "Veículo" que possua atributos: nome, cor,
    // número de rodas, e velocidade. Crie também um método chamado mover e outro
    // chamado frear, sendo que o método mover aumenta 50km/h a velocidade, já o
    // metodo frear diminui 25km/h a velocidade. Criei também outro método que
    // imprima todos os atributos da classe. Crie ao menos 2 objetos e teste os
    // métodos.

    String nome;
    String cor;
    int numeroRodas;
    double velocidade;

    void moverVelocidade() {
        double velocidadeAtual = velocidade + 50;
        System.out.println("Sua velocide aumentou para:" + velocidadeAtual + ("Km/h"));

    }

    void diminuirVelocidade() {
        double diminuirVelocidade = velocidade - 25;
        System.out.println("Sua velocidade diminiuir para:" + diminuirVelocidade + ("Km/h"));
    }

    void caracteristicasDoVeiculo() {
        System.out.println("Nome:" + nome);
        System.out.println("Cor:" + cor);
        System.out.println("Número de rodas:" + numeroRodas);
        System.out.println("Velocidade:" + velocidade + ("Km/h") + ("\n"));
    }

}
