/**
* @Project : KillerSokoban
* @fileName Box.java
* @date : 3/13/2018
* @author : 
*/

package game;

import logger.Logger;

public class Box extends Thing {
	
	
	@Override
	public boolean slideBy(Player pusher, Direction dir) {
		return super.slideBy(pusher, dir);
	}
	
	@Override
	public void setNewField(Field newField) {
		Object[] params = {newField};
		Logger.enter(this, "setNewField",  params);
		
		this.getCurrentField().remove(this); 	// Töröljük az ide mutató referenciát a jelenlegi field-rol.
		this.setField(newField);				// Új field beállítása.
		newField.set(this);						// A box bekötéseaz új field-re.
												//ez melyik?
		
		Logger.exit(this, "setNewField", params, "");
	}
	@Override
	public void die()
	{
		this.getCurrentField().set((Box)null);
		super.die();
	}

}
