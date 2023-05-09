import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 */
public class VideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private static final int GEBUEHR = 200;
    private static final int ANZAHLTAGE = 1;
    private static final String FORMATIERTER_STRING = BEZEICHNUNG+":\n    Titel: "+TITEL+"\n    Kommentar: "+KOMMENTAR+"\n    System: "+SYSTEM+"\n";
    private Videospiel _videoSpiel;
    private Geldbetrag _betrag1;

    @Before
    public void setUp()
    {
        _videoSpiel = getMedium();
        _betrag1 = getGeldbetrag();
    }

    @Test
    public void testeKonstruktoren()
    {
        assertEquals(TITEL, _videoSpiel.getTitel());
        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String videospielBezeichnung = BEZEICHNUNG;
        assertEquals(videospielBezeichnung, _videoSpiel.getMedienBezeichnung());
    }

    protected Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public final void testSetKommentar()
    {
        Videospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals("Kommentar2", medium.getKommentar());
    }

    @Test
    public final void testSetTitel()
    {
        Videospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals("Titel2", medium.getTitel());
    }
    
    @Test
    public final void testGetFormatiertenString()
    {
        Medium medium = getMedium();
        assertNotNull(medium.getFormatiertenString());
        assertEquals(FORMATIERTER_STRING, medium.getFormatiertenString());
    }
    @Test
    public final void testberechneMietgebuehr()
    {
        Medium medium = getMedium();
        assertNotNull(medium.berechneMietgebuehr(ANZAHLTAGE));
        assertEquals(_betrag1, medium.berechneMietgebuehr(ANZAHLTAGE));
        assertFalse(medium.berechneMietgebuehr(ANZAHLTAGE) == _betrag1);
    }
    private Geldbetrag getGeldbetrag()
    {
        return new Geldbetrag(GEBUEHR);
    }
}
