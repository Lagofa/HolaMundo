package paquete;

import java.util.Arrays;

public class Biblioteca implements Cloneable {
	private Libro[] libros;
	private int cantidadLibros;

	public Biblioteca(int tamanioBiblioteca) {
		libros = new Libro[tamanioBiblioteca];
		cantidadLibros = 0;
	}

	public void agregarLibro(Libro libro) {
		if (cantidadLibros > libros.length - 1) {
			throw new Error("Biblioteca Llena");
		}
		libros[cantidadLibros] = libro;
		cantidadLibros++;
	}

	public void ordenar() {
		Arrays.sort(libros);
	}

	public void ordenarPorPaginas() {
		Arrays.sort(libros, new ComparadorPorPaginas());
	}

	public boolean libroRepetido(Libro libro) {
		boolean libroRepetido = false;
		int indice = 0;
		while (indice < cantidadLibros && !libroRepetido) {
			libroRepetido = libros[indice].equals(libro);
			indice++;
		}
		return libroRepetido;

	}

	public Biblioteca clone() throws CloneNotSupportedException {
		Biblioteca clon = (Biblioteca) super.clone();
		for (int i = 0; i < clon.cantidadLibros; i++) {
			clon.libros[i] = libros[i].clone();
		}
		return clon;
	}

	public Libro[] getLibros() {
		return this.libros;
	}
}
