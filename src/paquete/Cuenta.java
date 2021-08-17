package paquete;

public class Cuenta {
	private double saldo;

	/**
	 * @pre: el saldo inicial no puede ser negativo
	 * @post: el saldo es el saldo inicial
	 * @param saldo
	 */
	public Cuenta(double saldo) {
		this.validarSaldoInicial(saldo);
		this.saldo = saldo;
	}

	public Cuenta() {
		this(0);
	}

	private void validarSaldoInicial(double saldoInicial) {
		if (saldoInicial < 0) {
			throw new Error("El saldo inicial de la cuenta no puede ser negativo");
		}
	}

	/**
	 * @post: devuelve el saldo de la cuenta
	 * @return
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * @pre: el monto a depositar no puede ser negativo
	 * @post: se incrementa el saldo en monto
	 * @param monto
	 */
	public void depositar(double monto) {
		this.validarMontoADepositar(monto);
		this.saldo += monto;

	}

	private void validarMontoADepositar(double monto) {
		if (monto < 0) {
			throw new Error("El monto a depositar en la cuenta no puede ser negativo");
		}
	}

	/**
	 * @pre: no puedo extraer un monto negativo
	 * @post: se decrementa elsaldo en monto
	 * @return: devuelve si la operacion se pudo realizar
	 * @param monto
	 * @return
	 */
	public boolean extraer(double monto) {
		boolean operacionRealizada = false;
		this.validarMontoAExtraer(monto);
		if (this.saldo >= monto) {
			this.saldo -= monto;
			operacionRealizada = true;
		}
		return operacionRealizada;
	}

	private void validarMontoAExtraer(double monto) {
		if (monto < 0) {
			throw new Error("El monto a extraer de la cuenta no puede ser negativo");
		}
	}

	public void transferir(double monto, Cuenta cuentraATransferir) {
		if (this.extraer(monto)) {
			cuentraATransferir.depositar(monto);
		}
	}

}
