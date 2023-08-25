package Modulo2.Exercicio4;

public class Circulo extends FiguraGeometrica {
    int raio;
    float pi = (float) 3.14;

    public Circulo(String nome, int raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double calculo = pi * raio * raio;

        String resultadoFormatado = String.format("%.2f", calculo);
        System.out.println("Àrea do Circulo:" + resultadoFormatado);
    }

}
