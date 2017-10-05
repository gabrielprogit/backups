package br.com.db1.exercicio08;

import java.util.Date;
import java.util.List;

public class Banco {
	private String nome;
	private Date dataFundacao;
	private String publico;
	private List<Conta> Contas;
	
	public Boolean isPublico() {
		return true;
	}
}
