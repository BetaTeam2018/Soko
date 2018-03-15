/**
* @Project : KillerSokoban
* @fileName TrapDoor.java
* @date : 3/13/2018
* @author : 
*/

package game;
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
		opened = true;
	}
	
	public void close() {
		opened = false;
	}
	
	public boolean getState() {
		return opened;
	}
}
