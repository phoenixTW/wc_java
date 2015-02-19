import java.io.*;

class WC {
	public static void main(String[] args) throws IOException{
		String filename = args[0];
		String option = null;
		String content = null;

		try {
			option = args[1];
			
		} catch (Exception e) {

			WCmain newWC = new WCmain();
			FileHandler file = new FileHandler(filename);
			content = file.readText();
			System.out.println(newWC.evaluate(content) + "\t" + filename);
			return;
		}

		System.out.println(filename + "   " + option);
	}
}