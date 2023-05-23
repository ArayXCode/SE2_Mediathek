import java.io.FileWriter;
import java.io.IOException;

/**
 * Eine Klasse zum Protokollieren von Verleihen
 * @author TimGr
 *
 */
public class VerleihProtokollierer
{
    
    //private static final String EREGNIS = "Ausleihe";
    //private static final Verleihkarte VERLEIHKARTE = new Verleihkarte(null, null, null);

    /**
     * 
     * @param ereignis Ein Ereignis das Protokolliert, z.B eine neue Verleihung oder Rückgabe
     * @param verleihkarte Eine Verleihkarte zu dem jeweiligen Ereignis
     * @throws ProtokollierException Wenn beim Protokollieren des
     *             Verleihvorgangs ein Fehler auftritt.
     *  
     * @require verleihkarte != null
     * @require ereignis != null
     * @require  ereignis != ""
     */
    
    public static void protokolliere(String ereignis, Verleihkarte verleihkarte) throws ProtokollierException
    {
        assert verleihkarte != null : "Vorbedingung verletzt: verleihkarte != null";
        assert ereignis != null : "Vorbedingung verletzt: ereignis != null";
        assert ereignis != "": "Vorbedingung verletzt: ereignis != \"\"";
        //System.out.println(ereignis + " " + verleihkarte.toString());
        try(FileWriter fw = new FileWriter("./protokoll.txt", true);)
        {
            fw.write(ereignis + verleihkarte.toString() + "\n");
        }
        catch (IOException e)
        {
            throw new ProtokollierException(e.toString());
        }
        finally
        {
            System.out.println("Protokolliervorgang beendet.");
        }
    }
}
