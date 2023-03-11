package fibonacci_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sequenciaFibonacci {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		int n = read.nextInt();
		read.close();

		int i = 0;
		int proximoValor = 0;

		List<Integer> lista = new ArrayList<>();
		lista.add(0);
		lista.add(1);

		for (i = 0; i < n; i++) {
			proximoValor = lista.get(i) + lista.get(i + 1);
			lista.add(proximoValor);
		}

		if (n != i) {
			System.out.println("\no n�mero " + n + " n�o pertence a sequ�ncia Fibonacci.");
		} else {
			System.out.println("\no n�mero " + n + " pertence a sequ�ncia Fibonacci.");
		}

	}

}
