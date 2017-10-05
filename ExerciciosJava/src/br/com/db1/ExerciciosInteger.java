package br.com.db1;

public class ExerciciosInteger {

	Integer resultado;
	Boolean paridade;

	public Integer exibirResultado() {
		return resultado;
	}

	public void soma(Integer valor1, Integer valor2) {
		resultado = valor1 + valor2;

	}

	public void subtrair(Integer valor1, Integer valor2) {
		resultado = valor1 - valor2;

	}

	public void multiplicar(Integer valor1, Integer valor2) {
		resultado = valor1 * valor2;
	}

	public Boolean exibirParidade() {
		return paridade;
	}

	public void par(Integer valor1) {
		if (valor1 % 2 == 0) {
			paridade = true;
		} else {
			paridade = false;
		}

	}

	public void maiorNumero(Integer valor1, Integer valor2) {
		if (valor1 > valor2) {
			resultado = valor1;
		} else {
			resultado = valor2;

		}

	}

	public Integer[] impares(Integer valor1) {

		Integer contador = 0;
		Integer[] impares = new Integer[50];
		for (int i = valor1; i <= 100; i++) {
			if (i % 2 == 1) {

				impares[contador] = i;
				contador++;
			}

		}
		return impares;
	}
}
