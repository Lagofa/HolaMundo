
public class Posicion {
	private double coordenadaX;
	private double coordenadaY;

	public Posicion(double coordenadaX, double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public double distanciaCon(Posicion otraPosicion) {
		return Math.sqrt(Math.pow(this.coordenadaX - otraPosicion.coordenadaX, 2)
				+ Math.pow(this.coordenadaY - otraPosicion.coordenadaY, 2));
	}

}
