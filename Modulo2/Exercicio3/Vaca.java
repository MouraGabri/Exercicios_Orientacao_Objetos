package Modulo2.Exercicio3;

public class Vaca extends Animal {

    public Vaca(String nome) {
        super(nome);
    }

    @Override

    public void emitirSom() {
        System.out.println("A vaca " + nome + " emite o som:" + "MUUU");

    }

}
