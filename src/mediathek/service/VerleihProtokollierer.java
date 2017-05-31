package mediathek.service;
import java.io.FileWriter;
import java.io.IOException;

import mediathek.fachwerte.Datum;
import mediathek.fachwerte.Verleihkarte;

public class VerleihProtokollierer {

	public enum VerleihEreignis {
		AUSLEIHE, RUECKNAHME
	}
	/**
	 * Protokolliert Verleihvorgänge und Rückgaben im speicher
	 * 
	 * @param ereignis Wird das medium ausgeliehen oder zurückgegeben?
	 * @param Verleihkarte Die zu dem Medium zugehörende Verleihkarte
	 * 
	 * @require ereignis != null
	 * @require verleihkarte != null
	 */
	public static void protokolliere(VerleihEreignis ereignis, Verleihkarte verleihkarte) throws ProtokollierException
	{
		assert ereignis != null : "Vorbedinung verletzt: ereignis !=null";
		assert verleihkarte != null : "Vorbedinung verletzt: verleihkarte !=null";
		
//		System.out.println(Datum.heute()+" "+ereignis+verleihkarte.getFormatiertenString());
		
		try (FileWriter handle = new FileWriter("./protokoll.txt",true))
		{
//			FileWriter handle = new FileWriter("./protokoll.txt", true);
			handle.write(Datum.heute()+" "+ereignis.toString()+verleihkarte.getFormatiertenString());
//			handle.close();
		} catch (IOException e){
			throw new ProtokollierException("Schreiben in Protokoll.txt nicht möglich. Keine Schreibrechte?");
		}
	}
}
