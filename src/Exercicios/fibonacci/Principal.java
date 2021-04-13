package Exercicios.fibonacci;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int n1 = 0; // primeiro numero da sequencia de Fibonacci
		int n2 = 1; // segundo numero da sequencia de Fibonacci
		int n3 = 0; // terceiro numero, ainda a definir
		int num; // valor informado pelo usu�rio

		Scanner a = new Scanner(System.in);

		System.out.println("Digite uma n�mero para saber se est� na sequ�ncia l�gica de Fibonacci:");

		num = a.nextInt();

		while (num > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

		if (num == 0) {
			System.out.println("O n�mero 0 est� na sequ�ncia de Fibonacci");
			System.out.println("O pr�ximo n�mero da sequ�ncia �: " + (n1 + 1));
		} else if (num == n3) {
			System.out.println("O n�mero " + num + " faz parte da sequ�ncia de Fibonacci");
			System.out.println("O pr�ximo n�mero da sequ�ncia �: " + (n1 + num));
		} else {
			System.out.println("Esse n�mero n�o faz parte da sequ�ncia de Fibonacci");
		}

	}
}
