package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void imprimeUnNumero() {
		assertEquals(fb.imprimir(1),"1");
	}
	
	@Test
	public void imprimeFizzEnMultiplosDe3() {
		assertEquals(fb.imprimir(3),"fizz");
	}
	
	@Test
	public void imprimeBuzzEnMultiplosDe5() {
		assertEquals(fb.imprimir(5),"buzz");
	}
	
	@Test
	public void imprimeFizzBuzzEnMultiplosDe3y5() {
		assertEquals(fb.imprimir(15),"fizzbuzz");
	}
	
	@Test
	public void imprimeUnaSerie() {
		assertEquals(fb.imprimirSerie(16),"1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16");
	}
}
