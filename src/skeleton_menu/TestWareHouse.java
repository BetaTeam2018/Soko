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
	//	Logger.putLogData(Direction.RIGHT, "dir");
		f1.setNeighbor(Direction.RIGHT, f2);
		f2.setNeighbor(Direction.LEFT, f1);
		f1.set(p);
		p.setField(f1);
		
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
		
	
		boolean fail = false;
		do {			
			System.out.println("Tolható a játékos? (I/N)");			
			Scanner sc = new Scanner(System.in);
			String res = sc.nextLine();
			
			if(res.equals("I")) {
				f3 = new Floor();
				Logger.putLogData(f3, "[f3: Floor]");
			}else if(res.equals("N")){
				f3 = new Wall();
				Logger.putLogData(f3, "[f3: Wall]");
			}else {
				fail = true;
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
			
		Field f1 = new Floor(), f2 = new Floor(), f3 = new Floor(), f4  = new Floor();	
		
		
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");				
		Logger.putLogData(f3, "[f3: Floor]");
		
		boolean fail = false;
		do {			
			System.out.println("Tolható-e a sor? (I/N)");			
			Scanner sc = new Scanner(System.in);
			String res = sc.nextLine();
			
			if(res.equals("I")) {
				f4 = new Floor();
				Logger.putLogData(f4, "[f4: Floor]");
			}else if(res.equals("N")){
				f4 = new Wall();
				Logger.putLogData(f4, "[f4: Wall]");
			}else {
				fail = true;
			}
		}while(fail);
		
		
		
		
				
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
	
//@csiki100 begin
	//Test case 12
	public void boxStepsToStorageArea()					//a doboz célhelyre érkezik
	{
		Field f1=new Floor();
		Field f2=new Floor();							//pályaelemek
		Field f3=new StoreageArea();
		
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");			//pályaelemek beírása a loggerbe
		Logger.putLogData(f3, "[f3: StorageArea");
		
		
		Field.ConnectHorizontal(f1, f2);				//pályaelemek összekötése
		Field.ConnectHorizontal(f2, f3);
		
		Player p1=new Player(game);						// dolgok a pályán
		Box b1=new Box();
		
		Logger.putLogData(p1, "[p1: Player]");			//dolgok beírása a loggerbe
		Logger.putLogData(b1, "[b1: Box]");
		
		p1.setField(f1);
		f1.set(p1);									
														//dolgok lehelyezése a pályára
		b1.setField(f2);
		f2.set(b1);
		
		p1.step(Direction.RIGHT);
	}
	//Test case 13
	public void boxStepsToSwitch()						//doboz kapcsolóra érkezik
	{
		Field f1=new Floor();
		Field f2=new Floor();							//pályaelemek
		Field f3=new TrapDoor();
		Field f4=new Switch((TrapDoor) f3);
		
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");
		Logger.putLogData(f3, "[f3: TrapDoor]");		//pályaelemek beírása a loggerbe
		Logger.putLogData(f4, "[f4: Switch]");
		
		Player p1=new Player(game);						// dolgok a pályán
		Box b1=new Box();
		
		Logger.putLogData(b1, "[b1: Box]");
		Logger.putLogData(p1, "[p1: Player]");			//dolgok beírása a loggerbe
		
		f1.set(p1);
		p1.setField(f1);
														//dolgok lehelyezése a pályára
		f2.set(b1);
		b1.setField(f2);
		
		Field.ConnectHorizontal(f1, f2);
		Field.ConnectHorizontal(f2, f4);				//pályaelemek összekötése
		Field.ConnectHorizontal(f4, f3);
		
		p1.step(Direction.RIGHT);
	}
	//Test case 14
	public void boxStepsToWall()						//doboz falnak megy
	{
		Field f1=new Floor();
		Field f2=new Floor();							//pályaelemek
		Field f3=new Wall();
		
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");			//pályaelemek beírása a loggerbe
		Logger.putLogData(f3, "[f3: Wall]");
		
		Floor.ConnectHorizontal(f1, f2);
		Floor.ConnectHorizontal(f2, f3);				//pályaelemek összekötése
		
		Player p1=new Player(game);						// dolgok a pályán
		Box b1=new Box();
		
		Logger.putLogData(p1, "[p1: Player]");			//dolgok beírása a loggerbe
		Logger.putLogData(b1, "[b1: Box]");
		
		p1.setField(f1);
		f1.set(p1);
														//dolgok lehelyezése a pályára
		b1.setField(f2);
		f2.set(b1);
		
		p1.step(Direction.RIGHT);
		
		
		
	}
	//Test case 16
	public void boxStepstoPlayer()						//doboz Playernek megy

	{
		Field f1=new Floor();
		Field f2=new Floor();								//pályaelemek
		Field f3=new Floor();
		Field f4=null;
		
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: Floor]");				//pályaelemek beírása a loggerbe
		Logger.putLogData(f3, "[f3: Floor]");
		
		System.out.println("Tolható a játékos? (I/N)");			
		Scanner sc = new Scanner(System.in);
		String res = sc.nextLine();
					
			if(res.equals("I"))								//utolsó pályaelem a választól függoen
				{
					f4 = new Floor();
					Logger.putLogData(f4, "[f4: Floor]");
				}
			else if(res.equals("N"))
				{
					f4 = new Wall();
					Logger.putLogData(f4, "[f4: Wall]");
				}
		
		Floor.ConnectHorizontal(f1, f2);
		Floor.ConnectHorizontal(f2, f3);					//pályaelemek összekötése
		Floor.ConnectHorizontal(f3, f4);
		
		Player p1=new Player(game);
		Player p2=new Player(game);							// dolgok a pályán
		Box b1=new Box();
		
		Logger.putLogData(p1, "[p1: Player]");				
		Logger.putLogData(p2, "[p2: Player]");				//dolgok beírása a loggerbe
		Logger.putLogData(b1, "[b1: Box]");
		
		
		p1.setField(f1);
		f1.set(p1);
		
		b1.setField(f2);									//dolgok lehelyezése a pályára
		f2.set(b1);
		
		p2.setField(f3);
		f3.set(p2);
		
		p1.step(Direction.RIGHT);
		
	}
	//Test case 17
	public void boxStepsFromSwitch()					//doboz lelép a Switchrol

	{
		Field f1=new Floor();
		Field f2=new TrapDoor();
		Field f3=new Switch((TrapDoor)f2);							//pályaelemek
		Field f4=new Floor();
		
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: TrapDoor");
		Logger.putLogData(f3, "[f3: Switch]");						//pályaelemek beírása a loggerbe
		Logger.putLogData(f4, "[f4:Floor]");
		
		Field.ConnectHorizontal(f1, f3);							//pályaelemek összekötése
		Field.ConnectHorizontal(f3, f4);
		
		Player p1=new Player(game);									// dolgok a pályán
		Box b1=new Box();
		
		Logger.putLogData(p1, "[p1: Player]");						//dolgok beírása a loggerbe
		Logger.putLogData(b1, "[b1: Box]");
		
		f1.set(p1);
		p1.setField(f1);
																	//dolgok lehelyezése a pályára
		f3.set(b1);
		b1.setField(f3);
		
		p1.step(Direction.RIGHT);
		
	}
	//Test case 18
	public void boxStepsFromStorageArea()				//doboz lelép a célhelyrol
	{
		Field f1=new Floor();
		Field f2=new StoreageArea();								//pályaelemek
		Field f3=new Floor();
		
		Logger.putLogData(f1, "[f1: Floor]");
		Logger.putLogData(f2, "[f2: StorageArea");					//pályaelemek beírása a loggerbe
		Logger.putLogData(f3, "[f3: Floor]");
		
		Field.ConnectHorizontal(f1, f2);							//pályaelemek összekötése
		Field.ConnectHorizontal(f2, f3);
		
		Player p1=new Player(game);									// dolgok a pályán
		Box b1=new Box();
		
		Logger.putLogData(p1, "[p1: Player]");						//dolgok beírása a loggerbe
		Logger.putLogData(b1, "[b1: Box]");
		
		p1.setField(f1);
		f1.set(p1);
		
		b1.setField(f2);											//dolgok lehelyezése a pályára
		b1.setLastPusher(p1);
		f2.set(b1);
		
		p1.step(Direction.RIGHT);
		
	}
	//@csiki100 end
}
