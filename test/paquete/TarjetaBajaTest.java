package paquete;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TarjetaBajaTest {

	@Test
	public void puedoViajarEnSubte() {
		TarjetaBaja tarjeta = new TarjetaBaja(19.50);
		tarjeta.pagarViajeEnSubte();
		assertEquals(0, tarjeta.obtenerSaldo(),0.01);
		assertEquals(1, tarjeta.contarViajesEnSubte());
	}
	@Test
	public void puedoViajarEnColectivo() {
		TarjetaBaja tarjeta = new TarjetaBaja(21.50);
		tarjeta.pagarViajeEnColectivo();
		assertEquals(0, tarjeta.obtenerSaldo(),0.01);
		assertEquals(1, tarjeta.contarViajesEnColectivo());
	}

	@Test(expected = Error.class)
	public void noPuedoViajarEnColectivo() {
		TarjetaBaja tarjeta = new TarjetaBaja(1.50);
		tarjeta.pagarViajeEnColectivo();
	}

}
