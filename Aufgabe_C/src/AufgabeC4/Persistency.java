package AufgabeC4;	//Nils Schlegel
	
public interface Persistency {


	public void save(Zettelkasten zk, String dateiname);
    public Zettelkasten load(String dateiname);
}
