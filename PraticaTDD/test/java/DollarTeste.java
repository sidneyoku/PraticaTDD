import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DollarTeste {
	
	@Test
	public void testMultiplication_1() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(new Dollar(15), product);
	}
	
	@Test
	public void testMultiplication_2() {
		Dollar five = new Dollar(5);
	    assertEquals(new Dollar(10), five.times(2));
	    assertEquals(new Dollar(15), five.times(3));
	}
	
	@Test
	public void testEquality() {
	   assertTrue(new Dollar(5).equals(new Dollar(5)));
	   assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
	
}
