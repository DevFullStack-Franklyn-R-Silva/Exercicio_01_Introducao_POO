package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rectangle width and height: ");
		System.out.println("width: ");
		
		double largura = sc.nextDouble();
		System.out.println("height: ");
		double altura = sc.nextDouble();
		
		Retangulo retangulo = new Retangulo(largura, altura);
		System.out.printf("AREA = %.2f\n",retangulo.area());
		System.out.printf("PERIMETRO = %.2f\n",retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f\n",retangulo.diagonal());
		
		sc.close();
	}

}
