package entities;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		/*EX DE PROGRAMA SEM ORIENTAÇÃO A OBJETO(SEM CLASE)
		 * Programa criado pra ler os 3 lados de dois triangulos
		 * Exibir a area de cada um
		 * E declarar a maior area*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xa, xb, xc, ya, yb, yc;

		System.out.println("informe as medidas do triangulo X: ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		System.out.println("informe as medidas do triangulo Y: ");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		double p = (xa + xb + xc) / 2.0;
		double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
		
		p = (ya + yb + yc) / 2.0;
		double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
		
		System.out.printf("AREA TRIANGULO X: " + "%.4f%n", areaX);
		System.out.printf("AREA TRIANGULO Y: " + "%.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("O Triangulo com maior area é o X");
		}
		else if (areaX < areaY) {
			System.out.println("O Triangulo com maior area é o Y");
		}
		else if (areaX == areaY) {
			System.out.println("Os Triangulos tem a mesma area");
		}
		
		sc.close();
	}

}
