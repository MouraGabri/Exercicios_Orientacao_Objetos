package Modulo2.Exercicio4;

// Crie uma classe chamada "FiguraGeometrica" com um construtor que receba o nome da figura
//  como parâmetro. Defina um método abstrato chamado "calcularArea()". Crie classes derivadas 
//  de "FiguraGeometrica", como "Circulo", "Retangulo" e "Triangulo", que implementem o método
//   "calcularArea()" para calcular a área de cada figura.
public class FiguraGeometrica {
    String nome;

    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }

    public void calcularArea() {
    }

}
