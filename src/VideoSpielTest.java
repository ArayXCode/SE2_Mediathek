import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

public class VideoSpielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String SYSTEM = "PS5";
    private Videospiel _spiel1;
    
    public VideoSpielTest() {
        _spiel1 = getMedium();
    }
    
    @Test
    public void testKonstruktor()
    {
        assertEquals(KOMMENTAR, _spiel1.getKommentar());
        assertEquals(TITEL, _spiel1.getTitel());
    }
    @Test
    public void testGetKommentar()
    {
        String kommentar = KOMMENTAR;
        assertEquals(kommentar, _spiel1.getKommentar());
    }
    
    @Test
    public void testGetMedienBezeichnung()
    {
        String medienbezeichnung = "Videospiel";
        assertEquals(medienbezeichnung, _spiel1.getMedienBezeichnung());
    }
    
    @Test
    public void testGetTitel()
    {
        String titel = TITEL;
        assertEquals(titel, _spiel1.getTitel());
    }
    
    
    @Test
    public void testGetKonsole()
    {
        String system= SYSTEM;
        assertEquals(system, _spiel1.get_system());
    }
    
    @Test
    public void testGetFormatiertenString()
    {
        String formatierterString = _spiel1.getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _spiel1.getTitel()
                + "\n" + "    " + "Kommentar: " + _spiel1.getKommentar()+ "\n" + "    "
                + "System: " + _spiel1.get_system() + "\n";
        assertEquals(formatierterString, _spiel1.getFormatiertenString());
    }
    
    private Videospiel getMedium() {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }
    
}
