package decisao;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/*Faça um programa que leia três números e mostre-os em
		 * ordem decrescente.
		 */

		Scanner ler = new Scanne(System.in);
		
		System.out.println("Digite o 1º número: ");
		int num1 = ler.nextInt();
		
		System.out.println("Digite o 2º número: ");
		int num2 = ler.nextInt();
		
		System.out.println("Digite o 3º número:");
		int num3 = ler.nextInt();
		
		if(num1 < num2 && num1 < num3 && num2 < num3){
			System.out.println(num3 + "-" + num2 + "-" + num1);
		}else if(num1 < num2 && num1 < num3 && num3 < num2){
			System.out.println(num2 + "-" + num3 + "-" + num1);
		}else if(num2 < num1 && num2 < num3 && num1 < num2){
			System.out.println(num3 + "-" + num1 + "-" + num2);
		}
	}

}
