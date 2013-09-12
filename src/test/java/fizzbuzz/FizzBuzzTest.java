package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void contadorEnCeroAlInicio() {
		assertEquals(fb.tamanho(),1);
	}
	
}
