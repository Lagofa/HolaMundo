package paquete;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PosicionTest {

	@Test
	public void distanciaConmigoEs0() {
		Posicion pos = new Posicion(0, 0);
		assertEquals(0, pos.distanciaCon(pos), 0);
	}
	@Test
	public void distanciaConmigoOtroPunto() {
		Posicion pos = new Posicion(0, 0);
		Posicion pos1 = new Posicion(2, 0);
		assertEquals(2, pos.distanciaCon(pos1), 0);
	}


}
