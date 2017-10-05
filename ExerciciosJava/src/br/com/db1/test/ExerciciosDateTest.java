package br.com.db1.test;



import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDate;


public class ExerciciosDateTest {
	ExerciciosDate exer = new ExerciciosDate();
	@Test
	public void anoBissextoTest() {
		exer.anoBissexto(2016);
		Assert.assertTrue(exer.exibirResposta().equals("é bissexto"));
		
		
	}

}
