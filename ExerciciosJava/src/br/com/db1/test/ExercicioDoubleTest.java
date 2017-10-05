package br.com.db1.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDouble;
import br.com.db1.ExerciciosInteger;

public class ExercicioDoubleTest {

	ExerciciosDouble exer = new ExerciciosDouble();
	@Test
	public void menorNumeroTest() {
		exer.menorNumero(1.0,2.0);
		
		Assert.assertTrue(1.0 == exer.exibirResultado());
	}
	@Test
	public void menorDeTresTest() {
		exer.menorDeTres(1.0, 2.0, 3.0);
		Assert.assertTrue(1.0 == exer.exibirResultado());
	}
	@Test
	public void mediaNumeroTest() {
		exer.mediaNumeros(2.0, 2.0, 2.0);
		Assert.assertTrue(2.0 == exer.exibirResultado());
	}
	
	@Test
	public void areaTrianguloTest() {
		exer.areaTriangulo(2.0, 3.0);
		Assert.assertTrue(3.0 == exer.exibirResultado());
	}
}
