/**
* @Project : KillerSokoban
* @fileName Player.java
* @date : 3/13/2018
* @author : 
*/

package game;

import logger.Logger;

public class Player extends Thing {
	
	private Game game;
	private long points;
	
	public Player(Game g) {	
		this.game = g;
		points = 0;
	}
	
	public void step(Direction dir) {
		Logger.enter(this, "step(" + dir + ")");
		Field f = this.getCurrentField();
		Field f2 = f.getNeighbor(dir);		
		f2.pushHereBy(null, this, dir);
		Logger.exit(this, "step(" + dir + ")");
	}
	
	@Override
	public boolean slideBy(Player pusher, Direction dir) {
		boolean pushable = super.slideBy(pusher, dir);
		
		if(pushable == false) {
			this.die();
		}		
		return true;
	}
	
	@Override
	public void die() {
		super.die();
		game.endGame();
	}
	
	public void addPoints(long p) {
		points += p;
	}
	
	public void subtractPoints(long p) {
		points -= p;
	}
	
	@Override
	public void setNewField(Field newField) {
		this.getCurrentField().remove(this);
		newField.set(this);
	}
}
