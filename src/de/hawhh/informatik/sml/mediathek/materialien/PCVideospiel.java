package de.hawhh.informatik.sml.mediathek.materialien;

/**
 * {@link PCVideospiel} ist ein {@link AbstractVideospiel} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team, PR2-Team, PR2-Team
 * @version SoSe 2017
 */
public class PCVideospiel extends AbstractVideospiel implements Medium{
	
	private static final int PREIS_ANGEFANGENE_5TAGE = 500;
	private static final int TAGE_KOSTENLOS = 7;
	
	public PCVideospiel (String titel, String kommentar, String system){
		super (titel, kommentar, "PCspiel", system);
	}
		

	@Override
	protected int getPreisNachTagen (int mietTage){
		if (mietTage <= TAGE_KOSTENLOS){
			return 0;
		} else
			return PREIS_ANGEFANGENE_5TAGE * (int)Math.ceil(((double)(mietTage-TAGE_KOSTENLOS) / 5));
		
		
//		if (mietTage%5 == 0){
//			return (mietTage/5)*PREIS_ANGEFANGENE_5TAGE;
//		}
//		return PREIS_ANGEFANGENE_5TAGE+((mietTage/5)*PREIS_ANGEFANGENE_5TAGE);
	}
}
