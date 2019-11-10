package AufgabeC4;	//Nils Schlegel

public class CD extends Medium{

	private String label;
	private String kuenstler;
	
	
	public CD(String titel, String label, String kuenstler) {	//Konstruktor
		super(titel);
		setLabel(label);
		setKuenstler(kuenstler);
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public String getKuenstler() {
		return kuenstler;
	}


	public void setKuenstler(String kuenstler) {
		this.kuenstler = kuenstler;
	}
	
	@Override
	public String calculateRepresentation()  // Erstellung der Representationen
	{
		StringBuilder infos = new StringBuilder();
		
		infos.append("Titel: ");
		infos.append(getTitel());
		infos.append("\n");
		
		infos.append("Label: ");
		infos.append(getLabel());
		infos.append("\n");
		
		infos.append("Kuenstler: ");
		infos.append(getKuenstler());
		infos.append("\n");
		
		return infos.toString();
	}
	
	
	
	

}