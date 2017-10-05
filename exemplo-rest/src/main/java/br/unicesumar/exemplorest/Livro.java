package br.unicesumar.exemplorest;

import java.util.UUID;

public class Livro {
	private String id;
	private String titulo;

	public Livro() {
		this.id = UUID.randomUUID().toString();
	}

	public Livro(String titulo) {
		this();
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Livro [id=" + id + ", titulo=" + titulo + "]";
	}

}
