package aula2;

public class exerFibonacci {

	// Fa�a o exerc�cio da s�rie de Fibonacci usando apenas duas vari�veis
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
