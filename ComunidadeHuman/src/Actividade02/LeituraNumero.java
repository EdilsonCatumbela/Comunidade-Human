package Actividade02;

import java.util.Scanner;

public class LeituraNumero {
private static Scanner scan;
	public static void main(String[] args) {
		int numero;
		scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		numero = scan.nextInt();
		
		System.out.println("O n�mero que voc� digitou � " + numero);
		
		

	}

}
