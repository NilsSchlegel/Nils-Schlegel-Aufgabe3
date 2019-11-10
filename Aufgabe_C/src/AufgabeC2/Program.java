package AufgabeC2;	//Nils Schlegel

import AufgabeC2.Familie.Familienmitglied;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Familie f1 = new Familie("Ingo", "Inge");	//Familie mit zwei Kinder instanzieren, Vater/Mutter
		f1.addKind("Igor");//Kinder
		f1.addKind("Ilse");
		
		System.out.println(f1.getMitglied(Familienmitglied.Vater));	//Ermitteln und ausgaben des Vaters, Mutter und der Kinder
		System.out.println(f1.getMitglied(Familienmitglied.Mutter));
		System.out.println(f1.getMitglied(Familienmitglied.Kinder));
		System.out.println(f1.getMitglied(Familienmitglied.Kinder));
		
		Familie f2 = new Familie("Anton", "Anna");
		System.out.println(f2.getMitglied(Familienmitglied.Vater));
		System.out.println(f2.getMitglied(Familienmitglied.Mutter));
		
		
		
		/*Familie f3 = new Familie("David", "");
		System.out.println(f3.getMitglied(Familienmitglied.Vater));
		System.out.println(f3.getMitglied(Familienmitglied.Mutter));
		Familie f4 = new Familie("", "Lisa");
		System.out.println(f4.getMitglied(Familienmitglied.Vater));
		System.out.println(f4.getMitglied(Familienmitglied.Mutter)); */
		
		//Familie familie = ...
				for (String name : f1) 
				{
				System.out.println(name);
				}
		
				
	}

}
