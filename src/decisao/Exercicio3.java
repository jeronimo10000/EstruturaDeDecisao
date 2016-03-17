package decisao;

import java.util.Scanner;

public class Exercicio3 {

	private static Scanner ler;

	public static void main(String[] args){
		
		/*3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
		 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		 */
		
		ler = new Scanner(System.in);
		
		System.out.println("Digite uma letra F para feminino ou M para masculino!");
		String input = ler.next();
		
		if(input.equalsIgnoreCase("f")){
			System.out.println("Sexo Feminino!");
		}else if(input.equalsIgnoreCase("m")){
			System.out.println("Sexo Masculino!");
		}else {
			System.out.println("Sexo Invalido!");
			}
		
	}
}
