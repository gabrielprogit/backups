package br.com.db1;

public class Main {
	
	
	public static void main(String[] args) {
		
		System.out.println(TipoBasquete.NBA);
		
		Basquete vBasquete = new Basquete();
		System.out.println(vBasquete);
		
		vBasquete.setTipoBasquete(TipoBasquete.NBA);
		System.out.println(vBasquete);
		
		vBasquete.setTipoBasquete(TipoBasquete.FIBA);
		System.out.println(vBasquete);
				
		
		vBasquete.setDescricao("Esta é a descrição do basquete");
		System.out.println(vBasquete.getDescricao());
		
		Esporte vEsporte = new Esporte();		
		vEsporte.setDescricao("Esta é a descrição do esporte");
		System.out.println(vEsporte.getDescricao());
		
		vBasquete.alterarAtributoDescricao("Basquete");	
		
		System.out.println(vBasquete.getDescricao());
		System.out.println(vBasquete);
	}

}
