package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanTest {

    public RomanTest() {}
	
	@Test
    public void testI() {
	    assertEquals(Roman.toRoman(1), "I");
    }

    @Test
    public void testII() {
	    assertEquals(Roman.toRoman(2), "II");
    }

    @Test
    public void testIII() {
	    assertEquals(Roman.toRoman(3), "III");
    }

}
