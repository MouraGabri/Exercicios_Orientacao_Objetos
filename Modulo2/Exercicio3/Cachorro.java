package Modulo2.Exercicio3;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro " + nome + " emite o som:" + "AuAu");

    }

}
