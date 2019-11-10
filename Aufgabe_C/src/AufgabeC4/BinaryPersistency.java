package AufgabeC4;	//Nils Schlegel

import java.io.*;

public class BinaryPersistency implements Persistency {


    public void save(Zettelkasten zk, String dateiname) 
	{

        try
        {
            FileOutputStream fos = new FileOutputStream(dateiname);	//Schreiben
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for(Medium medium : zk)
            {
                oos.writeObject(medium);
            }

            oos.close();
            fos.close();
            System.out.println("Serialisierung erfolgreich!");

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public Zettelkasten load(String dateiname){

        try
        {
            Zettelkasten zettelkasten = new Zettelkasten();
        	
            FileInputStream fis = new FileInputStream(dateiname);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            while(true)
            {
            	try
            	{
            		Medium med = (Medium)ois.readObject();
            		zettelkasten.addMedium(med);
            		System.out.println(med.calculateRepresentation());
            	}
            catch(EOFException e)
            	{
            	break;
            	}
            }
            ois.close();
            fis.close();

            return zettelkasten;
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
