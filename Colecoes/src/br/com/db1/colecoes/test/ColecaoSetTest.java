package br.com.db1.colecoes.test;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.colecoes.ExemploColecaoSet;



public class ColecaoSetTest {
	
	ExemploColecaoSet colecao;

	@Before
	public void before() {
		colecao = new ExemploColecaoSet();
		colecao.adicionarNomes("Leonardo");
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
		//,colecao.percorrerLista();
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
		Iterator it = colecao.nomesOrdenados();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		
	}

}
