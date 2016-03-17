package decisao;

import java.util.Scanner;

public class Exercicio1 {

	private static Scanner ler;

	public static void main(String[] args) {
		
		//Faça um Programa que peça dois números e imprima o maior deles.
		
		ler = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = ler.nextInt();
		
		if (num1 > num2){
			System.out.println("O primeiro número é o maior!");
		}else {
			System.out.println("O segundo número é o maior!");
			
		}
	}
	
}
