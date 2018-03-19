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

public class Game {

   // private List < Field > fields;	// a grafikus programban lesz jelent�s�ge. 
    private boolean running;
    private TestWareHouse testWareHouse = new TestWareHouse(this);

    public static void main(String[] args) {
        new Game().startGame();
    }

    public void startGame() {
        int menulistNum = -1;
        running = true;

        while (menulistNum != 0) {
            Menu.printMenuList();
            menulistNum = Menu.readListNumber();

            switch (menulistNum) {
                case 0:
                	
                    break;
                case 1:
                    //System.out.println("1st test is running...");
                    this.testWareHouse.workerStepsToFloorTest();
                    //System.out.println("1st test end \n \n");
                    break;
                case 2:
                    //System.out.println("2nd test is running...");
                    this.testWareHouse.workerStepsToHoleTest();
                    //System.out.println("2nd test end \n \n");
                    break;
                case 3:
                    //System.out.println("3rd test is running...");
                    this.testWareHouse.workerStepsToTrapDoorTest();
                    //System.out.println("3rd test end \n \n");
                    break;
                case 4:
                    //System.out.println("4th test is running...");
                    this.testWareHouse.workerStepsToStoreageArea();
                    //System.out.println("4th test end");
                    break;
                case 5:
                    //System.out.println("5th test is running...");
                    this.testWareHouse.workerStepsToSwitch();
                    //System.out.println("5th test end");
                    break;
                case 6:
                    //System.out.println("6th test is running...");
                    this.testWareHouse.workerHitTheWall();
                    //System.out.println("6th test end");
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
                case 11:
                    this.testWareHouse.boxStepsToTrapdoor();
                    break;
                    //Ferenc9 end
                    //csiki100 begin
                case 12:
                    this.testWareHouse.boxStepsToStorageArea();
                    break;
                case 13:
                    this.testWareHouse.boxStepsToSwitch();
                    break;
                case 14:
                    this.testWareHouse.boxStepsToWall();
                    break;
                case 15:
                    this.testWareHouse.boxStepstoPlayer();
                    break;
                case 16:
                    this.testWareHouse.boxStepsFromSwitch();
                    break;
                case 17:
                    this.testWareHouse.boxStepsFromStorageArea();
                    break;
                    //csiki100 end
                default:
                    Menu.notFoundListNumErrorMessage();
                    break;
            }

            System.out.println("=================================================\n");
        }
        // new EventTest();		
        // System.out.println("it works");

    }

    public void endGame() {
        running = false;
    }


}