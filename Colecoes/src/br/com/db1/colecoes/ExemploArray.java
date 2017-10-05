package br.com.db1.colecoes;

import java.util.Collections;
import java.util.Arrays;

public class ExemploArray {
	public String[] getNomes() {
		String[] alunosTurmaDb1Start = new String[3];
		alunosTurmaDb1Start[0] = "alexander";
		alunosTurmaDb1Start[1] = "silas";
		alunosTurmaDb1Start[2] = "elielson";
		return null;
	}
	public Integer[] ordenaNumeros(Integer[] numeros) {
		Arrays.sort(numeros);
		return numeros;
	}
	public Integer[] ordenaNumeros3(Integer[] numeros) {
		Integer[] numerosOrdenados = new Integer[numeros.length];
		for (Integer x = 0; x < numeros.length; x++) {
			if (x == 0) {
				numerosOrdenados[x] = numeros[x];
			} else {
				if (numerosOrdenados[x - 1] > numeros[x]) {
					Integer valorMaior = numerosOrdenados[x - 1];
					numerosOrdenados[x - 1] = numeros[x];
					numerosOrdenados[x] = valorMaior;
				}
			}
		}

		return numerosOrdenados;
	}
}
