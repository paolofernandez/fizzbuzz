package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void imprimeNumero() {
		assertEquals(fb.imprimir(1),"1");
	}
	
	@Test
	public void imprimeFizzEnMultiplosDe3() {
		assertEquals(fb.imprimir(3),"fizz");
	}
}
