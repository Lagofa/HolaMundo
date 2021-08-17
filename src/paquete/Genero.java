package paquete;

public enum Genero {
	INFANTIL(101), FANTASIA(205), NOVELA(306);
	private int codigo;

	private Genero(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return this.codigo;
	}

}
