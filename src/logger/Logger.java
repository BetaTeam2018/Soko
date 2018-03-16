package logger;

import java.util.HashMap;
import java.util.Map;

import game.*;


public class Logger {
	/**
	 * A naplózni kívánt objektumokat a sztring megfelelõjével együtt tárolja kulcs-érték párban.  
	 */
	private static final Map<Object, String> logData;
	/**
	 * A szükséges tabulátorok száma. 
	 */
	private static int tabNum = 0;
	
	static {
		logData = new HashMap<Object, String>();
	}
	
	
	/**
	 * Beszúr egy kulcs-érték párt a logData HashMap attribútumba. 
	 * @param key kulcs
	 * @param value érték 
	 */
	public static void putLogData(Object key, String value) {
		logData.put(key, value);
	}
	
	/**
	 * Visszadja az adott kulcshoz tarozó értéket a logData tárolóból. 
	 */
	public static String getLogDataString(Object key) {
		return logData.get(key);
	}
	
	/**
	 * A függvény paramétereinek sztring elõállítására szolgál. 
	 * Az adott objektumlistából elõállítja az objektumok sztring megfelelõit felsoroló sztringet. 
	 * @param params objektumok tömbje, amiben a objektumreferenciák vannak.
	 * @return Az elõállított paraméterlista sztring formátumban.
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
