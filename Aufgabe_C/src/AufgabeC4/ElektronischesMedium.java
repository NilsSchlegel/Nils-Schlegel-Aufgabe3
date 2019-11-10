package AufgabeC4;	//Nils Schlegel

public class ElektronischesMedium extends Medium{
	
	
	private String URL;

	public ElektronischesMedium(String titel, String uRL) {
		super(titel);
		
		setURL(uRL);
	}
	
	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public void checkURL(boolean URL) {

		//Die Funktionalität muss implementiert werden...
		throw new UnsupportedOperationException();
	}
	
	

}
