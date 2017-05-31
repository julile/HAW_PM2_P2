package mediathek.materialien;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mediathek.fachwerte.Geldbetrag;

public class PCVideospielTest extends AbstractVideospielTest{

	private static final String BEZEICHNUNG = "PCspiel";

    protected AbstractVideospiel getMedium()    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public void testBerechneMietgebuehr(){
    	assertEquals (getMedium().berechneMietgebuehr (5), Geldbetrag.get (200));
    	assertEquals (getMedium().berechneMietgebuehr (8), Geldbetrag.get(700));
    	assertEquals (getMedium().berechneMietgebuehr (12), Geldbetrag.get(700));
    	assertEquals (getMedium().berechneMietgebuehr (13), Geldbetrag.get (1200));
    	assertEquals (getMedium().berechneMietgebuehr (32), Geldbetrag.get (2700));
    	assertEquals (getMedium().berechneMietgebuehr (33), Geldbetrag.get (3200));
    }
    
	@Override
	public void testGetMedienBezeichnung() {
		assertEquals(BEZEICHNUNG, _videoSpiel.getMedienBezeichnung());
	}
}