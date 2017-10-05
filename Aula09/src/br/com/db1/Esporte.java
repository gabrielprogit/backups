package br.com.db1;

public class Esporte {

	private String descricao;

	public String exibirDescricao() {
		return descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void alterarAtributoDescricao(String novoValor) {
		descricao = novoValor;

	}

	private void metodoPrivado() {
		descricao = "esse é um metodo privado";
	}

}
