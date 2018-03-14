/**
* @Project : KillerSokoban
* @fileName Game.java
* @date : 3/13/2018
* @author : 
*/

package game;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import etc.EventTest;
import skeleton_menu.Menu;

public class Game implements KeyListener {
	
	private Field field;
	private boolean runing;
	
	
	public static void main(String[] args) {	
		new Game().startGame();
			
		
	}
	
	public void startGame() {
		runing = true;
		
		//TODO Gameloop: menu
		Menu.printMenuList();
	//	new EventTest();	
		
		System.out.println("it works");
		
	}
	
	public void endGame() {
		runing = false;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
	
}
