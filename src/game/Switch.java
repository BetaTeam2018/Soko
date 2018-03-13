/**
* @Project : KillerSokoban
* @fileName Switch.java
* @date : 3/13/2018
* @author : 
*/

package game;
public class Switch extends Floor {
	
	private TrapDoor td;	
	
	@Override
	public void set(Box b) {
		super.set(b);
		td.open();
	}
	
	@Override
	public void remove(Box b) {
		super.remove(b);
		td.close();
	}
}
