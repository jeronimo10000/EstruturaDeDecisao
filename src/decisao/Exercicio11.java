package decisao;

import java.util.Scanner;

public class Exercicio11 {

	private static Scanner ler;

	public static void main(String[] args) {
		/*As organizações Tabajara resolveram dar um aumento de salário aos seus 
		 * colaboradores e lhe contrataram para desenvolver o programa que calculará
		 * os reajustes.
		 * º Faça um programa que recebe o salário de um colaborador e o reajuste 
		 * 	 segundo o seguinte critério, baseado no salário atual;
		 * º Salários até R$ 280,00 (incluindo): aumento de 20%
		 * º Salários entre R$ 280,00 e R$ 700,00: aumento de 15%
		 * º Salários entre R$ 700,00 e R$ 1,500,00: aumento de 10%
		 * º Salários de R$ 1,500,00 em diante: aumento de 5% após o aumento ser reali-
		 *   zado, informe na tela:
		 * º O salário antes do reajuste;
		 * º O percentual de aumento aplicado;
		 * º O valor do aumento;
		 * º O novo salário, após o aumento.
		 */
		
		ler = new Scanner(System.in);
		
		System.out.println("Novo salário com reajuste");
		System.out.println("Digite o seu salário: ");
		double salario = ler.nextDouble();
		
		int percentual = 0;
		
		if(salario <= 280){
			percentual = 20;
		}else if(salario > 280 && salario < 700){
			percentual = 15;
		}else if( salario > 700 && salario < 1500){
			percentual = 10;
		}else if(salario > 1500){
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double salarioAjustado = salario + aumento;
		
		System.out.println("O salário antes do reajuste: " + salario);
		System.out.println("O percentual de aumento aplicado: " + percentual);
		System.out.println("O valor do aumento: " + aumento);
		System.out.println("O novo salário: " + salarioAjustado);

	}

}
