package br.com.db1.exercicio08;

import java.util.Date;
import java.util.List;

public abstract class Pessoa {
	private String nome;
	private Date dataNascimento;

	private List<Endereco> Endereco;
	private TipoLogradouro tipoLogradouro;
	private Conta conta;

	private List<Telefone> Telefones;
}
