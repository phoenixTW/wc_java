import org.junit.Test;
import static org.junit.Assert.*;

public class WCLibTest {
	
	@Test
	public void add_1_and_2_gives_3 () {
		assertEquals(1 + 2, 3);
	}

	@Test
	public void WCLib_should_initialized_with_zero () {
		WCLib lib = new WCLib();
		assertEquals(lib.lines, 0);
		assertEquals(lib.words, 0);
		assertEquals(lib.characters, 0);
	}

	@Test
	public void countLines_should_return_0_for_hello () {
		WCLib lib = new WCLib();
		assertEquals(lib.countLines("hello"), 0);
	}
}