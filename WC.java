import java.io.*;

class WC {
	public static void main(String[] args) throws IOException{
		String filename = args[0];
		String option = null;
		String content = null;
		WCmain newWC = new WCmain(filename);
		FileHandler file = new FileHandler(filename);
		content = file.readText();

		try {
			option = args[1];

		} catch (Exception e) {
			System.out.println(newWC.evaluate(content) + "\t" + file.path);
			return;
		}

		newWC = new WCmain(option, filename);
		System.out.println(newWC.evaluate(content) + "\t" + file.path);
	}
}