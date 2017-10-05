package br.com.db1.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;


public class ExerciciosIntegerTest {

	
	ExerciciosInteger exer = new ExerciciosInteger();
	@Test
	public void somaTest() {
		exer.soma(1, 1);
		
		Assert.assertTrue(exer.exibirResultado() == 2);
		
	}
	
	@Test
	public void subtrairTest() {
		exer.subtrair(5, 1);
		
		Assert.assertTrue(exer.exibirResultado() == 4);
	}

	@Test
	public void multiplicarTest() {
		exer.multiplicar(5, 2);
		
		Assert.assertTrue(exer.exibirResultado() == 10);
		
	}
	
	@Test
	public void parTest() {
		exer.par(10);		
		Assert.assertTrue(exer.exibirParidade() == true);
					
	}
	
	@Test
	public void maiorTest() {
		exer.maiorNumero(5, 2);
		Assert.assertTrue(exer.exibirResultado() == 5);
		
	}
	
	@Test
	public void imparesTest() {
		Integer[] resultado = exer.impares(90);
		
		
		Assert.assertTrue(resultado[0] ==91);
		Assert.assertTrue(resultado[1] ==93);
		Assert.assertTrue(resultado[2] ==95);
		Assert.assertTrue(resultado[3] ==97);
		Assert.assertTrue(resultado[4] ==99);
		
		
		
	}
}
