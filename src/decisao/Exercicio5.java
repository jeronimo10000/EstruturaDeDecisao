package decisao;

import java.util.Scanner;

public class Exercicio5 {

	private static Scanner ler;

	public static void main(String[] args) {
		/*Faça um programa para a leitura de duas notas parciais de um aluno.
		 *O programa deve calcular a média alcançada por aluno e apresentar:
		 *
		 * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		 * A mensagem "Reprovado", se a média for menor do que sete;
		 * A mensagem "Aprovado com Distinção", se a média for igual a dez.
		 */
		//jkjlkjljljl
		
		ler = new Scanner(System.in);
		
		System.out.println("Digite a nota 1");
		double nota1 = ler.nextDouble();
		
		System.out.println("Digite a nota 2");
		double nota2 = ler.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if( media == 10){
			System.out.println("Aprovaod com Distinção!" + " Média " + media);
		}else if (media >= 7){
			System.out.println("Aprovado!" + " Média " + media);
		}else if (media < 7){
			System.out.println("Reprovado!" + " Média " + media);
		}

	}

}
