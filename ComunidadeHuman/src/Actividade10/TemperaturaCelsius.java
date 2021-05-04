package Actividade10;

/*
 * 10 - Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
 */
import java.util.Scanner;

public class TemperaturaCelsius {
	private static Scanner scan;

	public static void main(String[] args) {
		double f, c;
		scan = new Scanner(System.in);

		System.out.println("informe a temperatura em graus Celsius");
		c = scan.nextDouble();
		
		f = (9 * c )/ 5 + 32;

		System.out.println("A temperatura em graus Fahrenheit é " + f);

	}

}
