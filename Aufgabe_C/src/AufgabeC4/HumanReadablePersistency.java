package AufgabeC4;	//Nils Schlegel

import java.io.*;

public class HumanReadablePersistency implements Persistency{

	@Override
    public void save(Zettelkasten zk, String dateiname) 
	{
        try 
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(dateiname));

            for(Medium medium : zk)
            {
                bw.write(medium.calculateRepresentation());
                bw.newLine();
            }

            bw.flush();
            bw.close();
            }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    @Override
    public Zettelkasten load(String dateiname) throws UnsupportedOperationException
    {

        throw new UnsupportedOperationException();
    }
}
