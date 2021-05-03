package Actividade04;

import java.util.Scanner;

/* ACTIVIDADE 04
 * 4 - Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */
public class Media {
	private static Scanner scan;

	public static void main(String[] args) {
		double notas[] = new double[4];
		scan = new Scanner(System.in);
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + " nota do bimestre");
			notas[i] = scan.nextDouble();
			soma += notas[i];

		}
		System.out.println("A média bimestral é: " + (soma / 4));

	}

}
