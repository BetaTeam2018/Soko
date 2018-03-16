/**
* @Project : KillerSokoban
* @fileName Switch.java
* @date : 3/13/2018
* @author : 
*/

package game;

import logger.Logger;

public class Switch extends Floor {
	
	private TrapDoor td;	
	
	public Switch(TrapDoor td)
	{
		this.td=td;
	}
	
	public TrapDoor getTd()
	{
		return td;
	}
	@Override
	public void set(Box b) {
		Logger.enter(this, "set("+b+" )");
		super.set(b);
		td.open();
		Logger.exit(this, "set("+b+" )", null);
	}
	
	@Override
	public void remove(Box b) {
		super.remove(b);
		td.close();
	}
}
