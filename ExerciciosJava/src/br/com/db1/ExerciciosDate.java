package br.com.db1;

import java.util.Date;

public class ExerciciosDate {
	private Date data;
	private Date resultado;
	private String resposta;

	public Date exibirResultado() {
		return resultado;
	}

	public String exibirResposta() {
		return resposta;
	}

	public void anoBissexto(Integer ano) {

		if (ano % 400 == 0) {
			resposta = ("é bissexto");
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			resposta = ("é bissexto");
		} else {
			resposta =("não é bissexto");
		}
	}
}
