class WCLib {
	int lines, words, characters;

	public int countLines (String text) {
		String[] separated = text.split("\n");
		this.lines = separated.length - 1;
		return separated.length - 1;
	}
}