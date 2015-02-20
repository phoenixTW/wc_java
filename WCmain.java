class WCmain {
	private String option;
	private String pathname;

	public WCmain () {
		this.pathname = null;
		this.option = null;
	}

	public WCmain (String pathname) {
		this.pathname = pathname;
		option = null;
	}

	public WCmain(String usrOption, String pathname) {
		this.pathname = pathname;
		option = usrOption;
	}

	public String evaluate (String text) {
		WCLib lib = new WCLib();
		
		if(option != null) {
			switch(option) {
				case "-l" : return "\t" + lib.countLines(text);
				case "-c" : return "\t" + lib.countByes(text);
				case "-w" : return "\t" + lib.countWords(text);
				case "-L" : return "\t" + lib.findLargestLine(text) + "\t" + lib.contentOfLine;
				case "-S" : return "\t" + lib.findShortestLine(text) + "\t" + lib.contentOfLine;
			}
		}

		return "\t" + lib.countLines(text) + "\t" + lib.countWords(text) + "\t" + lib.countByes(text);
	}

}