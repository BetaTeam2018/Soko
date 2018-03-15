/**
* @Project : KillerSokoban
* @fileName Game.java
* @date : 3/13/2018
* @author : 
*/

package game;


import java.util.List;
import skeleton_menu.Menu;
import skeleton_menu.TestWareHouse;

public class Game  {
	
	private List<Field> fields;
	private boolean running;
	private TestWareHouse testWareHouse = new TestWareHouse(this);
	
	public static void main(String[] args) {	
		new Game().startGame();
	}
	
	public void startGame() {
		int menulistNum = -1;
		running = true;
		

		while (menulistNum!=0) {						
			Menu.printMenuList();						
			menulistNum = Menu.readListNumber();		

		
			switch (menulistNum) {
			case 0: 
				break;
			case 1: 
				System.out.println("1st test is running...");
				this.testWareHouse.workerStepsToFloorTest();
				System.out.println("1st test end \n \n");
				break;
			case 2: 
				// TODO: call test-functions
				break;
			// ... case n: break;
			case 7:
				System.out.println("1st test is running...");
				this.testWareHouse.playerPushesBox();
				break;				
				
			default: 
				Menu.notFoundListNumErrorMessage();		
				break;
			}
		}
	// new EventTest();		
	// System.out.println("it works");
		
	}
	
	public void endGame() {
		running = false;
	}

	
}
