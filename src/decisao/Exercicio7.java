package decisao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// 7. Faça um Programa que leia três números e mostre o maior e o menor deles.
		
Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3){
			System.out.println("O primeiro número é o maior: " + num1);
		}else if(num2 > num1 && num2 > num3){ 
			System.out.println("O segundo número é o maior: " + num2);
		}else if(num3 > num1 && num3 > num2){
			System.out.println("O terceiro número é o maior: " + num3);
		}
			
		if(num1 < num2 && num1 < num3){
				System.out.println("O primeiro número é o menor: " + num1);
			}else if(num2 < num1 && num2 < num3){ 
				System.out.println("O segundo número é o menor: " + num2);
			}else if(num3 < num1 && num3 < num2){
				System.out.println("O terceiro número é o menor: " + num3);
			}else if(num1 == num2 && num1 == num3 ||
					 num2 == num1 && num2 == num3 ||
					 num3 == num1 && num3 == num2){
				System.out.println("Os números são iguais: ");
			}
		
	}

}
