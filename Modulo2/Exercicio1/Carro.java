package Modulo2.Exercicio1;

public class Carro extends Veiculo {
    int velocidade;

    @Override
    public void acelerar() {
        velocidade = velocidade + 15;
        System.out.println("Seu Carro aumentou a velocidade para:" + velocidade + ("Km/h"));

    }

}
