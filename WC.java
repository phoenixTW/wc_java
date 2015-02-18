class WC {
	private String option;

	public WC () {
		option = null;
	}

	public WC(String usrOption) {
		option = usrOption;
	}

	public String evaluate (String text) {
		WCLib lib = new WCLib();
		
		if(option != null) {
			switch(option) {
				case "-l" : return "" + lib.countLines(text);
			}
		}

		return lib.countLines(text) + " " + lib.countWords(text) + " " + lib.countByes(text);
	}

}