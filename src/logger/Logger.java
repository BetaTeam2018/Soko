package logger;

import java.util.HashMap;
import java.util.Map;

import game.*;


public class Logger {
	/**
	 * A napl�zni k�v�nt objektumokat a sztring megfelel�j�vel egy�tt t�rolja kulcs-�rt�k p�rban.  
	 */
	private static final Map<Object, String> logData;
	/**
	 * A sz�ks�ges tabul�torok sz�ma. 
	 */
	private static int tabNum = 0;
	
	static {
		logData = new HashMap<Object, String>();
		putLogData(Direction.RIGHT, "dir");
	}
	
	
	/**
	 * Besz�r egy kulcs-�rt�k p�rt a logData HashMap attrib�tumba. 
	 * @param key kulcs
	 * @param value �rt�k 
	 */
	public static void putLogData(Object key, String value) {
		logData.put(key, value);
	}
	
	/**
	 * Visszadja az adott kulcshoz taroz� �rt�ket a logData t�rol�b�l. 
	 */
	public static String getLogDataString(Object key) {
		return logData.get(key);
	}
	
	/**
	 * A f�ggv�ny param�tereinek sztring el��ll�t�s�ra szolg�l. 
	 * Az adott objektumlist�b�l el��ll�tja az objektumok sztring megfelel�it felsorol� sztringet. 
	 * @param params objektumok t�mbje, amiben a objektumreferenci�k vannak.
	 * @return Az el��ll�tott param�terlista sztring form�tumban.
	 */
	public static String objParamListToString(Object[] params) {
		String strParams = "";
		int i = 0;
		for (Object key : params) {
			i++;
			strParams += logData.get(key);
			if(params.length != i) strParams += ", ";
		}
		return strParams;
	}
	
	
	/**
	 * Napl�z� (bel�p�skor) // Log format: -> [obj: ClassName].functionsName([param1], [param2], ...)
	 * 
	 * @param o annak az objektum referenci�ja, ahonnan a h�v�s sz�rmazik
	 * @param fv f�ggv�ny neve
	 * @param params f�ggv�nye param�tereit tartalmaz� t�mb
	 * 
	 */
	public static void enter(Object o, String fv, Object[] params) {
		
		String strParams = objParamListToString(params);
		
		System.out.println(getTabs() + "-> " + logData.get(o) + "." + fv + "(" + strParams + ")" + ":");
		tabNum++;
	}
	/**
	 * Napl�z� (visszat�r�skor) // Log format: <- (result = retStr): [obj: ClassName].functionsName([param1], [param2], ...)
	 * @param o annak az objektum referenci�ja, ahonnan a h�v�s sz�rmazik
	 * @param fv f�ggv�ny neve
	 * @param params f�ggv�nye param�tereit tartalmaz� t�mb
	 * @param retStr visszat�r�si �rt�k String form�tumban
	 */
	public static void  exit(Object o, String fv, Object[] params, String retStr) {	
		tabNum--;
		if (retStr!="") retStr = "(result = " + retStr + "): ";	
		String strParams = objParamListToString(params);
		System.out.println(getTabs() + "<- " + retStr + logData.get(o) + "." + fv + "(" + strParams + ")");
	
	}
	
	/**
	 * Tabokat tartalmaz� sztringet k�sz�t, ami a bekezd�sek form�z�s�ra szolg�l. 
	 * @return Valamennyi mennyis�g� tabul�torokb�l �ll� sztring.
	 */
	public static String getTabs() {
		String tabs = "";
		for (int i = 1; i<=tabNum; i++) {
			tabs = tabs.concat("\t");
		}
		return tabs;
	}

}
