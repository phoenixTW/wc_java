class WCLib {
	int lines, words, characters;

	public int countLines (String text) {
		String[] separated = text.split("\n");
		return separated.length - 1;
	}
}