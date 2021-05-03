package Actividade06;

import java.util.Scanner;

/*
 *6 - Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 * A = π r2 
 */

public class AreaCirculo {
	private static Scanner scan;

	public static void main(String[] args) {
		double raio, area;
		scan = new Scanner(System.in);

		System.out.println("Informe o raío do círculo");
		raio = scan.nextDouble();

		area = Math.PI * (raio * raio);

		System.out.println("A área do círcilo é: " + area);

	}

}
