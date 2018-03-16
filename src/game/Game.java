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
			
			//Ferenc9 begin	
			case 7:				
				this.testWareHouse.playerPushesBox();
				break;
			case 8:
				this.testWareHouse.playerPushesPlayer();
				break;
			case 9:
				this.testWareHouse.boxStepsToFloor();
				break;
			case 10:
				this.testWareHouse.boxStepsToHole();
				break;
			case 11: this.testWareHouse.boxStepsToTrapdoor();
				break;
			//Ferenc9 end
			//csiki100 begin
			case 12: this.testWareHouse.BoxStepsToStorageArea();
				break;
			case 13: this.testWareHouse.BoxStepsToSwitch();
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
