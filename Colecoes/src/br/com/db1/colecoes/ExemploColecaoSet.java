package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploColecaoSet {

	private Set<String> nomesDb1Start = new HashSet<>();

	public void adicionarNomes(String nome) {
		nomesDb1Start.add(nome);
	}

	public void removerNomes(String nome) {
		nomesDb1Start.remove(nome);
	}

	public Boolean estaNaLista(String nome) {
		return nomesDb1Start.contains(nome);
	}

	public void percorrerLista() {
		Iterator lista = nomesDb1Start.iterator();
		while (lista.hasNext()) {
			System.out.println(lista.next());
		}	
		
	
	}

	public Integer tamanhoLista() {
		return nomesDb1Start.size();
	}

	public Set<String> getList() {
		return nomesDb1Start;
	}

	public Iterator<String> nomesOrdenados() {
		Set<String> nomesOrdenados = new TreeSet<String>(nomesDb1Start);

		Set<String> ordena = new TreeSet<String>(nomesOrdenados);
		Iterator<String> it = ordena.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		return it;
		
	}
}