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
		Object[] params = {b};
		Logger.enter(this, "set", params);
		super.set(b);
		td.open();
		Logger.exit(this, "set", params, "");
	}
	
	@Override
	public void remove(Box b) {
		Object[] params = {b};
		Logger.enter(this, "remove", params);
		super.remove(b);
		td.close();
		Logger.exit(this, "remove", params, "");
	}
}
