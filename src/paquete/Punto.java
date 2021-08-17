package paquete;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distanciaCon(Punto otroPunto) {
		return Math.sqrt(potencia(x, otroPunto.x) + potencia(y, otroPunto.y));
	}

	private double potencia(double x, double y) {
		return Math.pow(x - y, 2);
	}

}
