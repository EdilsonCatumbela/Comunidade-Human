package Actividade08;
/*
 * 8 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */
import java.util.Scanner;

public class SalarioTotal {
private static Scanner scan;
	public static void main(String[] args) {
		double salario, hora, totalHora;
		scan = new Scanner(System.in);
		
		System.out.println("informe quando ganha por hora");
		salario = scan.nextDouble();
		System.out.println("informe o número de horas trabalhadas no mês");
		hora = scan.nextDouble();
		
		totalHora = salario*hora;
		
		System.out.println("O total de salário no mês é: " + totalHora);
		
	}

}
