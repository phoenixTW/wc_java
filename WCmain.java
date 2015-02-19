class WCmain {
	private String option;

	public WCmain () {
		option = null;
	}

	public WCmain(String usrOption) {
		option = usrOption;
	}

	public String evaluate (String text) {
		WCLib lib = new WCLib();
		
		if(option != null) {
			switch(option) {
				case "-l" : return "" + lib.countLines(text);
				case "-c" : return "" + lib.countByes(text);
				case "-w" : return "" + lib.countWords(text);
			}
		}

		return lib.countLines(text) + " " + lib.countWords(text) + " " + lib.countByes(text);
	}

}