package logger;

import java.util.HashMap;

class Logger {
private HashMap<Object, String> functions;

static void enter(Object o, String fv) {	
	System.out.println("->" + "ret" + fv + "(...)"); }
static void  exit(Object o, String fv) {	
	System.out.println("<-" + "ret" + fv + "(...)"); }

}
