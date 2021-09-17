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
		
		System.out.println("Qual o seu peso?");
		calculadora.peso = leitor.nextInt();
		
		System.out.println();
		System.out.println("Qual a sua altura?");
		calculadora.altura = leitor.nextDouble();
		
		System.out.println();
		
		calculadora.calcularImc();
		
		System.out.println("Seu IMC é igual a: " + imc);
		
		
		
		
		
		
		
		
		
	}

}
