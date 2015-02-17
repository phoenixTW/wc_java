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
		WC newWC = new WC();
		assertEquals(newWC.evaluate(sentence), "0 2 11");
	}

	@Test
	public void wc_should_return_0_3_14_for_hello_my_world () {
		String sentence = new String("hello world");
		WC newWC = new WC();
		assertEquals(newWC.evaluate(sentence), "0 3 14");
	}
}