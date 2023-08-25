package Modulo2.Exercicio4;

public class Retangulo extends FiguraGeometrica {
    int base;
    int altura;

    public Retangulo(String nome, int base, int altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        int area = base * altura;
        System.out.println("Àrea do retângulo:" + area);
    }

}
