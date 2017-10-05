package br.com.db1.exercicio08;

import java.util.List;

public class Conta {
	private Integer numero;
	private Integer digitoVerificador;
	private Banco banco;
	private Agencia agencia;
	

	public void calcularDigitoVerificador() {

	}

	public Boolean validarDigitoVerificador() {
		return true;
	}

	Conta(Agencia agencia, Pessoa pessoa) {
		this.agencia = agencia;

	}
	
	public Conta() {}
}
