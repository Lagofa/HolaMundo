package paquete;

public class Unidad {
	private Posicion posicion;
	private int salud;
	private static final int SALUD_INICIAL = 100;
	private static final int DANIO = 10;
	private static final double DISTANCIA_MAXIMA_ATAQUE = 2;

	public Unidad(Posicion posicion) {
		this.posicion = posicion;
		this.salud = SALUD_INICIAL;
	}

	public int getSalud() {
		return this.salud;
	}

	public double distanciaCon(Unidad otraUnidad) {
		return this.posicion.distanciaCon(otraUnidad.posicion);
	}

	public void atacar(Unidad otraUnidad) {
		if (this.distanciaCon(otraUnidad) < DISTANCIA_MAXIMA_ATAQUE && otraUnidad.salud >= DANIO) {
			otraUnidad.recibirDanio();
		}
	}

	private void recibirDanio() {
		this.salud -= DANIO;
	}

}
