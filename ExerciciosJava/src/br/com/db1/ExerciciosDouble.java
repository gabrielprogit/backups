package br.com.db1;

public class ExerciciosDouble {

	// 1 - FUM que exiba qual é o menor valor entre dois doubles
	private Double resultado;

	public Double exibirResultado() {
		return resultado;
	}

	public void menorNumero(Double valor1, Double valor2) {
		if (valor1 < valor2) {
			resultado = valor1;
		} else {
			resultado = valor2;

		}
		System.out.println("Menor numero: "+resultado);
		
	}
	
	//2 - FUM que exiba qual é o menor valor entre tres doubles
	public void menorDeTres(Double valor1, Double valor2, Double valor3) {
		if (valor1 < valor2 && valor1<valor3) {
			resultado = valor1;
		}else if (valor2 < valor1 && valor2 < valor3) {
			resultado = valor2;			
		}else {
			resultado = valor3;
		}
		System.out.println("menor de 3 : "+ resultado);
		
	}
	//3 - FUM que exiba a média de três numeros
	
	public void mediaNumeros(Double valor1, Double valor2, Double valor3) {
		resultado = (valor1 + valor2 + valor3)/3;
		
		System.out.println("Media : " + resultado);
	}
	
	public void areaTriangulo(Double base,Double altura) {
		resultado = (base * altura)/2;
		
		System.out.println("Area : " +resultado);
	}
}
