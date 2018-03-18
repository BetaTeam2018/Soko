
/**
* @Project : KillerSokoban
* @file Name : Wall.java
* @date : 3/13/2018
* @author : 
*/

package game;

import logger.Logger;

public class Wall extends Field {
	
	@Override
	public boolean pushHereBy(Player pusher, Thing pushed, Direction dir) {
		Object[] params = {pusher, pushed, dir};
		Logger.enter(this, "pushHereBy", params);
		Logger.exit(this, "pushHereBy", params, "false");
		return false;
	}
}
