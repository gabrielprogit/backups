
package br.com.db1.exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class ExerciciosColecao {
	List<String> vogais2 = new ArrayList<>();

	public ExerciciosColecao() {
		vogais2.add("a");
		vogais2.add("e");
		vogais2.add("i");
		vogais2.add("o");
		vogais2.add("u");
	}

	public Set<String> getVogais(String nomeParametro) {
		nomeParametro = nomeParametro.toLowerCase();
		Set<String> vogaisEncontradas = new HashSet<>();

		for (Integer x = 0; x < nomeParametro.length(); x++) {
			String letra = nomeParametro.substring(x, x + 1);
			if (vogais2.contains(letra)) {
				vogaisEncontradas.add(letra);
			}
		}

		return vogaisEncontradas;
	}

	public Set<String> getConsoantes(String nomeParametro) {
		nomeParametro = nomeParametro.toLowerCase();
		Set<String> consoantes = new HashSet<>();

		for (Integer x = 0; x < nomeParametro.length(); x++) {
			String letra = nomeParametro.substring(x, x + 1);
			if (!vogais2.contains(letra)) {
				consoantes.add(letra);
			}
		}

		return consoantes;
	}

	public List<Integer> excluirValor(List<Integer> valores) {

		valores.remove(2);

		return valores;

	}

	public Set<String> copiaLista(ArrayList<String> textos) {
		Set<String> novaLista = new HashSet<>();

		String palavra = null;
		Iterator lista = textos.iterator();
		while (lista.hasNext()) {
			palavra = lista.next().toString();
			novaLista.add(palavra);
		}

		return novaLista;
	}

	public List<Integer> getNumerosPares(List<Integer> valores) {
		List<Integer> valoresMultiplosDeDois = new ArrayList<>();
		Iterator<Integer> it = valores.iterator();
		while (it.hasNext()) {
			Integer valor = it.next();

			if (valor > 0 && valor % 2 == 0) {
				valoresMultiplosDeDois.add(valor);
			}
		}
		return valoresMultiplosDeDois;
	}

	@Test
	public void exercicio7() {
		List<String> cores = new ArrayList<>();
		cores.add("azul");
		cores.add("vermelho");
		cores.add("laranja");
		cores.add("preto");

		List<String> cores2 = new ArrayList<>();
		cores2.add("azul");
		cores2.add("vermelho");
		cores2.add("preto");

		cores2.add("laranja");
		
		Assert.assertTrue(cores.containsAll(cores2));
		Assert.assertFalse(cores.equals(cores2));
		
	}

}
