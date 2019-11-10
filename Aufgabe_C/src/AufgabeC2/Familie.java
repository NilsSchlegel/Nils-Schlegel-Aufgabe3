package AufgabeC2;	//Nils Schlegel

import java.util.ArrayList;
import java.util.Iterator;

public class Familie implements Iterable<String> {
	
private ArrayList<String> mitglieder = new ArrayList<String>();	//anlegen der ArrayList

	
	public Familie(String vater, String mutter) throws IllegalArgumentException {	//Konstruktor mit zwei Parameter
		if (vater.isEmpty() || mutter.isEmpty()) {	//Prüfen ob werte gesatzt sind --> leerer Name
			throw new IllegalArgumentException("Vater oder Mutter ist ein leerer String");
		} else {
			this.mitglieder.add(0, vater);
			this.mitglieder.add(1, mutter);
		}
	}

	public void addKind(String kind) throws IllegalArgumentException {	//Methode zum Hinzufügen von Kindern zur Familie
		if (kind.isEmpty()) {	//prüfen ob Kind leer ist --> Leerer Name
			throw new IllegalArgumentException("Kind ist ein leerer String");
		} else {
			this.mitglieder.add(kind);
		}
	}

	enum Familienmitglied {	//Enum aufzählung von Vater, Mutter, Kind
		Vater, Mutter, Kinder
	}

	public String getMitglied(Familienmitglied mitglied) {
		if (mitglied == Familienmitglied.Vater)

			return this.mitglieder.get(0);	//Gibt den Vater zurück

		else if (mitglied == Familienmitglied.Mutter)

			return this.mitglieder.get(1);	//gibt die Mutter zurück

		
		//bei einem kinderlosen Ehepaar muss der Zugriff auf Array-Elemente ab Position 2 verhindert werden
		if (mitglieder.size() <= 2)
			return " ";	//leerer Strin wenn Familien Mitglied nicht existiert
			
		StringBuilder ausgabe = new StringBuilder();

		for (int i = 2; i < this.mitglieder.size(); i++) {
			ausgabe.append(this.mitglieder.get(i) + ", ");
		}

		return ausgabe.toString();
	}

	@Override
	public Iterator<String> iterator() {
		return mitglieder.iterator();
	}
	
	

}