package Modulo2.Exercicio3;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Gato " + nome + " emite o som:" + "Miau");
    }

}
