package Actividade11;

import java.util.Scanner;

/*
 * 11 - Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre:
 *- o produto do dobro do primeiro com metade do segundo .
 *- a soma do triplo do primeiro com o terceiro.
 *- o terceiro elevado ao cubo.
 * 
 */
public class CalculoTresNumeros {
	private static Scanner scan;

	public static void main(String[] args) {
		int a, b;
		double c, p, s, cb;
		scan = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero inteiro");
		a = scan.nextInt();
		System.out.println("Informe o segundo n�mero inteiro");
		b = scan.nextInt();
		System.out.println("Informe o segundo n�mero inteiro");
		c = scan.nextDouble();

		p = (2 * a) * (b / 2);
		s = 3 * a + c;
		cb = c * c * c;

		System.out.println("O dobro do primeiro com metade do segundo � " + p);
		System.out
				.println("A soma do triplo do primeiro com o terceiro � " + s);
		System.out.println("O terceiro elevado ao cubo � " + cb);

	}

}
