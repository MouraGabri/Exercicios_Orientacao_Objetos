package Modulo2.Exercicio3;

public class Program {
    // Crie uma classe chamada "Animal" com um construtor que receba o nome do
    // animal como parâmetro. Defina um método chamado "emitirSom()" que imprime uma
    // mensagem genérica. Crie classes derivadas de "Animal", como "Cachorro",
    // "Gato" e "Vaca", que sobrescrevam o método "emitirSom()" para imprimir sons
    // específicos para cada tipo de animal.
    public static void main(String[] args) {
        Vaca vaca = new Vaca("Lila");
        System.out.println("Vaca:" + vaca.nome);
        vaca.emitirSom();
        System.out.println();

        Gato gato = new Gato("Geromel");
        System.out.println("Gato:" + gato.nome);
        gato.emitirSom();
        System.out.println();

        Cachorro cachorro = new Cachorro("Bella");
        System.out.println("Cachorro:" + cachorro.nome);
        cachorro.emitirSom();

    }

}
