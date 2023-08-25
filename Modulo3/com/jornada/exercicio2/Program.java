package Modulo3.com.jornada.exercicio2;

public class Program {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(67, "Gabriel Moura", 2000.0);
        contaBancaria.depositar(1000);
        contaBancaria.sacar(100);

    }
}
