package Actividade07;

/*
 * 7 - Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.
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
		
		System.out.println("A �rea do quadrado � "+area);
		System.out.println("O dobro da �rea � "+quadradoArea);
		
		

	}

}
