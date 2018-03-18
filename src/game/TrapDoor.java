/**
* @Project : KillerSokoban
* @fileName TrapDoor.java
* @date : 3/13/2018
* @author : 
*/

package game;

import logger.Logger;

public class TrapDoor extends Floor {
	
	private boolean opened;
	
	public TrapDoor() {
		opened = false;
	}
	
	public void set(Box b) {
		if(opened) {
			b.die();
		}else {
			super.set(b);
		}
	}
	
	public void set(Player p) {
		if(opened) {
			p.die();
		}else {
			super.set(p);
		}
	}
	
	public void open() {
		Object[] params = {};
		Logger.enter(this, "open",params);
		opened = true;
		Logger.exit(this, "open", params, "");
	}
	
	public void close() {
		Object[] params = {};
		Logger.enter(this, "close",params);
		opened = false;
		Logger.exit(this, "close", params, "");
	}
	
	public boolean getState() {
		return opened;
	}
}
