package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {
	ExerciciosString exer = new ExerciciosString();

	@Test
	public void letraGrandeTest() {
		exer.letraGrande("Hello World");
		Assert.assertTrue(exer.exibirResposta().equals("HELLO WORLD"));
	}

	@Test
	public void letraPequenaTest() {
		exer.letraPequena("Hello Wolrd");
		Assert.assertTrue(exer.exibirResposta().equals("hello wolrd"));
	}

	@Test
	public void db1StartTest() {
		exer.db1Start("DB1START");
		Assert.assertTrue(8 == exer.exibirResultado());
	}

	@Test
	public void db1StartEspacoTest() {
		exer.db1StartEspaco(" DB1START ");
		Assert.assertTrue(10 == exer.exibirResultado());
	}
	@Test
	public void db1StartIgual() {
		exer.db1StartIgual(" DB1START ".trim());
		Assert.assertTrue(8 == exer.exibirResultado());
	}
	
	@Test
	public void nomeCompletoTest() {
		exer.nomeCompleto("Gabriel Felipe");
		Assert.assertTrue(exer.exibirResposta().equals("Gabr"));
	}
	@Test
	public void nomeTerceiraLetraTest() {
		exer.nomeTerceiraLetra("Gabriel Felipe");
		Assert.assertTrue(exer.exibirResposta().equals("riel Felipe"));
	}
	@Test
	public void ultimasLetrasTest() {
		exer.nomeUltimasLetras("Gabriel Felipe");
		Assert.assertTrue(exer.exibirResposta().equals("lipe"));
	}
	@Test
	public void trocarNomeTest() {
		exer.nomeCompletoSubstituir("Gabriel Felipe");
		Assert.assertTrue(exer.exibirResposta().equals("Aluno Felipe"));
	}
	@Test
	public void separarPalavraTest() {
		exer.separarPalavras("banana,maçã,melancia");
		Assert.assertTrue(exer.exibirRespostas()[0].equals("banana"));
		Assert.assertTrue(exer.exibirRespostas()[1].equals("maçã"));
		Assert.assertTrue(exer.exibirRespostas()[2].equals("melancia"));
	}
	@Test
	public void contarVogais() {
		exer.vogaisPalavra("Rato");
		Assert.assertTrue(2 == exer.exibirResultado());
	}
	@Test
	public void aoContrariaTest() {
		exer.aoContrario("pau no cu do first");
		Assert.assertTrue(exer.exibirResposta().equals("tsrif od uc on uap"));
	}
}
