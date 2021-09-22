package aula2;

import java.util.Scanner;

public class ExerciciosApostila {

	public static void main(String[] args) {
		ex8();
	}

	public static void ex1() {
		// 150 a 300
		for (int i = 150; i <= 300; i++) {
			System.out.println(i);
		}
	}

	public static void ex2() {
		// imprima a soma de 1 a 1000
		int soma = 0;
		for (int i = 1; i <= 1000; i++) {
			soma += i;
		}
		System.out.println(soma);
	}

	public static void ex3() {
		// multiplos de 3 entre 1 e 100

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void ex4() {
		// fatorial de 1 a 10
		int fatorial = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			for (int j = i; j <= i; j--) {

				if (j == 0) {
					System.out.println("! = " + fatorial);
					fatorial = 1;
					break;
				}

				fatorial = (fatorial * j);
			}
			System.out.println("");
		}
	}

	public static void ex5() {
		// fatorial de 1 a 100
		long fatorial = 1;

		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			for (int j = i; j <= i; j--) {

				if (j == 0) {
					System.out.println("! = " + fatorial);
					fatorial = 1;
					break;
				}

				fatorial = (fatorial * j);
			}
			System.out.println("");
		}
	}

	public static void ex6() {
		// fibonacci 1 a 100

		int n2 = 1, n1 = 0, fib = 0;
		System.out.println(fib);

		while (fib < 100) {
			fib = n1 + n2;
			n1 = n2;
			n2 = fib;
			System.out.println(fib);
		}
	}

	public static void ex7() {
		// se x é par, x = x/2; se x é impar, x = 3 * x + 1;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira um valor inteiro:");
		int num = teclado.nextInt();
		while (num > 1) {

			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = 3 * num + 1;
			}

			System.out.println(num);
		}
		teclado.close();
	}

	public static void ex8() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira um valor inteiro (n):");
		int num = teclado.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				int f = j * i;
				System.out.print(f + " ");
			}
			System.out.println();
		}
		teclado.close();
	}

}
