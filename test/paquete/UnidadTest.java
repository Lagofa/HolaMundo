package paquete;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnidadTest {

	@Test
	public void distanciaConOtraUnidad() {
		Unidad u1 = new Unidad(new Posicion(0, 0));
		Unidad u2 = new Unidad(new Posicion(1, 1));
		assertEquals(Math.sqrt(2), u1.distanciaCon(u2), 0);
	}

}
