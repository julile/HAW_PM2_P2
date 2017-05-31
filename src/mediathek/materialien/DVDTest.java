package mediathek.materialien;
import static org.junit.Assert.*;
import org.junit.Test;

import mediathek.fachwerte.Geldbetrag;

public class DVDTest extends AbstractMediumTest
{
    private static final String BEZEICHNUNG = "DVD";
    private static final int LAENGE = 100;
    private static final String REGISSEUR = "DVD Regisseur";
    private DVD _dvd1;
    private DVD _dvd2;

    public DVDTest()
    {
        _dvd1 = getMedium();
        _dvd2 = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String dvdBezeichnung = BEZEICHNUNG;
        assertEquals(dvdBezeichnung, _dvd1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _dvd1.getTitel());
        assertEquals(KOMMENTAR, _dvd1.getKommentar());
        assertEquals(LAENGE, _dvd1.getLaufzeit());
        assertEquals(REGISSEUR, _dvd1.getRegisseur());
    }

    @Test
    public final void testSetter()
    {
        _dvd1.setKommentar("Kommentar2");
        assertEquals(_dvd1.getKommentar(), "Kommentar2");
        _dvd1.setTitel("Titel2");
        assertEquals(_dvd1.getTitel(), "Titel2");
        _dvd1.setLaufzeit(90);
        assertEquals(90, _dvd1.getLaufzeit());
        _dvd1.setRegisseur("Regisseur2");
        assertEquals("Regisseur2", _dvd1.getRegisseur());
    }
    
    @Test
    public void testBerechneMietgebuehr(){
    	assertEquals (_dvd1.berechneMietgebuehr (5), Geldbetrag.get (1500));
    	assertEquals (_dvd2.berechneMietgebuehr (1), Geldbetrag.get(300));
    }


    protected DVD getMedium()
    {
        return new DVD(TITEL, KOMMENTAR, REGISSEUR, LAENGE);
    }

}
