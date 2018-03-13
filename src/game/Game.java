/**
* @Project : KillerSokoban
* @fileName Game.java
* @date : 3/13/2018
* @author : 
*/

package game;
public class Game {
	
	private Field field;
	private boolean runing;
	
	public void startGame() {
		runing = true;
		
		//TODO Gameloop
		System.out.println("it works");
	}
	
	public void endGame() {
		runing = false;
	}
	
	public static void main(String[] args) {
		new Game().startGame();
	}
	
}
