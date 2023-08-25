package Modulo2.Exercicio1;

public class Program {
    public static void main(String[] args) {
        // Crie uma classe abstrata chamada "Veiculo" com os atributos marca e modelo.
        // Defina um método abstrato chamado "acelerar()". Em seguida, crie duas
        // classes, "Carro" e "Moto", que herdem da classe "Veiculo" e implementem o
        // método "acelerar()" de maneiras diferentes.

        Carro carro = new Carro();
        carro.marca = "Nissan";
        carro.modelo = "Sedan";
        System.out.println("Carro");
        System.out.println("Marca:" + carro.marca);
        System.out.println("Modelo:" + carro.modelo);
        carro.acelerar();
        System.out.println();

        Moto moto = new Moto();
        System.out.println("Moto");
        moto.marca = "Honda";
        moto.modelo = " 500 cilindradas";
        System.out.println("Marca:" + moto.marca);
        System.out.println("Modelo:" + moto.modelo);
        moto.acelerar();
    }

}
