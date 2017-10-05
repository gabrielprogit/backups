package br.com.db1.exercicio08;

public class PessoaFisica extends Pessoa {
	private Integer cpf;

	
	
	public Boolean validarCpf() {
		return true;
	}

	public String formatarCpf() {
		return cpf.toString();
	}
}
