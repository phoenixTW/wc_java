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

	@Test
	public void countLines_should_return_1_for_hello_world_sperated_by_new_line () {
		WCLib lib = new WCLib();
		assertEquals(lib.countLines("hello\nworld"), 1);
		assertEquals(lib.lines, 1);
	}

	@Test
	public void countLines_should_return_2_for_hello_my_world_sperated_by_new_line () {
		WCLib lib = new WCLib();
		assertEquals(lib.countLines("hello\nmy\nworld"), 2);
		assertEquals(lib.lines, 2);
	}

	@Test
	public void countLines_should_return_1_for_hello_my_world_sperated_by_new_line_with_return () {
		WCLib lib = new WCLib();
		assertEquals(lib.countLines("hello\r\nworld"), 1);
		assertEquals(lib.lines, 1);
	}


	@Test
	public void countWords_should_return_1_for_hello () {
		WCLib lib = new WCLib();
		assertEquals(lib.countWords("hello"), 1);
		assertEquals(lib.words, 1);
	}

	@Test
	public void countWords_should_return_1_for_hello_world_sperated_by_new_Line () {
		WCLib lib = new WCLib();
		assertEquals(lib.countWords("hello\nworld"), 2);
		assertEquals(lib.words, 2);
	}

	@Test
	public void countWords_should_return_2_for_hello_world_sperated_by_more_spaces () {
		WCLib lib = new WCLib();
		assertEquals(lib.countWords("hello         world"), 2);
		assertEquals(lib.words, 2);
	}

	@Test
	public void countBytes_should_return_5_for_hello () {
		WCLib lib = new WCLib();
		assertEquals(lib.countByes("hello"), 5);
		assertEquals(lib.characters, 5);
	}

	@Test
	public void countBytes_should_return_11_for_hello () {
		WCLib lib = new WCLib();
		assertEquals(lib.countByes("hello world"), 11);
		assertEquals(lib.characters, 11);
	}
}