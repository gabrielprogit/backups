package br.com.db1.exercicio08;

public class PessoaJuridica extends Pessoa {

	private Integer cnpj;

	public Boolean validarCnpj() {
		return true;
	}

	public String formatarCnpj() {
		return cnpj.toString();
	}
}
