package logger;

import java.util.HashMap;
import java.util.Map;

import game.*;


class Logger {
	private static final Map<Object, String> functions;

	static {
		functions = new HashMap<Object, String>();
	}

	static void enter(Object o, String fv, String obj) {	
	System.out.println("->" + obj + "ret" + fv + "(...)"); }
	static void  exit(Object o, String fv) {	
	System.out.println("<-" + "ret" + fv + "(...)"); }

}
