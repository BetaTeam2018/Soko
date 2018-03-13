/**
* @Project : KillerSokoban
* @fileName Game.java
* @date : 3/13/2018
* @author : 
*/

package game;
import etc.EventTest;

public class Game{
	
	private Field field;
	private boolean runing;
	
	
	public static void main(String[] args) {	
		new Game().startGame();
			
		
	}
	
	public void startGame() {
		runing = true;
		
		//TODO Gameloop
		
		new EventTest();	
		
		System.out.println("it works");
		
	}
	
	public void endGame() {
		runing = false;
	}	
	
}
