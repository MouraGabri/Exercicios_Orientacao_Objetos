package Modulo3.com.jornada.exercicio2;

public class ContaBancaria implements Sacavel, Depositavel {
    private Double saldo;
    private String nome;
    private Integer numeroConta;

    public ContaBancaria(Integer numeroConta, String nome, Double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double saque) {
        saldo = getSaldo() - saque;
        System.out.println(
                "Cliente: " + getNome() + "\nNumero da Conta: " + getNumeroConta() + "\nSaldo Atual: " + getSaldo());
        System.out.println("Valor Sacado: " + saque);

    }

    @Override
    public void depositar(double deposito) {
        saldo = getSaldo() + deposito;

        System.out.println("Cliente: " + getNome() + "\nNumero da Conta: " + getNumeroConta() + "\nSaldo Atual: "
                + getSaldo() + "\n");
    }
}
