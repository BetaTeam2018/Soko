/**
* @Project : KillerSokoban
* @fileName Hole.java
* @date : 3/13/2018
* @author : 
*/

package game;

import logger.Logger;

public class Hole extends Floor {	
	
	/**
	 * @param 
	 * @date 3/13/2018
 	 * @author 
	 */
	@Override
	public void set(Box b) {
		if(b != null) b.die();
	}
	
	
	/**
	 * @param 
	 * @date 3/13/2018
 	 * @author 
	 */
	@Override
	public void set(Player p) {
		Object[] params = {p};
		Logger.enter(this, "set", params);
		if(p != null) p.die();	
		Logger.exit(this, "set", params, "");
	}
	
}
