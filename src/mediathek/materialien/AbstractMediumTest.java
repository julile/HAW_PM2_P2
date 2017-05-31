package mediathek.materialien;
import static org.junit.Assert.*;

import org.junit.Test;

public abstract class AbstractMediumTest
{

    protected static final String KOMMENTAR = "Kommentar";
    protected static final String TITEL = "Titel";
    private Medium _medium1;
    private Medium _medium2;
    
    protected AbstractMediumTest()
    {
    	_medium1 = getMedium();
    	_medium2 = getMedium();
    }
    
    protected abstract Medium getMedium();
    
    @Test
    public abstract void testBerechneMietgebuehr();
    
    @Test
    public void testGetFormatiertenString()
    {
        Medium medium = getMedium();
        assertNotNull(medium.getFormatiertenString());
    }
    
    public void testEquals()
    {
        assertFalse("Mehrere Exemplare des gleichen Mediums sind ungleich",
                _medium1.equals(_medium2));
        assertTrue("Dasselbe Exemplare des gleichen Mediums ist gleich",
                _medium1.equals(_medium1));
    }
}
