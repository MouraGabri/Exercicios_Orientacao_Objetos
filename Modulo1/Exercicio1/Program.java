package Modulo1.Exercicio1;

public class Program {
    // Crie uma classe base chamada "Veículo" que possua atributos: nome, cor,
    // número de rodas, e velocidade. Crie também um método chamado mover e outro
    // chamado frear, sendo que o método mover aumenta 50km/h a velocidade, já o
    // metodo frear diminui 25km/h a velocidade. Criei também outro método que
    // imprima todos os atributos da classe. Crie ao menos 2 objetos e teste os
    // métodos.
    public static void main(String[] args) {
        Veiculo veiculoPreto = new Veiculo();
        veiculoPreto.nome = "Fusion";
        veiculoPreto.cor = " Preto";
        veiculoPreto.numeroRodas = 4;
        veiculoPreto.velocidade = 100;

        veiculoPreto.caracteristicasDoVeiculo();
        veiculoPreto.moverVelocidade();
        veiculoPreto.diminuirVelocidade();
        System.out.println("_________________________________________");

        Veiculo veiculoBranco = new Veiculo();
        veiculoBranco.nome = "Skyline R34";
        veiculoBranco.cor = "Branco";
        veiculoBranco.numeroRodas = 4;
        veiculoBranco.velocidade = 160;
        veiculoBranco.caracteristicasDoVeiculo();
        veiculoBranco.moverVelocidade();
        veiculoBranco.diminuirVelocidade();
    }

}