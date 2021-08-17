package punto;

public class Punto {
	private double coordenadaX;
	private double coordenadaY;

	public Punto(double coordenadaX, double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public Punto() {
		this(0, 0);
	}

	public double obtenerX() {
		return this.coordenadaX;
	}

	public double obtenerY() {
		return this.coordenadaY;
	}

	public void cambiarX(double nuevoX) {
		this.coordenadaX = nuevoX;
	}

	public void cambiarY(double nuevoY) {
		this.coordenadaY = nuevoY;
	}

	public boolean estaSobreEjeX() {
		return this.coordenadaY == 0;
	}

	public boolean estaSobreEjeY() {
		return this.coordenadaX == 0;
	}

	public boolean esElOrigen() {
		return (this.estaSobreEjeX() && this.estaSobreEjeY());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (Double.doubleToLongBits(coordenadaX) != Double.doubleToLongBits(other.coordenadaX))
			return false;
		if (Double.doubleToLongBits(coordenadaY) != Double.doubleToLongBits(other.coordenadaY))
			return false;
		return true;
	}

}
