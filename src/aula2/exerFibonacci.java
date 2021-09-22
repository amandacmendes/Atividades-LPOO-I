package aula2;

public class exerFibonacci {

	// Faça o exercício da série de Fibonacci usando apenas duas variáveis
	public static void main(String[] args) {

		int n2 = 1, n1 = 0;

		System.out.print(n1);

		do {
			System.out.print(" " + n2 + " ");
			n1 += n2;
			n2 += n1;
			System.out.print(n1);
			
		} while (n1 < 100);
	}
}
