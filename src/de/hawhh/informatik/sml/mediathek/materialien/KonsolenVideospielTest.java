package de.hawhh.informatik.sml.mediathek.materialien;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.hawhh.informatik.sml.mediathek.fachwerte.Geldbetrag;

public class KonsolenVideospielTest extends AbstractVideospielTest{

	private static final String BEZEICHNUNG = "Konsolenspiel";
	
    protected AbstractVideospiel getMedium(){
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public void testBerechneMietgebuehr(){
    	assertEquals (getMedium().berechneMietgebuehr (1), Geldbetrag.get (200));
    	assertEquals (getMedium().berechneMietgebuehr (3), Geldbetrag.get (900));
    	assertEquals (getMedium().berechneMietgebuehr (6), Geldbetrag.get(1600));
    	assertEquals (getMedium().berechneMietgebuehr (9), Geldbetrag.get(2300));
    }

	@Override
	public void testGetMedienBezeichnung() {
		assertEquals(BEZEICHNUNG, _videoSpiel.getMedienBezeichnung());
	}
}