package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void contadorEnCeroAlInicio() {
		assertEquals(fb.posision(),0);
	}
	
	@Test
	public void imprimeNumero() {
		assertEquals(fb.imprimir(),"0");
	}
	
	@Test
	public void pasaAlSiguienteNumeroDespuesDeImprimir() {
		fb.imprimir();
		assertEquals(fb.posision(),1);
	}
}
