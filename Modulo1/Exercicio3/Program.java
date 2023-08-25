package Modulo1.Exercicio3;

public class Program {

    // Crie uma classe chamada "Funcionário" que possua atributos como nome e
    // salário,
    // e um método chamado "calcularSalário" que retorne o salário total e receba o
    // bônus do funcionario e
    // o desconto do salário em porcentagem. Em seguida, crie um objeto chamado
    // "gerente" e outro "desenvolvedor"".
    // O objeto gerente deve chamar o método calcularSalario passando o bônus de 10%
    // com um bônus ao salário total e o
    // desconto de 15%, enquanto a classe desenvolvedor não deve ter bonificação e o
    // desconto é de 10% .
    public static void main(String[] args) {

        Funcionario gerente = new Funcionario();
        gerente.nome = "Marcos Silva";
        gerente.salario = 1500.00;
        System.out.println("Gerente:" + gerente.nome);
        System.out.println("Salário:" + gerente.salario);
        gerente.calcularSalario(10, 15);
        System.out.println("___________________________________________");

        Funcionario desenvolvedor = new Funcionario();
        desenvolvedor.nome = "Dev Gabriel Moura";
        desenvolvedor.salario = 4000.00;
        System.out.println("Desenvolvedor:" + desenvolvedor.nome);
        System.out.println("Salário:" + desenvolvedor.salario);
        desenvolvedor.calcularSalario(0, 10);
    }
}
