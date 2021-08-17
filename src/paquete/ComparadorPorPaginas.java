package paquete;

import java.util.Comparator;

public class ComparadorPorPaginas implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return Integer.compare(o1.getPaginas(), o2.getPaginas()) * -1;
	}

}
