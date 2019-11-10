package AufgabeC4;		//Nils Schlegel
	
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Zettelkasten implements Iterable<Medium> {

	
	public ArrayList<Medium> myZettelkasten = new ArrayList<Medium>();	//ArrayListe
	private int lastSortOption = -1;
		
	
	/*
	public void go()
	{
		myZettelkasten.add(new Buch("Duden 01. Die deutsche Rechtschreibung", 2004, "Bibliographisches Institut, Mannheim", "3-411-04013-0", "-"));
		myZettelkasten.add(new CD("1", "Apple: (Bea (EMI)", "The Beatles"));
		myZettelkasten.add(new Zeitschrift("Der Spiegel", "0038-7452", 54, 6));
	}
	*/
	
	
	public void addMedium(Medium medium)	//Fügt Medien zur Liste hinzu
	{
		myZettelkasten.add(medium);
		
	}
	
	public void DropMedium(String title) throws Exception {	//löscht Medium durch Titel --> wenn Titel nicht vorhanden Meldung
		
		ArrayList<Medium> dropList = new ArrayList<Medium>();
		
		for(Medium med : myZettelkasten)
		{
			if(med.getTitel().equals(title))
			{
				//myZettelkasten.remove(med);
				dropList.add(med);
			}
		}
		
		if (dropList.isEmpty()) {
			System.out.println("Titel nicht gefunden. Es konnte kein Titel geloescht werden.");
		} else if (dropList.size() == 1) {
			myZettelkasten.remove(dropList.get(0));
		} else {
			throw new Exception("Mehrfache Einträge gefunden!");
		}
	}
	
    public void DropMedium(String title, boolean dropAll, Class<?> type ) throws Exception {	//löscht Medium durch Titel --> wenn Titel nicht vorhanden Meldung
		
		ArrayList<Medium> dropList = new ArrayList<Medium>();

		for (Medium med : myZettelkasten) {
			if (med.getTitel().equals(title)) {
				// myZettelkasten.remove(med);
				dropList.add(med);
			}
		}

		if (dropList.isEmpty()) {
			System.out.println("Titel nicht gefunden. Es konnte kein Titel geloescht werden.");
		} else if (dropList.size() == 1) {
			if (type == null || dropList.get(0).getClass() == type) {					
				myZettelkasten.remove(dropList.get(0));
			}
		} else if (dropAll) {
			for (Medium med : dropList) {
				if (type == null || med.getClass() == type) {					
					myZettelkasten.remove(med);
				}
			}
		} else {
			throw new Exception("Mehrfache Einträge gefunden!");
		}
	}
	
	//vergleiht die Titel der Medien in der ArrayList mit Titel des Übergebendem Mediums
	public ArrayList<Medium> FindMedium(String title) {	//findet Medium anhand von Titel --> Bei nihct finden wird null zurück gegeben
		
		ArrayList<Medium> findList = new ArrayList<Medium>();
		
		for(Medium med : myZettelkasten)
		{
			if(med.getTitel().equals(title))
			{
				System.out.println("Titel gefunden: "+ title);
				findList.add(med);
			}
		} 
		
		if (findList.isEmpty()) {		
			System.out.println("Titel nicht vorhanden.");
		}
		
		return findList;
	}
	
	
	// Sortieren der ArrayList anhand des Titels. Bei true wird vorwaerts bei false wird rueckwaerts sortiert
	public ArrayList<Medium> sort(boolean sortFromAtoZ)
	{
		if ((sortFromAtoZ == true && lastSortOption == 1) || (sortFromAtoZ == false && lastSortOption == 0)) {
			return myZettelkasten;
		}
		
		if(sortFromAtoZ == true)
		{
			Collections.sort(myZettelkasten);
			lastSortOption = 1;
		}
		if (sortFromAtoZ == false)
		{
			Collections.sort(myZettelkasten, Collections.reverseOrder());
			lastSortOption = 0;
		}
		return myZettelkasten;
			
	}
	
	
	@Override
	public Iterator<Medium> iterator() {
		return myZettelkasten.iterator();
	}
	
}