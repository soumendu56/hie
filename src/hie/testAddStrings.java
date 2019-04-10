package hie;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		LAB teststring=new LAB();
		String result=teststring.addStrings("Messi", "Ronaldo");
		assertEquals("MessiRonaldo",result);
	}

}
