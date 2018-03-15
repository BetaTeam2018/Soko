/**
* @Project : KillerSokoban
* @fileName Field.java
* @date : 3/13/2018
* @author : 
*/

package game;

import java.util.Map;
import java.util.TreeMap;

import logger.Logger;

public abstract class Field {
	
	private Thing thing;
	private Map<Direction, Field> neighbors = new TreeMap<>();
	
	
	//TODO constructor
	
	
	public void setNeighbor(Direction dir, Field field) {
		neighbors.put(dir, field);
	}
	
	public Field getNeighbor(Direction dir) {		
		return neighbors.get(dir);
	}
	
	public static void ConnectHorizontal(Field western, Field eastern) {
		western.setNeighbor(Direction.RIGHT, eastern);
		eastern.setNeighbor(Direction.LEFT, western);
	}
	
	public static void ConnectVertical(Field northern, Field southern) {
		northern.setNeighbor(Direction.DOWN, southern);
		southern.setNeighbor(Direction.UP, northern);
	}
	
	
	
	public boolean pushHereBy(Player pusher, Thing pushed, Direction dir) {		
	
		boolean result = false;
		
		if(this.getThing() != null) {
			 result = this.getThing().slideBy(pusher, dir);
		}else if(result == true) {			
			pushed.setLastPusher(pusher);			
			pushed.setNewField(this);
		}
		
		return result;
	}
	
	public void set(Box b) {
		if(thing != null)
			System.err.println("Shit happens"); // TODO exception
		
		thing = b; //Bermuda triangle LOL
	}
	
	public void remove(Box b) {
		thing = null;
	}
	
	public void set(Player p) {
		if(thing != null)
			System.err.println("Shit happens"); // TODO exception
		
		thing = p; //Bermuda triangle LOL
		p.setField(this);
	}
	
	public void remove(Player p) {
		thing = null;
	}
	
	public Thing getThing() {
		return thing;
	}
}
