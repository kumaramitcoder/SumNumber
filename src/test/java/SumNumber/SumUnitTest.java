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
}
