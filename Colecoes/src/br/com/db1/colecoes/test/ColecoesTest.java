package br.com.db1.colecoes.test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.colecoes.ExemploArray;
import br.com.db1.colecoes.ExemploColecao;

public class ColecoesTest {
	ExemploColecao colecao;

	@Before
	public void before() {
		colecao = new ExemploColecao();
		colecao.adicionarNomes("Leonardo");
		colecao.adicionarNomes("Patrick");
		colecao.adicionarNomes("Maycon");
		colecao.adicionarNomes("Camile");
		colecao.adicionarNomes("Mateus");
		colecao.adicionarNomes("Matheus");
		colecao.adicionarNomes("Luiz");
		colecao.adicionarNomes("Isadora");
		colecao.adicionarNomes("Brenda");
		colecao.adicionarNomes("Daniel");
		colecao.adicionarNomes("Andre");
	}

	@Test
	public void arrayTest() {
		ExemploArray exemplo = new ExemploArray();
		String[] nomes = exemplo.getNomes();
	}

	@Test
	public void exercicioArray() {
		ExemploArray exemplo = new ExemploArray();
		Integer[] numeros = new Integer[3];
		numeros[0] = 10;
		numeros[1] = 5;
		numeros[2] = 6;
		Integer[] numerosOrdenados = exemplo.ordenaNumeros(numeros);
		Assert.assertTrue(5 == numerosOrdenados[0]);
		Assert.assertTrue(6 == numerosOrdenados[1]);
		Assert.assertTrue(10 == numerosOrdenados[2]);

	}

	@Test
	public void colecaoArrayList() {
		Assert.assertTrue(11 == colecao.getList().size());
		Assert.assertTrue(colecao.getList().contains("Andre"));
		Assert.assertTrue(!colecao.getList().contains("Gabriel"));

	}

	@Test
	public void colecaoValidarQuantidade() {
		Assert.assertTrue(11 == colecao.getList().size());
	}

	@Test
	public void colecaoRemove3Valida() {
		colecao.removerNomes("Leonardo");
		colecao.removerNomes("Patrick");
		colecao.removerNomes("Maycon");
		Assert.assertTrue(8 == colecao.getList().size());
	}

	@Test
	public void colecaoExibirNomes() {
		colecao.percorrerLista();
	}

	@Test
	public void colecaoFuscaEstaNaLista() {
		//Assert.assertTrue(!colecao.getList().contains("Fusca"));
		Assert.assertFalse(colecao.getList().contains("Fusca"));
	}

	@Test
	public void colecaoLeonardoEstaNaLista() {
		Assert.assertTrue(colecao.getList().contains("Leonardo"));
	}

	@Test
	public void colecaoNomesOrdenados() {
		System.out.println("-------------------");
		colecao.nomesOrdenados();
		colecao.percorrerLista();		
		System.out.println("-------------------");
	}

}
