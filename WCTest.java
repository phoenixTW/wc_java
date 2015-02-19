import java.io.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class WCTest {
	
	@Test
	public void add_1_and_2_gives_3 () {
		assertEquals(1 + 2, 3);
	}

	@Test
	public void wc_should_return_0_2_11_for_hello_world () {
		String sentence = new String("hello world");
		WCmain newWC = new WCmain();
		assertEquals(newWC.evaluate(sentence), "0 2 11");
	}

	@Test
	public void wc_should_return_0_3_14_for_hello_my_world () {
		String sentence = new String("hello my world");
		WCmain newWC = new WCmain();
		assertEquals(newWC.evaluate(sentence), "0 3 14");
	}

	@Test
	public void wc_should_return_1_3_15_for_hello_newLine_my_world () {
		String sentence = new String("hello\nmy world");
		WCmain newWC = new WCmain();
		assertEquals(newWC.evaluate(sentence), "1 3 14");
	}

	@Test
	public void wc_should_return_1_for_hello_newLine_my_world_when_l_option_is_given () {
		String sentence = new String("hello\nmy world");
		WCmain newWC = new WCmain("-l");
		assertEquals(newWC.evaluate(sentence), "1");
	}

	@Test
	public void wc_should_return_0_for_hello_world_when_l_option_is_given () {
		String sentence = new String("hello world");
		WCmain newWC = new WCmain("-l");
		assertEquals(newWC.evaluate(sentence), "0");
	}

	@Test
	public void wc_should_return_14_for_hello_newLine_my_world_when_c_option_is_given () {
		String sentence = new String("hello\nmy world");
		WCmain newWC = new WCmain("-c");
		assertEquals(newWC.evaluate(sentence), "14");
	}

	@Test
	public void wc_should_return_11_for_hello_world_when_c_option_is_given () {
		String sentence = new String("hello world");
		WCmain newWC = new WCmain("-c");
		assertEquals(newWC.evaluate(sentence), "11");
	}

	@Test
	public void wc_should_return_3_for_hello_newLine_my_world_when_w_option_is_given () {
		String sentence = new String("hello\nmy world");
		WCmain newWC = new WCmain("-w");
		assertEquals(newWC.evaluate(sentence), "3");
	}

	@Test
	public void wc_should_return_2_for_hello_world_when_w_option_is_given () {
		String sentence = new String("hello world");
		WCmain newWC = new WCmain("-w");
		assertEquals(newWC.evaluate(sentence), "2");
	}

	@Test
	public void readText_should_return_hello_world () throws IOException {
		FileHandler file = new FileHandler("one.txt");
		String content = file.readText();
		assertEquals(content, "hello world");
		assertEquals(file.path, "one.txt");
	}
}