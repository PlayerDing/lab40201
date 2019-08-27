package com.senati.ejerecicio2;

public class Colegio {
	int id;
	String titulo;
	String autor;
	String npaginas;
	String nisbn;
	
	
	public Colegio(int id, String titulo, String autor, String npaginas, String nisbn) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.npaginas = npaginas;
		this.nisbn = nisbn;
	}


	@Override
	public String toString() {
		return "Colegio [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", npaginas=" + npaginas + ", nisbn="
				+ nisbn + "]";
	}
	
	
}
