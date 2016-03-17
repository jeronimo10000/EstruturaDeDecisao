package decisao;

import java.util.Scanner;

public class Exercicio4 {

	private static Scanner ler;

	public static void main(String[] args) {
		//4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

		ler = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = ler.next();
		
		if(letra.length() > 1){
			System.out.println("Não é uma letra válida!");
		}else {
			switch(letra){
			case "a":
			case "e":
			case "i":	
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U":System.out.println("A letra digitada é vogal!"); break;
			default: System.out.println("A letra digitada é cosoante!");
			}
		}
		
		/*if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
				letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o") ||
				letra.equalsIgnoreCase("u")){
			System.out.println("A letra digitada é vogal!");	
		}else {
			System.out.println("A letra digitada é cosoante!");
		}*/
	}

}
