package AufgabeC1;	//Nils Schlegel

public class Person {

	private String name;
	private Adresse adresse;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String toString() {
		return new StringBuilder().append(name).append(", ").append(adresse.toString()).toString();
	}
}
