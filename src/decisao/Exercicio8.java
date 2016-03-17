package decisao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		/*Faça um programa que pergunte o preço de três produtos e informe qual
		 *produto você deve comprar, sabendo que a decisão é sempre pelo mais
		 *barato. 
		 */
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite o preço do primeiro produto: ");
		double produto1 = ler.nextDouble();
		
		System.out.println("Digite o preço do segundo produto: ");
		double produto2 = ler.nextDouble();
		
		System.out.println("Digite o preço do terceiro produto: ");
		double produto3 = ler.nextDouble();
		
		if(produto1 < produto2 && produto1 < produto3){
			System.out.println("Você deve compra o primeiro produto: " + produto1);
		}else if(produto2 < produto1 && produto2 < produto3){ 
			System.out.println("Você deve compra o segundo produto: " + produto2);
		}else if(produto3 < produto1 && produto3 < produto2){
			System.out.println("Você deve compra o terceiro produto: " + produto3);
		}
	}

}