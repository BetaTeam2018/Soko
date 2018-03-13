/**
* @Project : KillerSokoban
* @fileName Box.java
* @date : 3/13/2018
* @author : 
*/

package game;
public class Box extends Thing {
	
	
	@Override
	public boolean slideBy(Player pusher, Direction dir) {
		return super.slideBy(pusher, dir);
	}
	
	@Override
	public void setNewField(Field newField) {
		this.getCurrentField().remove(this);
		newField.set(this);
	}

}
