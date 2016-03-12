package decisao;

import java.util.Scanner;

public class Exercicio10 {

	private static Scanner ler;

	public static void main(String[] args) {
		/*Faça um programa que pergunte em que turno você estuda.
		 * Peça para digita M-matutino ou V-vespertino ou N-noturno.
		 * Imprima a mensagem "Bom Dia", "Boa Tarde" ou "Boa Noite" ou
		 * "Valor Inválido!", conforme o caso.
		 */
		
		System.out.println("Em que turno você estuda?");
		System.out.println("Digite M-matutino, V-vespertino ou N-noturno");
		
		ler = new Scanner(System.in);
		String turno = ler.next();
		
		switch(turno){
		
		case "m":
		case "M": System.out.println("Bom dia!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa Noite!"); break;
		default: System.out.println("Valor invalido!");
		
		}
		
	}

}
