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
		Logger.exit(this, "step(" + dir + ")", null);
	}
	
	@Override
	public boolean slideBy(Player pusher, Direction dir) {
		Logger.enter(this, "slideBy(...)" );
		boolean pushable = super.slideBy(pusher, dir);
		
		if(pushable == false) {
			this.die();
		}
		Logger.exit(this, "slideBy(...)", true);
		return true;
	}
	
	@Override
	public void die() {
		Logger.enter(this, "die()" );
		this.getCurrentField().set((Player)null);
		super.die();
		game.endGame();
		Logger.exit(this, "die()", null);
	}
	
	public void addPoints(long p) {
		points += p;
	}
	
	public void subtractPoints(long p) {
		points -= p;
	}
	
	@Override
	public void setNewField(Field newField) {
		Logger.enter(this, "setNewField(...)" );
		this.getCurrentField().remove(this);
		newField.set(this);
		Logger.exit(this, "setNewField(...)", null);
	}
}
