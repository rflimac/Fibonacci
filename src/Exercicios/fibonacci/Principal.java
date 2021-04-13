package Exercicios.fibonacci;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int n1 = 0; // primeiro numero da sequencia de Fibonacci
		int n2 = 1; // segundo numero da sequencia de Fibonacci
		int n3 = 0; // terceiro numero, ainda a definir
		int num; // valor informado pelo usuário

		Scanner a = new Scanner(System.in);

		System.out.println("Digite uma número para saber se está na sequência lógica de Fibonacci:");

		num = a.nextInt();

		while (num > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

		if (num == 0) {
			System.out.println("O número 0 está na sequência de Fibonacci");
			System.out.println("O próximo número da sequência é: " + (n1 + 1));
		} else if (num == n3) {
			System.out.println("O número " + num + " faz parte da sequência de Fibonacci");
			System.out.println("O próximo número da sequência é: " + (n1 + num));
		} else {
			System.out.println("Esse número não faz parte da sequência de Fibonacci");
		}

	}
}
