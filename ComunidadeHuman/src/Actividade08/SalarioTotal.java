package Actividade08;
/*
 * 8 - Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
 */
import java.util.Scanner;

public class SalarioTotal {
private static Scanner scan;
	public static void main(String[] args) {
		double salario, hora, totalHora;
		scan = new Scanner(System.in);
		
		System.out.println("informe quando ganha por hora");
		salario = scan.nextDouble();
		System.out.println("informe o n�mero de horas trabalhadas no m�s");
		hora = scan.nextDouble();
		
		totalHora = salario*hora;
		
		System.out.println("O total de sal�rio no m�s �: " + totalHora);
		
	}

}
