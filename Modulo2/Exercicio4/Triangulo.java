package Modulo2.Exercicio4;

public class Triangulo extends FiguraGeometrica {
    int base;
    int altura;

    public Triangulo(String nome, int base, int altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        int area = base * altura * 2;
        System.out.println("Àrea do Triângulo:" + area);

    }

}
