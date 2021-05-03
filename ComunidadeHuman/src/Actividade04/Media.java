package Actividade04;

import java.util.Scanner;


public class media {
private static Scanner scan;

  public static void main(String[] args) {
  
   scan = new Scanner(System.in);
   double[] notas = new double [4];
   
   double soma =0;
   for(int i=0; i<notas.length; i++){
     System.out.println("Digite a "+(i+1)+" nota");
     notas[i] = scan.nextDouble();
     soma+=notas[i];
   }
   System.out.println("A média é: " + (soma/4));
   
  }
}
