package Actividade02;
/*
 * 2 -Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
 */
import java.util.Scanner;

public class LeituraNumero {
private static Scanner scan;
	public static void main(String[] args) {
		int numero;
		scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		numero = scan.nextInt();
		
		System.out.println("O número que você digitou é " + numero);
		
		

	}

}
