package Modulo2.Exercicio4;

// Crie uma classe chamada "FiguraGeometrica" com um construtor que receba o nome da figura
//  como parâmetro. Defina um método abstrato chamado "calcularArea()". Crie classes derivadas 
//  de "FiguraGeometrica", como "Circulo", "Retangulo" e "Triangulo", que implementem o método
//   "calcularArea()" para calcular a área de cada figura.
public class Program {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo("Triângulo", 10, 5);
        triangulo.calcularArea();
        System.out.println("_____________________________");
        Retangulo retangulo = new Retangulo("Retângulo", 5, 10);
        retangulo.calcularArea();
        System.out.println("_____________________________");
        Circulo circulo = new Circulo("Circulo", 10);
        circulo.calcularArea();

    }
}
