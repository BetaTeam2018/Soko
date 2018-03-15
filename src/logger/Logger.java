package logger;

import java.util.HashMap;
import java.util.Map;

import game.*;


public class Logger {
	private static final Map<Object, String> logData;
	private static int tabNum = 0;
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
		System.out.println(getTabs() + "->" + logData.get(o) + "." + fv + ":");
		tabNum++;
	}
	public static void  exit(Object o, String fv) {	
		System.out.println(getTabs() + "<-"+ logData.get(o) + "." + fv);
		tabNum--;
	}
	
	public static String getTabs() {
		String tabs = "";
		for (int i = 1; i<=tabNum; i++) {
			tabs = tabs.concat("\t");
		}
		return tabs;
	}

}
