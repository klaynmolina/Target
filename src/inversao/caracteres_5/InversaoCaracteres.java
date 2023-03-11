package inversao.caracteres_5;

public class InversaoCaracteres {

	public static void main(String[] args) {

		String frase = "Vanessa Klayn Ramos Molina";
		String resultado = "";

		for (int i = frase.length(); i > 0; i--) {
			resultado += frase.substring(i - 1, i);
		}

		System.out.println("String passada: " + frase);
		System.out.println();
		System.out.println("String invertida: " + resultado);

	}

}
