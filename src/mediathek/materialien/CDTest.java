package mediathek.materialien;
import static org.junit.Assert.*;
import org.junit.Test;

import mediathek.fachwerte.Geldbetrag;

public class CDTest extends AbstractMediumTest
{
    private static final String CD_BEZEICHNUNG = "CD";
    private static final String INTERPRET = "CD Interpret";
    private static final int LAENGE = 100;
    private CD _cd1;
    private CD _cd2;

    public CDTest()
    {
        _cd1 = getMedium();
        _cd2 = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String cdBezeichnung = CD_BEZEICHNUNG;
        assertEquals(cdBezeichnung, _cd1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _cd1.getTitel());
        assertEquals(KOMMENTAR, _cd1.getKommentar());
        assertEquals(LAENGE, _cd1.getSpiellaenge());
        assertEquals(INTERPRET, _cd1.getInterpret());
    }

    @Test
    public final void testSetter()
    {
        _cd1.setTitel("Titel2");
        assertEquals(_cd1.getTitel(), "Titel2");
        _cd1.setKommentar("Kommentar2");
        assertEquals(_cd1.getKommentar(), "Kommentar2");
        _cd1.setInterpret("Interpret2");
        assertEquals(_cd1.getInterpret(), "Interpret2");
        _cd1.setSpiellaenge(99);
        assertEquals(_cd1.getSpiellaenge(), 99);
    }
    
    @Test
    public void testBerechneMietgebuehr(){
    	assertEquals (_cd1.berechneMietgebuehr (5), Geldbetrag.get (1500));
    	assertEquals (_cd2.berechneMietgebuehr (1), Geldbetrag.get(300));
    }

    protected CD getMedium()
    {
        return new CD(TITEL, KOMMENTAR, INTERPRET, LAENGE);
    }

}
