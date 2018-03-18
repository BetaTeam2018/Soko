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
		Object[] params = {p};
		Logger.enter(this, "set", params);
		if(opened) {
			p.die();
		}else {
			super.set(p);
		}
		Logger.exit(this, "set", params, "");
	}
	
	public void open() {
		//Object[] params = {};
		//Logger.enter(this, "open",params);
		opened = true;
		Logger.exit(this, "open", null, "");
	}
	
	public void close() {
		//Object[] params = {null};
		//Logger.enter(this, "close",params);
		opened = false;
		Logger.exit(this, "close", null, "");
	}
	
	public boolean getState() {
		return opened;
	}
	
	public void setState(boolean opened) {
		this.opened = opened;
	}
}
