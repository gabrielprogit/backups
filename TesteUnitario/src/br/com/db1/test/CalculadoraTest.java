package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.Calculadora;

public class CalculadoraTest {
	
	private Calculadora calculadora = new Calculadora();
	@Before
	public void before() {
		calculadora.zerarCalculo();
		System.out.println("Rodou 1 teste");
		
	}
	@After
	public void after() {
		System.out.println("Resultado: "+
							calculadora.exibirResultado());
		System.out.println("Finalizou 1 teste");
	}
	
	@Test
	public void zerarCalculoTest() {
		Calculadora calculadora = new Calculadora();
		calculadora.zerarCalculo();

		Assert.assertTrue(calculadora.exibirResultado() == 0);
	}

	@Test
	public void somarCalculotest() {
		
		calculadora.zerarCalculo();
		calculadora.somar(5d, 7d);

		Assert.assertTrue(calculadora.exibirResultado() == 12d);
	}

	@Test
	public void subtrairCalculoTest() {
		
		calculadora.zerarCalculo();
		calculadora.subtrair(10d, 5d);
		Assert.assertTrue(calculadora.exibirResultado() == 5d);
	}

	@Test
	public void dividirCalculoTest() {
		
		calculadora.zerarCalculo();
		calculadora.dividir(10d, 2d);
		Assert.assertTrue(calculadora.exibirResultado() == 5d);
	}
	
	@Test
	public void multiplicarCalculoTest() {
		
		calculadora.zerarCalculo();
		calculadora.multiplicar(10d, 2d);
		Assert.assertTrue(calculadora.exibirResultado() == 20);
	}
}
