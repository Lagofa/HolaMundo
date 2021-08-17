package paquete;

public class Circulo {
	private double radio;
	private Punto centro;

	public Circulo(double radio, Punto centro) {
		this.radio = radio;
		this.centro = centro;
	}

	public boolean intersectaCon(Circulo otroCirculo) {
		return centro.distanciaCon(otroCirculo.centro) <= radio + otroCirculo.radio;
	}

}
