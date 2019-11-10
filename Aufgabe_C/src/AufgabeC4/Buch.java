package AufgabeC4;		//Nils Schlegel

public class Buch extends Medium{

	private int erscheinungsjahr;
	private String verlag;
	private String isbn;
	private String verfasser;
	
	public Buch(String titel, int erscheinungsjahr, String verlag, String isbn, String verfasser) 
	{
			super(titel);
			setErscheinungsjahr(erscheinungsjahr);
			setVerlag(verlag);
			setISBN(isbn);
			setVerfasser(verfasser);
	}
	
	
	
	public int getErscheinungsjahr() {
		return erscheinungsjahr;
	}
	public void setErscheinungsjahr(int erscheinungsjahr) {
		this.erscheinungsjahr = erscheinungsjahr;
	}
	
	
	public String getVerlag() {
		return verlag;
	}
	
	public void checkISBN() {
		
	}
	
	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}
	
	
	public String getISBN() {
		return isbn;
	}
	public void setISBN(String isbn) {
		this.isbn = isbn;
	}
	
	
	public String getVerfasser() {
		return verfasser;
	}
	public void setVerfasser(String verfasser) {
		this.verfasser = verfasser;
	}
	
	@Override
	public String calculateRepresentation()  // Erstellung der Representationen
	{
		StringBuilder infos = new StringBuilder();
		infos.append("Title: ");
		infos.append(getTitel());
		infos.append("\n");
		
		infos.append("Erscheinungsjahr: ");
		infos.append(getErscheinungsjahr());
		infos.append("\n");
		
		infos.append("Verlag: ");
		infos.append(getVerlag());
		infos.append("\n");
		
		infos.append("ISBN: ");
		infos.append(getISBN());
		infos.append("\n");
		
		infos.append("Verfasser: ");
		infos.append(getVerfasser());
		//infos.append("\n");
		
		return infos.toString();
	}
	
	
}
