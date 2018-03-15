package skeleton_menu;
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
		Field f1 = new Floor(), f2 = new Floor(), f3 = new Floor();		
				
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");
		
	
		boolean fail = false;
		do {			
			System.out.println("Tolható a láda? (I/N)");			
			Scanner sc = new Scanner(System.in);
			String res = sc.nextLine();
						
			if(res.equals("I")) {
				f3 = new Floor();				
				Logger.putLogData(f3, "[f3: Floor]");
			}else if( res.equals("N")){
				f3 = new Wall();				
				Logger.putLogData(f3, "[f3: Wall]");
			}else {
				fail = true;				
			}
		}while(fail);
		
		Field.ConnectHorizontal(f1, f2);
		Field.ConnectHorizontal(f2, f3);
		
		
		Player p = new Player(game);
		Box b = new Box();
		Logger.putLogData(p, "[p: Player]");
		Logger.putLogData(b, "[b: Box]");
		f1.set(p); p.setField(f1);
		f2.set(b); b.setField(f2);
		
		p.step(Direction.RIGHT);
		
	}
	
	//Test case 8.
	public void playerPushesPlayer() {		
		Field f1 = new Floor(), f2 = new Floor(), f3 = new Floor();		
				
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");
		
	
		boolean fail = true;
		do {			
			System.out.println("Tolható a játékos? (I/N)");			
			Scanner sc = new Scanner(System.in);
			String res = sc.nextLine();
			
			if(res == "I") {
				f3 = new Floor();
				Logger.putLogData(f3, "[f3: Floor]");
			}else if( res == "N"){
				f3 = new Wall();
				Logger.putLogData(f3, "[f3: Wall]");
			}else {
				fail = false;
			}
		}while(fail);
		
		Field.ConnectHorizontal(f1, f2);
		Field.ConnectHorizontal(f2, f3);
		
		
		Player p1 = new Player(game);
		Player p2 = new Player(game);
		Logger.putLogData(p1, "[p: Player]");
		Logger.putLogData(p2, "[p: Player]");
		f1.set(p1); p1.setField(f1);
		f2.set(p2); p2.setField(f2);
		
		p1.step(Direction.RIGHT);
			
		
	}
	//Test case 9.
	public void boxStepsToFloor() {
		System.out.println("Ha Wenn diagrammal ábrázolnánk, akkkor ez itt a 8. teszt belsejében lenne.");
		
		Field f1 = new Floor(), f2 = new Floor(), f3 = new Floor(), f4 = new Floor();		
		
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");				
		Logger.putLogData(f3, "[f3: Floor]");				
		Logger.putLogData(f4, "[f4: Floor]");
				
		Field.ConnectHorizontal(f1, f2);
		Field.ConnectHorizontal(f2, f3);
		Field.ConnectHorizontal(f3, f4);
				
		Player p = new Player(game);
		Box b1 = new Box();
		Box b2 = new Box();
		Logger.putLogData(p, "[p: Player]");
		Logger.putLogData(b1, "[b1: Box]");
		Logger.putLogData(b2, "[b2: Box]");
		f1.set(p); p.setField(f1);
		f2.set(b1); b1.setField(f2);
		f3.set(b2); b2.setField(f3);
		
		p.step(Direction.RIGHT);
	}
	
	//Test case 10.
	public void boxStepsToHole() {
		Field f1 = new Floor(), f2 = new Floor(), f3 = new Hole();
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");
		Logger.putLogData(f3, "[f3: Hole]");
		
		Field.ConnectHorizontal(f1, f2);
		Field.ConnectHorizontal(f2, f3);
		
		Box b = new Box();
		Player p = new Player(game);
		Logger.putLogData(p, "[p: Player]");
		Logger.putLogData(b, "[b: Box]");
		p.setField(f1); f1.set(p);
		b.setField(f2); f2.set(b);
		
		p.step(Direction.RIGHT);
		
	}
	
	//Test case 11.
	public void boxStepsToTrapdoor() {
		Field f1 = new Floor(), f2 = new Floor(), f3 = new TrapDoor();
		
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");
		Logger.putLogData(f3, "[f3: Trapdoor]");
		
		Field.ConnectHorizontal(f1, f2);
		Field.ConnectHorizontal(f2, f3);
		
		Box b = new Box();
		Player p = new Player(game);
		Logger.putLogData(p, "[p: Player]");
		Logger.putLogData(b, "[b: Box]");
		p.setField(f1); f1.set(p);
		b.setField(f2); f2.set(b);
		
		p.step(Direction.RIGHT);
	}
//@Ferenc9 end
	
}
