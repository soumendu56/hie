package hie;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		LAB jtest =new LAB();
		int result= jtest.addnumbers(160, 150);
		assertEquals(310,result);
	}

}
