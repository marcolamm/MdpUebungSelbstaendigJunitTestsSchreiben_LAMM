package mdpJunitDemo;

import static org.junit.Assert.*;

import org.junit.*;

public class TestMdpJunitDemo {
	String s = "mdP"; // der zu testende String
	String a = "a";
	String b = "b";
	String c = "c";

	@Test
	public void testMdpJunitDemo() {
		MdpJunitDemoLamm test = new MdpJunitDemoLamm();

	}

	@Test
	public void testDaten() {
		MdpJunitDemoLamm test = new MdpJunitDemoLamm();

		assertFalse(test.isEmpty(s));
		assertEquals(test.capitalize(s), "Mdp");
		assertEquals(test.reverse(s), "Pdm");
		assertEquals("a b c", test.join(a,b,c));
	}

}