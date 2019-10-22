package SumNumber;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.Mockito;

public class SumUnitTest {
	
	@Test
	public void test() {
		assertTrue(true);
	}
	
	@Test
	public void constructorTest() {
		Sum s = new Sum(2,3);
		assertNotNull(s);
	}
	
	@Test
	public void fake() {
		assertTrue(false);
	}
	
	@Test
	public void test2() {
		Sum s = new Sum();
		assertEquals(5, s.sumofnumbers(2, 3));
	}
	
	@Test
	public void test3() {
		Sum s = new Sum();
		assertEquals(1, s.subtract(3, 2));
	}
}
