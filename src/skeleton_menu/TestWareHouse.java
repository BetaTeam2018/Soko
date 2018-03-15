package skeleton_menu;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import game.*;
import logger.Logger;

public class TestWareHouse {
	// private List<Field> fields = new ArrayList<Field>();
	private Game game;
	
	public TestWareHouse(Game g) {
		this.game = g;
	}
	
	public void workerStepsToFloorTest() {
		
		Field f1 = new Floor();
		Field f2 = new Floor();
		Player p = new Player(game);
		
		Logger.putLogData(p, "[p: Player]");
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");
		
		f1.setNeighbor(Direction.RIGHT, f2);
		f2.setNeighbor(Direction.LEFT, f1);
		f1.set(p);
		
		p.step(Direction.RIGHT);
				
	}
	
	//TODO: test-functions implementation
	
//@Ferenc9 begin
	//Test case 7.
	public void playerPushesBox() {
		
	}
	
	//Test case 8.
	public void playerPushesPlayer() {
		
	}
	//Test case 9.
	public void boxStepsToFloor() {
	
	}
	//Test case 10.
	public void boxStepsToHol() {
		
	}
	//Test case 11.
	public void boxStepsToTrapdoor() {
		
	}
//@Ferenc9 end
	
}
