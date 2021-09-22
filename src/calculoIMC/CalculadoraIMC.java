package calculoIMC;

import java.util.Scanner;

import funcaoImc.IMC;

public class CalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		IMC calculadora = new IMC();
		
		System.out.println("-------------------------");
		System.out.println("     CALCULADORA IMC     ");
		System.out.println("-------------------------");
		
		System.out.print("Qual o seu peso? ");
		calculadora.peso = leitor.nextInt();
		
		System.out.println();
		System.out.print("Qual a sua altura? ");
		calculadora.altura = leitor.nextDouble();
		
		System.out.println();
		
		leitor.close();
		
		calculadora.calcularImc();
		
		calculadora.obterStatus();
		
		//System.out.printf("Seu IMC é igual a: %.2f  =>  %s" , calculadora.imc, calculadora.status);
		
		System.out.println("Seu IMC é igual a: " + calculadora.imc + " => " + calculadora.status);
	
	}

}
