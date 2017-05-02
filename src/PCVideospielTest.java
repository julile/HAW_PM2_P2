
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PCVideospielTest extends AbstractVideospielTest{

    protected AbstractVideospiel getMedium()    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }

    @Test
    public void testBerechneMietgebuehr(){
    	assertEquals (getMedium().berechneMietgebuehr (5), Geldbetrag.get (200));
    	assertEquals (getMedium().berechneMietgebuehr (8), Geldbetrag.get(700));
    	assertEquals (getMedium().berechneMietgebuehr (12), Geldbetrag.get(700));
    	assertEquals (getMedium().berechneMietgebuehr (13), Geldbetrag.get (1200));
    }
}