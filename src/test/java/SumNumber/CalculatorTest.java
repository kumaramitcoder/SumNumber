package SumNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {

	Calculator c;
	String ss ="Calling Before";
	
	@Before
	public void prepareForTest() {
		c = new Calculator();
		System.out.println(ss);
	}
	
	@Test
	public void sumTest()
	{
	    assertEquals(5, c.sum(2,3));
	    System.out.println(ss);
	}
	
	@Test
	public void subTest() {
		assertEquals(-1, c.sub(2,3));
		System.out.println(ss);
	}
	
	@Test
	public void mulTest() {
		assertEquals(6, c.mul(2,3));
		System.out.println(ss);
	}
	
	@Test
	public void divTest() {
		assertEquals(0, c.dic(2,3));
	}

}
