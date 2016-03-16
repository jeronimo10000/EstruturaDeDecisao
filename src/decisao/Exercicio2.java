package decisao;

import java.util.Scanner;

public class Exercicio2 {

	private static Scanner ler;

	public static void main(String[] args){
		
		/*Faça um Programa que peça um valor e 
		mostre na tela se o valor é positivo ou negativo.*/
		
		ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num = ler.nextDouble();
		
		if (num >= 0){
			System.out.println("O número digitado é positivo");
		}else {
			System.out.println("O número digitado é negativo");
		}
		
	}
}
