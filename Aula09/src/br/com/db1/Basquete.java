package br.com.db1;

public class Basquete extends EsporteColetivo{

	private TipoBasquete variavelTipoBasquete;
	
	

	@Override
	public String toString() {
		return "Basquete [variavelTipoBasquete=" + variavelTipoBasquete + ", descricao = "+ super.exibirDescricao() +"]";
	}



	TipoBasquete getvariavelTipoBasquete() {
		return variavelTipoBasquete;
		
	}
	
	public void setTipoBasquete(TipoBasquete tipo) {
		variavelTipoBasquete = tipo;
	}
	

}
