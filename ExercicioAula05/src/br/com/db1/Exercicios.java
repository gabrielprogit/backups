package br.com.db1;

public class Exercicios {
	public static void main(String[] args) {

		exemploPrimitivoString();

		exemploPrimitivoInteger();

		exemploPrimitivoDouble();

		exemploPrimitivoBooleano();

		exemploWhile();

		exemploDoWhilte();

		exemploFor();

	}

	private static void exemploFor() {

		for (Integer i = 0; i < 11; i++) {
			System.out.println(i);
		}

	}

	private static void exemploDoWhilte() {
		Integer contador = 1;

		do {
			System.out.println(contador);
			contador++;
		} while (contador < 11);

	}

	private static void exemploWhile() {
		Integer contador = 1;

		while (contador < 11) {
			System.out.println(contador);
			contador++;
		}

	}

	private static void exemploPrimitivoBooleano() {
		boolean variavelPrimitiva = false;
		Boolean variavelNaoPrimitiva = Boolean.FALSE;

	}

	private static void exemploPrimitivoInteger() {
		int valorNumerico = 0;
		Integer valorNumerico2 = 1;

		String.valueOf(valorNumerico); // para primitivo e nao primitivo
		valorNumerico2.toString(); // quando nao é primitivo
		String variavel = "" + valorNumerico; // gambiarra
	}

	private static void exemploPrimitivoDouble() {
		Double numeroComVirgula2 = 1.92;
		double numeroComVirgula = 1.92;
	}

	private static void exemploPrimitivoString() {
		char umaLetra = 'a';
		String variasLetras = "varias letras";

		String exemploDeString = "99999";
		char numero1 = '1';
		String numero = "1";

		System.out.println(exemploDeString.length());
		exemploDeString.toLowerCase();
		exemploDeString.toUpperCase();

		System.out.println("Converter texto em numero");
		System.out.println(Integer.parseInt(numero));

	}
}
