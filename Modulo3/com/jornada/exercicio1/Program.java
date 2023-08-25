package Modulo3.com.jornada.exercicio1;

public class Program {
    public static void main(String[] args) {

		Retangulo retangulo1 = new Retangulo();
		retangulo1.setaltura(1.00);
		retangulo1.setlargura(1.00);
		System.out.println(retangulo1.toString());
		retangulo1.calcularArea();
		retangulo1.calcularPerimetro();
		System.out.println("____________________________________________");

		Retangulo retangulo2 = new Retangulo();
		retangulo2.setaltura(1.00);
		retangulo2.setlargura(1.00);
		System.out.println(retangulo2.toString());
		retangulo2.calcularArea();
		retangulo2.calcularPerimetro();
		System.out.println("Largura e altura de retangulo1 e retangulo2 são iguais:?" + retangulo1.equals(retangulo2));

	}

}

}
