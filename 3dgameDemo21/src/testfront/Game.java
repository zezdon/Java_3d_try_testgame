package testfront;

import java.awt.event.KeyEvent;

import testfront.input.Controller;
import testfront.level.Level;

public class Game {
	public int time;
	public Controller controls;
	public Level level;
		
	public Game() {
		controls = new Controller();
		level = new Level(20,20);
	}
	
	public void tick(boolean[] key) {
		time++;
		boolean forward = key[KeyEvent.VK_UP];
		boolean back = key[KeyEvent.VK_DOWN];
		boolean left = key[KeyEvent.VK_LEFT];
		boolean right = key[KeyEvent.VK_RIGHT];
		//boolean turnLeft = key[KeyEvent.VK_LEFT];
		//boolean turnRight = key[KeyEvent.VK_RIGHT];
		boolean jump = key[KeyEvent.VK_SPACE];
		boolean crouch = key[KeyEvent.VK_CONTROL];
		boolean run = key[KeyEvent.VK_SHIFT];
				
		controls.tick(forward, back, left, right, jump, crouch, run);
		
		
	}
		
}
