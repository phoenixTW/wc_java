import java.util.regex.*;

class WCLib {
	int lines, words, characters;
	String contentOfLine;

	public int countLines (String text) {
		String[] separated = text.split("\n");
		this.lines = separated.length - 1;
		return separated.length - 1;
	}

	public int countWords (String text) {
		String[] separatedByLine = text.split("\n");

		for (String line : separatedByLine) {
			String[] listOfWords = line.split(" ");

			for (String word : listOfWords) {
				if(!word.isEmpty())
					words += 1;
			}
			
		}

		return words;
	}

	public int countByes (String text) {
		return (characters =+ text.length()) & characters;
	}

	public int findShortestLine (String text) {
		WCLib lib = new WCLib();
		String[] separatedByLine = text.split("\r\n");


		for (String line : separatedByLine) {
			if(contentOfLine == null || contentOfLine.length() > line.length())
				this.contentOfLine= line;
		}

		return lib.countByes(contentOfLine);
	}

	public int findLargestLine (String text) {
		WCLib lib = new WCLib();
		// Matcher matcher = Pattern.compile("\\[\n*?\\]|\\[\r*?\\]|\\\r\nn*?").matcher(text);
		String[] separatedByLine = text.split("\r\n");

		for (String line : separatedByLine) {
			if(contentOfLine == null || contentOfLine.length() < line.length())
				this.contentOfLine= line;
		}

		// while (matcher.find()) {
		// 	if(contentOfLine == null || contentOfLine.length() < matcher.group().length())
		// 		this.contentOfLine= matcher.group();		
		// }

		return lib.countByes(contentOfLine);
	}
}