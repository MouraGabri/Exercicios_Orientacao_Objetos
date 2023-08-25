package Modulo2.Exercicio1;

public class Moto extends Veiculo {
    int velocidade;

    @Override
    public void acelerar() {
        velocidade = velocidade + 55;
        System.out.println("Sua Moto aumentou a velocidade para:" + velocidade + ("Km/h"));

    }

}
