package br.com.db1.exercicios.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.exercicios.ExerciciosColecao;
import br.com.db1.exercicios.Produto;
import br.com.db1.exercicios.ProdutoComparator;

//boa nomenclatura

public class ExerciciosColecaoTest {
	ExerciciosColecao colec;

	@Before
	public void before() {
		colec = new ExerciciosColecao();

	}

	@Test
	public void getVogaisTest() {
		Set<String> vogais = colec.getVogais("Fusca");

		Assert.assertTrue(vogais.size() == 2);
		Assert.assertFalse(vogais.contains("f"));
		Assert.assertTrue(vogais.contains("u"));
		Assert.assertFalse(vogais.contains("s"));
		Assert.assertFalse(vogais.contains("c"));
		Assert.assertTrue(vogais.contains("a"));
	}

	@Test
	public void getConsoantesTest() {
		Set<String> consoantes = colec.getConsoantes("Fusca");

		Assert.assertTrue(3 == consoantes.size());
		Assert.assertTrue(consoantes.contains("f"));
		Assert.assertFalse(consoantes.contains("u"));
		Assert.assertTrue(consoantes.contains("s"));
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("a"));
	}

	@Test
	public void excluirValorTest() {
		List<Integer> valores = new ArrayList<>();
		for (Integer i = 0; i < 10; i++) {
			valores.add(i);
		}
		List<Integer> novaLista = colec.excluirValor(valores);
		Assert.assertTrue(novaLista.contains(0));
		Assert.assertTrue(novaLista.contains(1));
		Assert.assertFalse(novaLista.contains(2));
		Assert.assertTrue(novaLista.contains(3));
	}

	@Test
	public void multiplosDeTresTest() {
		List<Integer> valores = new ArrayList<>();
		for (Integer x = 0; x < 10; x++) {
			valores.add(x * 10);
		}

		Assert.assertTrue(valores.get(3) == 30);
		Assert.assertTrue(valores.get(6) == 60);
		Assert.assertTrue(valores.get(9) == 90);
	}

	@Test
	public void multiplosDeDoisTest() {
		List<Integer> valores = new ArrayList<>();
		for (Integer x = 0; x < 10 ; x++){
			valores.add(x);
		}

		List<Integer> novaLista = colec.getNumerosPares(valores);

		Assert.assertTrue(novaLista.contains(2));
		Assert.assertTrue(novaLista.contains(4));
		Assert.assertTrue(novaLista.contains(6));
		Assert.assertTrue(novaLista.contains(8));
		Assert.assertFalse(novaLista.contains(10));
		Assert.assertFalse(novaLista.contains(3));
	}

	@Test
	public void copiarListaTest() {

		List<String> nomes = new ArrayList<>();
		nomes.add("silas");
		nomes.add("gustavo");
		nomes.add("aline");
		nomes.add("izabela");
		nomes.add("gabriel");
		nomes.add("lorena");
		nomes.add("lucas");
		nomes.add("caio");
		nomes.add("leonardo");
		nomes.add("fernando");

		List<String> novaLista = new ArrayList<>(nomes);

		Assert.assertTrue(novaLista.contains("caio"));
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
	
	@Test
	public void exercicio8Test(){
		Set<String> cores = new HashSet<>();
		cores.add("azul");
		cores.add("vermelho");
		cores.add("laranja");
		cores.add("preto");

		Set<String> cores2 = new HashSet<>();
		cores2.add("azul");
		cores2.add("vermelho");
		cores2.add("preto");

		Assert.assertFalse(cores.equals(cores2));

		cores2.add("laranja");
		Assert.assertTrue(cores.equals(cores2));
	}
	
	@Test
	public void exercicio9Test() {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(98, "CELULAR", 1000.00));
		produtos.add(new Produto(50, "MONITOR", 200.00));
		produtos.add(new Produto(55, "CANECA", 50.00));

		Assert.assertTrue(produtos.size() == 3);
		Assert.assertTrue(produtos.get(0).getValor() == 1000.00);
		Assert.assertTrue(produtos.get(1).getValor() == 200.00);
		Assert.assertTrue(produtos.get(2).getValor() == 50.00);

		Collections.sort(produtos);

		Assert.assertTrue(produtos.get(0).getValor() == 50.00);
		Assert.assertTrue(produtos.get(1).getValor() == 200.00);
		Assert.assertTrue(produtos.get(2).getValor() == 1000.00);

		Collections.sort(produtos, new ProdutoComparator());

		Assert.assertEquals("CANECA",produtos.get(0).getDescricao());
		Assert.assertEquals("CELULAR",produtos.get(1).getDescricao());
		Assert.assertEquals("MONITOR",produtos.get(2).getDescricao());

	}
}
