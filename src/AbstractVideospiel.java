/**
 * {@link AbstractVideospiel} ist ein {@link AbstractMedium} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team, PR2-Team, PR2-Team
 * @version SoSe 2017
 */
abstract class AbstractVideospiel extends AbstractMedium implements Medium
{
	/**
	 * Der Basispreis, der beim ausleihen eines Videospiels anfällt
	 */
	private static final int BASISPREIS = 200;
	
    /**
     * Das System, auf dem das Spiel lauffähig ist
     */
    private String _system;

    /**
     * Initialisiert ein neues Videospiel.
     * 
     * @param titel Der Titel des Spiels
     * @param kommentar Ein Kommentar zum Spiel
     * @param system Die Bezeichnung des System
     * 
     * @require system != null
     * 
     * @ensure getSystem() == system
     */
    protected AbstractVideospiel(String titel, String kommentar, String bezeichnung, String system)
    {
    	super(titel, kommentar, bezeichnung);
    	
        assert system != null : "Vorbedingung verletzt: system != null";

        _system = system;
    }

    /**
     * Gibt das System zurück, auf dem das Spiel lauffähig ist.
     * 
     * @return Das System, auf dem das Spiel ausgeführt werden kann.
     * 
     * @ensure result != null
     */
    public String getSystem()
    {
        return _system;
    }

    @Override
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + 
        		super.getFormatiertenString ()+
        		"    "+ "System: " + _system + "\n";
    }
    
    @Override
    public Geldbetrag berechneMietgebuehr(int mietTage){
    	return Geldbetrag.get (BASISPREIS + getPreisNachTagen(mietTage));
    }
    
    protected abstract int getPreisNachTagen(int mietTage);
}
