class WC {
	public String evaluate (String text) {
		WCLib lib = new WCLib();
		lib.countByes(text);
		lib.countWords(text);
		lib.countLines(text);
		return lib.lines + " " + lib.words + " " + lib.characters;
	}
}