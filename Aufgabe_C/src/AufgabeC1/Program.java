package AufgabeC1;	//Nils Schlegel

import java.io.*;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Adresse adresse = new Adresse(); // neues Objekt erzeugen
		adresse.setStrasse("Ringstr. 1"); // setzen des Straßennamens
		adresse.setOrt("Musterstadt"); // setzen des Ortes

		Person hugo = new Person(); // neues Objekt Person(hugo) erstellen
		hugo.setName("Hugo Schmidt"); // Namen setzen
		hugo.setAdresse(adresse); // adress zuweisen von Adresse

		Person erika = new Person(); // neues Objekt Person(Erika) erstellen
		erika.setName("Erika Schmidt"); // Namen setzen
		erika.setAdresse(adresse); // Wert für adresse setzen(verweis auf Adresse)

		// Hier fehlt Ihr Code
		ArrayList test = new ArrayList(); // erstellen einer ArrayList
		test.add(erika); // Die Werte von Erika hinzufühgen
		test.add(hugo); // Die Werte von Hugo hinzufühgen

		// Serialisierung
		try { // versuche das auszuführen
			FileOutputStream fos = new FileOutputStream("test.txt"); // lege die Datei an schreibt das
																		// serialisierteIbjekt in die datei
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(test); // test wird serialisiert
			os.close(); // schließen des Streams
			fos.close();
		} catch (IOException e) { // verhalten bei Fehler
			System.out.println(e.toString());
		}
		
		// Deserislisierung
		try {
			FileInputStream fis = new FileInputStream("test.txt"); // FileInputStream für die datei test.txt wird
																	// geöffnet
			ObjectInputStream is = new ObjectInputStream(fis);// übergibt diesen an den Konstruktor des
																// ObjectInputStream object is
			
			is.close();
			fis.close();

		} catch (IOException ieo) {
			ieo.printStackTrace();
			return;
		} 
		for (int i = 0; i < test.size(); i++) { // ausgabe der Inhalte der ArrayList
			System.out.print(test.get(i) + "\n");

		} // https://beginnersbook.com/2013/12/how-to-serialize-arraylist-in-java/

		//Testen ob bei Deserialsierung die Adresse nur einmal deserialisiert wurde
		if (erika.getAdresse()==hugo.getAdresse()) {	//==Adresse muss auf die gleiche Referenz zeigen
			System.out.println("Adresse wurde nur einmal Deserialisiert");	//Wenn die Referenz gleich ist wurde das Objekt nur einmal deserialisert un zugewiesen
		}else {
			System.out.println("Adresse wurde mehr fach Deserialsiert");//Wenn das Objekt verschiedene Referenzen hat wurde es mehr fach Deserialisiert
		}	
		
		
	}

}