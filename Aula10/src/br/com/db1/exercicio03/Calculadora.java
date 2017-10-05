
package br.com.db1.exercicio03;

public class Calculadora {
	private Double resultado;
	private Double primeiroValor;
	private Double segundoValor;
	
	public void zerarCalculo(Double resultado){
		resultado =0.0;
		
	}
	public void somar(Double valor1,Double valor2){
		resultado = valor1 + valor2;
	}
	
	public void subtrair(Double valor1,Double valor2) {
		resultado = valor1 - valor2;
	}
	
	public void dividir(Double valor1,Double valor2) {
		resultado = valor1/valor2;
	}
	
	public void multiplicar(Double valor1,Double valor2) {
		resultado = valor1 * valor2;
	}
	
	public Double exibirResultado() {
		return resultado;
	}
	
	Calculadora(){
		
	}
}
