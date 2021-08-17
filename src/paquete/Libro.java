package paquete;

public class Libro implements Comparable<Libro>, Cloneable {
	private String autor;
	private int paginas;
	private String titulo;
	private int anioPublicacion;
	private Genero genero;
	private static final int MAXIMO_CARACTERES = 200;

	public Libro(String autor, int paginas, String titulo, int anioPublicacion, Genero genero) {
		this.autor = autor;
		this.paginas = paginas;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return this.autor + " (" + this.anioPublicacion + ") " + this.genero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Libro libro = new Libro("Jose", 100, "Novelas rancias", 1586, Genero.NOVELA);
		Libro libro1 = new Libro("Jose", 100, "Novelas rancias", 155, Genero.FANTASIA);
		System.out.println(libro);
		System.out.println(libro.equals(libro1));
		System.out.println(libro.hashCode());
		System.out.println(libro1.hashCode());

	}

	@Override
	public int compareTo(Libro o) {
		if (this.autor.compareTo(o.autor) == 0) {
			return this.titulo.compareTo(o.titulo);
		}
		return this.autor.compareTo(o.autor);
	}

	public int getPaginas() {
		return this.paginas;
	}

	public String recortarTitulo() {
		if (this.titulo.length() > MAXIMO_CARACTERES) {
			return this.titulo.substring(0, MAXIMO_CARACTERES);
		}
		return this.titulo;
	}

	public String getTituloNormalizado() {
		return null;
	}

	public Libro clone() throws CloneNotSupportedException {
		return (Libro) super.clone();
	}
}
