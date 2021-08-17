package paquete;

class TarjetaBaja {
	private double saldo;
	private int cantidadViajesSubte;
	private int cantidadViajesColectivo;
	private final double VALOR_VIAJE_SUBTE = 19.50;
	private final double VALOR_VIAJE_COLECTIVO = 21.50;

	/**
	 * @pre: saldo inicial debe ser mayor a 0
	 * @post: saldo de la Tarjeta en saldoInicial.
	 */
	public TarjetaBaja(double saldoInicial) {
		validarSaldoInicial(saldoInicial);
		this.saldo = saldoInicial;
		cantidadViajesSubte = 0;
		cantidadViajesColectivo = 0;
	}

	private void validarSaldoInicial(double saldoInicial) {
		if (saldoInicial <= 0) {
			throw new Error("El saldo inicial no puede ser negativo ni cero");
		}
	}

	/**
	 * @post: saldo de la Tarjeta en 0.
	 */
	public TarjetaBaja() {
		this.saldo = 0;
		cantidadViajesSubte = 0;
		cantidadViajesColectivo = 0;
	}

	/**
	 * post: devuelve el saldo actual de la Tarjeta
	 */
	public double obtenerSaldo() {
		return this.saldo;
	}

	/**
	 * post: agrega el monto al saldo de la Tarjeta.
	 */
	public void cargar(double monto) {
		this.saldo += monto;
	}

	/**
	 * pre : saldo suficiente. post: utiliza 21.50 del saldo para un viaje en
	 * colectivo.
	 */
	public void pagarViajeEnColectivo() {
		validarSaldoParaViajeEnColectivo();
		this.saldo -= VALOR_VIAJE_COLECTIVO;
		cantidadViajesColectivo++;
	}

	private void validarSaldoParaViajeEnColectivo() {
		if (this.saldo < VALOR_VIAJE_COLECTIVO) {
			throw new Error("Saldo insuficiente para viajar en colectivo");
		}
	}

	/**
	 * pre : saldo suficiente. post: utiliza 19.50 del saldo para un viaje en subte.
	 */
	public void pagarViajeEnSubte() {
		validarSaldoParaViajeEnSubte();
		this.saldo -= VALOR_VIAJE_SUBTE;
		cantidadViajesSubte++;
	}

	private void validarSaldoParaViajeEnSubte() {
		if (this.saldo < VALOR_VIAJE_SUBTE) {
			throw new Error("Saldo insuficiente para viajar en subte");
		}
	}

	/**
	 * post: devuelve la cantidad de viajes realizados.
	 */
	public int contarViajes() {
		return cantidadViajesSubte + cantidadViajesColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en colectivo.
	 */
	public int contarViajesEnColectivo() {
		return cantidadViajesColectivo;
	}

	/**
	 * post: devuelve la cantidad de viajes en subte.
	 */
	public int contarViajesEnSubte() {
		return cantidadViajesSubte;
	}

	public static void main(String[] args) {
		TarjetaBaja tarjeta = new TarjetaBaja(1.0);
		tarjeta.pagarViajeEnSubte();

	}
}