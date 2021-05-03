package Actividade07;

/*
 * 7 - Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 */
import java.util.Scanner;

public class QuadradodaAreadoQuadrado {
	private static Scanner scan;

	public static void main(String[] args) {
		double lado, area, quadradoArea;
		scan = new Scanner(System.in);
		
		System.out.println("informe o lado do quadrado");
		lado = scan.nextDouble();
		
		area = lado*lado;
		quadradoArea = 2*area;
		
		System.out.println("A área do quadrado é "+area);
		System.out.println("O dobro da área é "+quadradoArea);
		
		

	}

}
