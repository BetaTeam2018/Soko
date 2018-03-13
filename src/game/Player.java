/**
* @Project : KillerSokoban
* @fileName Player.java
* @date : 3/13/2018
* @author : 
*/

package game;
public class Player extends Thing {
	
	Game g;
	long point;
	
	public void step(Direction dir) {
		this.getCurrentField().getNeighbor(dir).pushHereBy(null, this, dir);
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
		g.endGame();
	}
	
	public void addPoints(long p) {
		point += p;
	}
	
	public void subtractPoints(long p) {
		point -= p;
	}
	
	@Override
	public void setNewField(Field newField) {
		this.getCurrentField().remove(this);
		newField.set(this);
	}
}
