import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void noImprimeNadaParaCero() {
		assertEquals(fb.imprimir(0),"");
	}
	
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
		assertEquals(fb.imprimirSerie(16),"1/n 2/n fizz/n 4/n buzz/n fizz/n 7/n 8/n fizz/n buzz/n 11/n fizz/n 13/n 14/n fizzbuzz/n 16");
	}

}