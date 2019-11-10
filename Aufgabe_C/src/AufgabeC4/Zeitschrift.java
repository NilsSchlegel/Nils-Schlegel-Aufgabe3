package AufgabeC4;		//Nils Schlegel

public class Zeitschrift extends Medium{

	private String issn;
	private int volume;
	private int nummer;
	
	
	public Zeitschrift(String titel, String issn, int volumen, int nummer) {
		super(titel);
		setIssn(issn);
		setVolume(volumen);
		setNummer(nummer);
	}


	public String getIssn() {
		return issn;
	}


	public void setIssn(String issn) {
		this.issn = issn;
	}

	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}
	

	public int getNummer() {
		return nummer;
	}


	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	
	
	@Override
	public String calculateRepresentation()  // Erstellung der Representationen
	{
		StringBuilder infos = new StringBuilder();
		infos.append("Title: ");
		infos.append(getTitel());
		infos.append("\n");
		
		infos.append("ISSN: ");
		infos.append(getIssn());
		infos.append("\n");
		
		infos.append("Volumen: ");
		infos.append(getVolume());
		infos.append("\n");
		
		infos.append("Nummer: ");
		infos.append(getNummer());
		infos.append("\n");
	
		
		return infos.toString();
	}

	
	
	
	
	

}
