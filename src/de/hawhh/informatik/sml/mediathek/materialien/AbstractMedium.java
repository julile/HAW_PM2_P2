package de.hawhh.informatik.sml.mediathek.materialien;

import de.hawhh.informatik.sml.mediathek.fachwerte.Geldbetrag;

public abstract class AbstractMedium implements Medium {
	
	private String _titel;
	private String _kommentar;
	private String _medienBezeichnung;

	/**
	 * Setzt die Variablen der Medien
	 * 
	 * @param titel Der Titel des Mediums
	 * @param kommentar Ein Kommentar zum Medium
	 * 
	 * @require titel != null
	 * @require kommentar != null
	 * 
	 * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
	 */
	protected AbstractMedium (String titel, String kommentar, String bezeichnung){
		
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert bezeichnung != null : "Vorbedinung verletzt: bezeichnung !=null";
        
		_titel = titel;
		_kommentar = kommentar;
		_medienBezeichnung = bezeichnung;
	}
	
	/**
	 * Gibt die allgemeinen Variablen als formatierten String zurück
	 */
	@Override
	public String getFormatiertenString (){
		return "    "+"Titel: "+getTitel()+"\n"+
				"    "+"Kommentar: "+getKommentar()+"\n";
	}

	/**
	 * Gibt den Kommentar des Mediums zurück
	 * 
	 * @return Den Kommentar des Mediums
	 * 
	 * @ensures result != null
	 */
	@Override
	public String getKommentar (){
		return _kommentar;
	}

    /**
     * Ändert den Kommentar
     * 
     * @param interpret Der Kommentar des Mediums
     * 
     * @require kommentar != null
     * @ensure getKommentar() == kommentar
     */
	@Override
	public void setKommentar (String kommentar){
		
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
		
		_kommentar = kommentar;

	}

	/**
	 * Gibt den Titel des Mediums zurück
	 * 
	 * @return Den Titel des Mediums
	 * 
	 * @ensures result != null
	 */
	@Override
	public String getTitel (){
		return _titel;
	}

    /**
     * Ändert den Titel
     * 
     * @param interpret Der Titel des Mediums
     * 
     * @require titel != null
     * @ensure getTitel() == titel
     */
	@Override
	public void setTitel (String titel)
	{
		 assert titel != null : "Vorbedingung verletzt: titel != null";
		 
		_titel = titel;
	}
	
	/**
	 * Berechnet die Mietgebühr in Eurocent für eine angegebene Mietdauer in
	 * Tagen
	 *
	 * @param mietTage
	 *            Die Anzahl der Ausleihtage eines Mediums
	 * @return Die Mietgebühr in Eurocent als Geldbetrag
	 * 
	 * @require mietTage > 0
	 * 
	 * @ensure result != null
	 */
	public Geldbetrag berechneMietgebuehr(int mietTage)
	{
		return Geldbetrag.get(mietTage * 300);
	}

	public String getMedienBezeichnung()
	{
		return _medienBezeichnung;
	}
}
