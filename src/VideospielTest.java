import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String SYSTEM = "PS5";
    private Videospiel _spiel1;
    private Videospiel _spiel2;

    public VideospielTest()
    {
        _spiel1 = getMedium();
        _spiel2 = getMedium();
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(KOMMENTAR, _spiel1.getKommentar());
        assertEquals(TITEL, _spiel1.getTitel());
        assertEquals(SYSTEM, _spiel1.get_system());
    }

    @Test
    /*
     * Von ein und der selben CD kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals()
    {
        assertFalse("Mehrere Exemplare der gleichen CD sollten ungleich sein",
                _spiel1.equals(_spiel2));
        assertTrue("Dasselbe Exemplare der gleichen CD sollte gleich sein",
                _spiel1.equals(_spiel1));
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
    public void testGetSystem()
    {
        String system = SYSTEM;
        assertEquals(system, _spiel1.get_system());
    }

    @Test
    public void testGetFormatiertenString()
    {
        String formatierterString = _spiel1.getMedienBezeichnung() + ":\n"
                + "    " + "Titel: " + _spiel1.getTitel() + "\n" + "    "
                + "Kommentar: " + _spiel1.getKommentar() + "\n" + "    "
                + "System: " + _spiel1.get_system() + "\n";
        assertEquals(formatierterString, _spiel1.getFormatiertenString());
    }

    private Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }

}
