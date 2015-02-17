class WCLib {
	int lines, words, characters;

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
}