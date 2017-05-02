/**
 * {@link KonsolenVideospiel} ist ein {@link AbstractVideospiel} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team, PR2-Team, PR2-Team
 * @version SoSe 2017
 */
public class KonsolenVideospiel extends AbstractVideospiel{

	private static final int PREIS_VOLLE_3TAGE = 700;
	
	public KonsolenVideospiel (String titel,String kommentar, String system){
		super (titel, kommentar, system);
	}

	@Override
	public int getPreisNachTagen (int mietTage){
		return (mietTage/3)*PREIS_VOLLE_3TAGE;
	}
	
	
}
