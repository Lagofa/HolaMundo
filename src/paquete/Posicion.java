package paquete;

public class Posicion {
	private double coordenadaX;
	private double coordenadaY;

	/**
	 * @pos:inicializa las coordenadas con los parametros pasados
	 * @param coordenadaX
	 * @param coordenadaY
	 */
	public Posicion(double coordenadaX, double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	/**
	 * @pos: devuelve la distancia con otra posicion
	 * @param otraPosicion
	 * @return: devuelve un valor real que es la distancia con otra posicion
	 */
	public double distanciaCon(Posicion otraPosicion) {
		return Math.sqrt(Math.pow(this.coordenadaX - otraPosicion.coordenadaX, 2)
				+ Math.pow(this.coordenadaY - otraPosicion.coordenadaY, 2));
	}

}
