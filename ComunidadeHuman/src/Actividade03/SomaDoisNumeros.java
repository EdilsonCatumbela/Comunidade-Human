package Actividade03;

import java.util.Scanner;

public class SomaDoisNumeros {
	private static Scanner scan;

	public static void main(String[] args) {
		int a, b, result;
		scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = scan.nextInt();
		result = a+b;
		System.out.println("A soma dos n�meros �: " + result);

	}
}
