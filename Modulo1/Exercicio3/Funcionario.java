package Modulo1.Exercicio3;

//  Crie uma classe chamada "Funcionário" que possua atributos como nome e salário, 
// e um método chamado "calcularSalário" que retorne o salário total e receba o bônus do funcionario e 
// o desconto do salário em porcentagem. Em seguida, crie um objeto chamado "gerente" e outro "desenvolvedor"". 
// O objeto gerente deve chamar o método calcularSalario passando o bônus de 10% com um bônus ao salário total e o 
// desconto de 15%, enquanto a classe desenvolvedor não deve ter bonificação e o desconto é de 10% .
public class Funcionario {
    String nome;
    double salario;

    double calcularSalario(double bonus, double descontoSalario) {
        double salarioTotal = salario + (salario * bonus / 100);
        double valorDesconto = salarioTotal * descontoSalario / 100;
        double salarioFinal = salarioTotal - valorDesconto;

        System.out.println("Salário com " + bonus + "% de bônus: " + salarioTotal);
        System.out.println("Salário com " + descontoSalario + "% de desconto: " + salarioFinal);

        return salarioFinal;
    }

}
