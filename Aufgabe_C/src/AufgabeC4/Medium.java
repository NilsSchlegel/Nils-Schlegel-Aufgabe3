package AufgabeC4;	//Nils Schlegel

import java.io.Serializable;

public abstract class Medium implements Comparable<Medium>, Serializable{
	
	private String titel;
	
	public Medium(String titel) {
		setTitel(titel);
	}
	
	public void setTitel(String titel) {
		this.titel=titel;
	}
	
	public String getTitel() {
		return titel;
	}

	public String calculateRepresentation()  // Erstellung der Representationen
	{
		StringBuilder infos = new StringBuilder();
		infos.append(getTitel()+".");
		return infos.toString();
	}
	
	@Override
	public String toString() {
		return calculateRepresentation();
	}
	
	@Override
	public int compareTo(Medium med)	//sortieren der Medien
	{
		//return this.getTitel().compareTo(med.getTitel());
		
		int result = this.getTitel().compareTo(med.getTitel());
		
		if (result != 0) {
			return result;
		}
	
		return  this.getClass().toString().compareTo(med.getClass().toString());
		
	}
}
