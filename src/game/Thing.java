/**
* @Project : KillerSokoban
* @fileName Thing.java
* @date : 3/13/2018
* @author : 
*/

package game;

import logger.Logger;

public abstract class Thing {
	
	private Player lastPusher;
	private Field currentField;
	
	
	public boolean slideBy(Player pusher, Direction dir) {		
		return this.getCurrentField().
				getNeighbor(dir).
				pushHereBy(pusher, this, dir);
	}
	
	public abstract void setNewField(Field newField);
	public void setField(Field f) {
		currentField = f;
	}
	public void setLastPusher(Player p) {
		lastPusher = p;
	}
	
	public void die() {
		currentField = null;
	}
	
	public Player getLastPusher() {
		return lastPusher;
	}
	
	public Field getCurrentField() {
		Object[] params = {};
		Logger.enter(this, "getCurrentField", params);
		Logger.exit(this, "getCurrentField", params, Logger.getLogDataString(currentField));
		return currentField;
	}
}
