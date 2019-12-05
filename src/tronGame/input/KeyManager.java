package tronGame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
	
	private boolean[] keys;
	public boolean up, down, left, right, upTwo, downTwo, leftTwo, rightTwo, upThree, downThree, leftThree, rightThree, upFour, downFour, leftFour, rightFour;
	
	public KeyManager(){
		keys = new boolean[256];
	}
	
	public void tick(){
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		
		upTwo = keys[KeyEvent.VK_UP];
		downTwo = keys[KeyEvent.VK_DOWN];
		leftTwo = keys[KeyEvent.VK_LEFT];
		rightTwo = keys[KeyEvent.VK_RIGHT];
		
		upThree = keys[KeyEvent.VK_T];
		downThree = keys[KeyEvent.VK_G];
		leftThree = keys[KeyEvent.VK_F];
		rightThree = keys[KeyEvent.VK_H];
		
		upFour = keys[KeyEvent.VK_I];
		downFour = keys[KeyEvent.VK_K];
		leftFour = keys[KeyEvent.VK_J];
		rightFour = keys[KeyEvent.VK_L];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
