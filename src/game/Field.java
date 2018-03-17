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
		Logger.enter(this, "getNeighbor("+dir+")");
	public Field getNeighbor(Direction dir) {
		Object[] params = {dir};
		Logger.enter(this, "getNeighbor", params);
		Field neighbor = neighbors.get(dir);
		Logger.exit(this, "getNeighbor("+dir+")", neighbor);
		Logger.exit(this, "getNeighbor", params, Logger.getLogDataString(neighbor));
		return neighbor;
	}
	
	public static void ConnectHorizontal(Field western, Field eastern) {
		western.setNeighbor(Direction.RIGHT, eastern);
		eastern.setNeighbor(Direction.LEFT, western);
	}
	
	public static void ConnectVertical(Field northern, Field southern) {
		northern.setNeighbor(Direction.DOWN, southern);
		southern.setNeighbor(Direction.UP, northern);
	}
	
	
	
	@SuppressWarnings("deprecation")
	public boolean pushHereBy(Player pusher, Thing pushed, Direction dir) {		
		Logger.enter(this, "pushHereBy(...)" );
		Object[] params = {pusher, pushed, dir};
		Logger.enter(this, "pushHereBy", params);
		boolean result = true;
		
		if(this.getThing() != null) {
			 result = this.getThing().slideBy(pusher, dir);
		}else if(result == true) {			
			pushed.setLastPusher(pusher);			
			pushed.setNewField(this);
		}
<<<<<<< HEAD
		Logger.exit(this, "pushHereBy(...)", new Boolean(result));
=======
		Logger.exit(this, "pushHereBy", params, new Boolean(result).toString());
>>>>>>> 87cc6912b265f45d9717b459b9f77fc01c55c8ab
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
	}
	
	public void remove(Player p) {
		thing = null;
	}
	
	public Thing getThing() {
		return thing;
	}
}
