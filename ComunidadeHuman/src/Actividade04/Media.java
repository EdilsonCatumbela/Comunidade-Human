package Actividade04;

import java.util.Scanner;

/* ACTIVIDADE 04
 * 4 - Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
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
		System.out.println("A m�dia bimestral �: " + (soma / 4));

	}

}
