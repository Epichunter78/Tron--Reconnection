package tronGame.entities.actors;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import tronGame.Handler;
import tronGame.gfx.Animation;
import tronGame.gfx.Assets;

public class PlayerThree extends Actor {
	
	//Direction Swapping
	private Animation cThreeUp, cThreeDown, cThreeLeft, cThreeRight;
	
	public PlayerThree(Handler handler, float x, float y) {
		super(handler, x, y, Actor.DEFAULT_ACTOR_WIDTH, Actor.DEFAULT_ACTOR_HEIGHT);
	
		bounds.x = 0;
		bounds.y = 5;
		bounds.width = 20;
		bounds.height = 10;
		
		//Direction Swapping
		cThreeUp = new Animation(500, Assets.cycleThree_up);
		cThreeDown = new Animation(500, Assets.cycleThree_down);
		cThreeLeft = new Animation(500, Assets.cycleThree_left);
		cThreeRight = new Animation(500, Assets.cycleThree_right);
	}

	@Override
	public void tick() {
		//Animations
		cThreeUp.tick();
		cThreeDown.tick();
		cThreeLeft.tick();
		cThreeRight.tick();
		//Movement
		getInput();
		move();
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().upThree)
			yMove = -speed;
		if(handler.getKeyManager().downThree)
			yMove = speed;
		if(handler.getKeyManager().leftThree)
			xMove = -speed;
		if(handler.getKeyManager().rightThree)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	private void playerMove() {
		if(xMove < 0) {
			bounds.x = 0;
			bounds.y = 5;
			bounds.width = 20;
			bounds.height = 10;
			
		}else if(xMove > 0) {
			bounds.x = 0;
			bounds.y = 5;
			bounds.width = 20;
			bounds.height = 10;
		}else if(yMove < 0) {
			bounds.x = 5;
			bounds.y = 0;
			bounds.width = 10;
			bounds.height = 20;
			;
		}else if(yMove > 0){
			bounds.x = 5;
			bounds.y = 0;
			bounds.width = 10;
			bounds.height = 20;
		}
	}
	
	private int direction = 0; 
	
	public BufferedImage getCurrentAnimationFrame() {
		  if (xMove != 0 || yMove != 0) {
		   if (xMove < 0) {
		    direction = 2;
		    playerMove();
		    constantMove();
		    return cThreeLeft.getCurrentFrame();
		   } else if (xMove > 0) {
		    direction = 3;
		    playerMove();
		    constantMove();
		    return cThreeRight.getCurrentFrame();
		   } else if (yMove < 0) {
		    direction = 0;
		    playerMove();
		    constantMove();
		    return cThreeUp.getCurrentFrame();
		   } else {
		    direction = 1;
		    playerMove();
		    constantMove();
		    return cThreeDown.getCurrentFrame();
		   }
		  } else return Assets.cycleThree_still[direction];
	}
	
	private void constantMove() {
		while(xMove != 0 || yMove != 0) {
			if (xMove < 0) {
				xMove ++;
			} else if (xMove > 0){
				xMove --;
			} else if (yMove < 0) {
				yMove++ ;
			} else yMove--;
		}
	}
}
