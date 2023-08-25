package Modulo3.com.jornada.exercicio1;

public class Retangulo {
    private Double largura;
    private Double altura;

    public double getlargura() {
        return this.largura;
    }

    public double getaltura() {
        return this.altura;
    }

    public void setlargura(double largura) {
        System.out.println("Largura:" + largura);
        this.largura = largura;

    }

    public void setaltura(double altura) {
        System.out.println("Altura:" + altura);

        this.altura = altura;
    }

    public void calcularArea() {
        double area = largura * altura;
        System.out.println("A area do Retângulo é:" + area);

    }

    public void calcularPerimetro() {
        double perimetro = 2 * (largura + altura);
        System.out.println("O Perímetro do  Retângulo é:" + perimetro);
    }

    public String toString() {
        return "Retângulo [Largura =" + largura + " Altura=" + altura + "]";

    }

    @Override
    public boolean equals(Object obj) {
        Retangulo retanguloComparado = (Retangulo) obj;// comparação de cast
        boolean comparacao = this.altura.equals(retanguloComparado.largura);
        return comparacao;
    }

}
