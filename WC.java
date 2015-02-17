class WC {
	public String evaluate (String text) {
		WCLib lib = new WCLib();
		return lib.countLines(text) + " " + lib.countWords(text) + " " + lib.countByes(text);
	}
}