package Actividade09;

import java.util.Scanner;

/*
 * 9 - Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
 *     C = 5 * ((F-32) / 9).
 */
public class TemperaturaFahrenheit {
	private static Scanner scan;

	public static void main(String[] args) {
		double f, c;
		scan = new Scanner(System.in);

		System.out.println("informe a temperatura em graus Fahrenheit");
		f = scan.nextDouble();

		c = 5 * ((f - 32) / 9);

		System.out.println("A temperatura em Celsius é " + c);

	}

}
