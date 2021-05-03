package Actividade05;

import java.util.Scanner;

public class ConvertorMetroCentimento {
private static Scanner scan;
	public static void main(String[] args) {
		double m, convert;
		double  cm=100;
		
		scan = new Scanner(System.in);
		
		System.out.println("Informe o metro");
		m = scan.nextDouble();
		
		convert = m*cm;
		
		System.out.print(m + " metro é igual a " + convert+" Centimentro");

	}

}
