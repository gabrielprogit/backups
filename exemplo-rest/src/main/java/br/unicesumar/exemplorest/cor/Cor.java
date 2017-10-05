package br.unicesumar.exemplorest.cor;

import java.util.UUID;

public class Cor {
	private String id;
	private String nome;
	
	public Cor() {
		this.id = UUID.randomUUID().toString();
	}
	
	public Cor(String nome) {
		this();
		this.nome = nome;
	}

	public Cor(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cor [id=" + id + ", nome=" + nome + "]";
	}
	

}
