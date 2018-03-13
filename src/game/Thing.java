/**
* @Project : KillerSokoban
* @fileName Thing.java
* @date : 3/13/2018
* @author : 
*/

package game;
public abstract class Thing {
	
	private Player lastPusher;
	private Field currentField;
	
	
	public boolean slideBy(Player pusher, Direction dir) {		
		return this.getCurrentField().getNeighbor(dir).pushHereBy(pusher, this, dir);
	}
	
	public abstract void setNewField(Field newField);
	
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
		return currentField;
	}
}
