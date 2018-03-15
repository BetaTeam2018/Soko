package logger;

import java.util.HashMap;
import java.util.Map;

import game.*;


public class Logger {
	private static final Map<Object, String> logData;

	static {
		logData = new HashMap<Object, String>();
	}
	/**
	 * 
	 * @param o key
	 * @param s value
	 */
	public static void putLogData(Object obj, String str) {
		logData.put(obj, str);
	}
	public static void enter(Object o, String fv) {	
		System.out.println("->" + logData.get(o) + "." + fv + ":"); 
	}
	public static void  exit(Object o, String fv) {	
		System.out.println("<-"+ logData.get(o) + "." + fv);
	}

}
