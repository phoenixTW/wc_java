import java.io.*;

class FileHandler{
	String path = null;

	FileHandler (String pathName){
		path = pathName;
	}

	public String readText () throws IOException {
		String text = null;
		File thisFile = new File("./" + path);
		FileReader fr = null;
		
		try {
			fr = new FileReader(thisFile);
		} catch(Exception e) {
			System.out.println("File Not Found");
		}

		BufferedReader br = new BufferedReader(fr);
		int length = (int)thisFile.length();
		char cbuf[] = new char[length];
		br.read(cbuf,0,length);
		text = new String (cbuf);
		
		return text;
	}
}