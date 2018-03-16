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
	public static String objParamListString(Object[] params) {
		String strParams = "";
		int i = 0;
		for (Object key : params) {
			i++;
			strParams += logData.get(key);
			if(params.length != i) strParams += ", ";
		}
		return strParams;
	}
	
	public static void enter(Object o, String fv) {	
		System.out.println(getTabs() + "-> " + logData.get(o) + "." + fv + ":");
		tabNum++;
	}
	public static void  exit(Object o, String fv, Object retObj) {	
		tabNum--;
		String retStr = "";
		if (retObj!=(null)) retStr = "(result = " + logData.get(retObj) + "): ";
		System.out.println(getTabs() + "<- " + retStr + logData.get(o) + "." + fv);
	
	}
	
	public static String getTabs() {
		String tabs = "";
		for (int i = 1; i<=tabNum; i++) {
			tabs = tabs.concat("\t");
		}
		return tabs;
	}

}
