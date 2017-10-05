package br.com.db1;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class HelloController {
	private String mensagem;
	private String outraMensagem;
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getOutraMensagem() {
		return outraMensagem;
	}
	public void setOutraMensagem(String outraMensagem) {
		this.outraMensagem = outraMensagem;
	}
	
	public void trocarMensagem() {
		outraMensagem = mensagem;
	}



}
