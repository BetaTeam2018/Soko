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
	/**
	 * Azt az interakciót kezeli amikor egy játékos a csapóajtóra kerül. 
	 */
	public void set(Player p) {
		Object[] params = {p};
		Logger.enter(this, "set", params);
		if(opened) {								// Ha a csapóajtó nyitott, akkor a játékos meghal. 
			p.die();
		}else {
			super.set(p);							// Ha nincs nyitva, akkor helyezze rá a mezõre. 
		}
		Logger.exit(this, "set", params, "");
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
	
	public void setState(boolean opened) {
		this.opened = opened;
	}
}
