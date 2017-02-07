import static org.junit.Assert.*;


import org.junit.Test;

public class TestNoob {
	private String str;
	/**
	 * test for whitespace string
	 */
	@Test
	public void testisEmpty1() {
		str = "      ";
		boolean b = Noob.isEmpty(str);
		assertEquals("Test for isEmpty(String): ", false, b);
	}
	/**
	 * test for empty string
	 */
	@Test
	public void testisEmpty2() {
		str = "";
		boolean b = Noob.isEmpty(str);
		assertEquals("Test for isEmpty(String): ", false, b);
	}
	/**
	 * test for string
	 */
	@Test
	public void testisEmpty3() {
		str = "This is a string of text.";
		boolean b = Noob.isEmpty(str);
		assertEquals("Test for isEmpty(String): ", true, b);
	}
	/**
	 * test for transforming string to leet
	 */
	@Test
	public void testleetTransfrom1() {
		str = "Let's have some fun.";
		String text = Noob.leetTransform(str);
		assertEquals("Test for leetTransform(String): ", "L37'5 h4v3 50m3 fun.",text);
	}
	/**
	 * test for transforming string to leet
	 */
	@Test
	public void testleetTransfrom2() {
		str = "C is for cookie, that's good enough for me";
		String text = Noob.leetTransform(str);
		assertEquals("Test for leetTransform(String): ", "C 15 f0r c00k13, 7h47'5 g00d 3n0ugh f0r m3",text);
	}
	/**
	 * test for transforming string to leet
	 */
	@Test
	public void testleetTransfrom3() {
		str = "By the power of Grayskull!";
		String text = Noob.leetTransform(str);
		assertEquals("Test for leetTransform(String): ", "By 7h3 p0w3r 0f Gr4y5kull!",text);
	}
	/**
	 * test for transforming string to leet
	 */
	@Test
	public void testleetTransfrom4() {
		str = "12345";
		String text = Noob.leetTransform(str);
		assertEquals("Test for leetTransform(String): ", "12345",text);
	}
	/**
	 * test for transforming string to leet
	 */
	@Test
	public void testleetTransfrom5() {
		str = "   ";
		String text = Noob.leetTransform(str);
		assertEquals("Test for leetTransform(String): ", "   ",text);
	}
	/**
	 * test for transforming string to leet
	 */
	@Test
	public void testleetTransfrom6() {
		str = "";
		String text = Noob.leetTransform(str);
		assertEquals("Test for leetTransform(String): ", "",text);
	}
}
