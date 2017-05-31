package mediathek.materialien;
import static org.junit.Assert.*;
import org.junit.Test;

public abstract class AbstractVideospielTest extends AbstractMediumTest{
	
    protected static final String SYSTEM = "System";
    protected AbstractVideospiel _videoSpiel;
    
    protected AbstractVideospielTest()
    {
        _videoSpiel = getMedium();
    }

    protected abstract AbstractVideospiel getMedium();
    
    @Test
    public final void testSetKommentar()
    {
        AbstractVideospiel medium = getMedium();
        medium.setKommentar("Kommentar2");
        assertEquals(medium.getKommentar(), "Kommentar2");
    }
    
    @Test
    public final void testSetTitel()
    {
        AbstractVideospiel medium = getMedium();
        medium.setTitel("Titel2");
        assertEquals(medium.getTitel(), "Titel2");
    }
    
    @Test
    public abstract void testGetMedienBezeichnung();
    
    @Test
    public void testeVideospiel()
    {
        assertEquals(TITEL, _videoSpiel.getTitel());
        assertEquals(KOMMENTAR, _videoSpiel.getKommentar());
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }
}
