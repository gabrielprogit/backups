package br.com.db1.exercicio08;

public class Endereco {
	private String logradouro;
	private Integer cep;
	
	public String exibirCepFormatado() {
		return cep.toString();
	}
}
