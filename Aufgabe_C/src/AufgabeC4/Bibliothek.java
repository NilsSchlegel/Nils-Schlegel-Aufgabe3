package AufgabeC4;	//Nils Schlegel

import java.util.ArrayList;

public class Bibliothek {
	
	public static void main(String[] args) {

		Zettelkasten zettelkasten = new Zettelkasten();
		// zettelkasten.go(); // der in Zettelkasten erw�hnte, Aufruf der Methode (laut
		// Vorgabe hier fehl am Platz)
		zettelkasten.addMedium(new CD("Live At Wembley", "Queen", "Parlophone (EMI)"));

		// ... und hier noch 3 weitere Statements
		// zum Hinzufügen von Medien
		zettelkasten.addMedium(new CD("1", "Apple (Bea(EMI)", "The Beatles"));
		zettelkasten.addMedium(new Buch("Duden 01. Die deutsche Rechtschreibung", 2004,
				"Bibliographisches Institut, Mannheim", "3-411-04013-0", "-"));
		zettelkasten.addMedium(new Zeitschrift("Der Spiegel", "0038-7452", 54, 6));
		zettelkasten.addMedium(new Buch("Der Spiegel", 2004,
				"Bibliographisches Institut, Mannheim", "3-411-04013-0", "-"));
		//zettelkasten.sort(false); // für Aufgabe C.5

		for (Medium medium : zettelkasten) {
			System.out.println(medium.calculateRepresentation());
		}
		
		/*
		//beispielehaft löschen
		try {
			zettelkasten.DropMedium("1", false, CD.class);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		System.out.println("");
		System.out.println("--- nach dem löschen ---");
		
		for (Medium medium : zettelkasten) {
			System.out.println(medium.calculateRepresentation());
		}

		//suchen
		System.out.println("");
		System.out.println("--- finde Medium ---");
		ArrayList<Medium> meds = zettelkasten.FindMedium("Live At Wembley"
				+ "");
		if (meds != null) {
		
			for (Medium medium : meds) {
				System.out.println(medium.calculateRepresentation());
			}
		}
		
		//sortieren
		System.out.println("");
		System.out.println("--- sortieren von A nach Z ---");
		zettelkasten.sort(true);
		for (Medium medium : zettelkasten) {
			System.out.println(medium.calculateRepresentation());
		}
		
		// sortieren
		System.out.println("");
		System.out.println("--- sortieren von Z nach A ---");
		zettelkasten.sort(false);
		for (Medium medium : zettelkasten) {
			System.out.println(medium.calculateRepresentation());
		}
		
		zettelkasten.sort(false);
		zettelkasten.sort(true);
		*/
		
		BinaryPersistency bp = new BinaryPersistency();
		bp.save(zettelkasten, "bptest");
		Zettelkasten zkneu = bp.load("bptest");

		for (Medium medium : zkneu) {
			System.out.println(medium.calculateRepresentation());
		}

		HumanReadablePersistency hrp = new HumanReadablePersistency();
		hrp.save(zettelkasten, "hrptest.txt");
		try {
			hrp.load("hrptest.txt");
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		
	}

}