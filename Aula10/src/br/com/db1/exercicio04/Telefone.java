package br.com.db1.exercicio04;

public class Telefone {
	private Integer ddd;
	private Integer numero;
	
	public String exibirTelefoneFormatado(){
		String telefoneEmTexto = numero.toString();
		String prefixo = telefoneEmTexto.substring(0,3);
		String sufixo = telefoneEmTexto.substring(4,telefoneEmTexto.length());
		
		return ddd +"" + prefixo + "-" + sufixo;
	}
}
