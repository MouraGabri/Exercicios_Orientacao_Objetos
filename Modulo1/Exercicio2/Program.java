package Modulo1.Exercicio2;

public class Program {

    public static void main(String[] args) {
        Animal cachorro = new Animal();
        cachorro.nome = "Cachorro";
        cachorro.idade = 10;
        cachorro.som = "AuAu";

        System.out.println("Nome:" + cachorro.nome);
        System.out.println("Idade:" + cachorro.idade + (" anos"));
        System.out.println("Som:" + cachorro.som);
        cachorro.emitirSom();
        System.out.println("_______________________________________");

        Animal gato = new Animal();
        gato.nome = "Gato";
        gato.idade = 5;
        gato.som = "Miau";
        System.out.println("Nome:" + gato.nome);
        System.out.println("Idade:" + gato.idade + (" anos"));
        System.out.println("Som:" + gato.som);
        gato.emitirSom();
        System.out.println("_______________________________________");

        Animal passaro = new Animal();
        passaro.nome = "Passáro";
        passaro.idade = 2;
        passaro.som = "Bem-Te-Vi";

        System.out.println("Nome:" + passaro.nome);
        System.out.println("Idade:" + passaro.idade + (" anos"));
        System.out.println("Som:" + passaro.som);
        passaro.emitirSom();
        System.out.println("_______________________________________");

    }
}
