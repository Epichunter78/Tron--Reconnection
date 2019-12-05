package tronGame.entities.actors;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import tronGame.Handler;
import tronGame.gfx.Animation;
import tronGame.gfx.Assets;

public class PlayerFour extends Actor {
	
	//Direction Swapping
	private Animation cFourUp, cFourDown, cFourLeft, cFourRight;
	
	public PlayerFour(Handler handler, float x, float y) {
		super(handler, x, y, Actor.DEFAULT_ACTOR_WIDTH, Actor.DEFAULT_ACTOR_HEIGHT);
	
		bounds.x = 0;
		bounds.y = 5;
		bounds.width = 20;
		bounds.height = 10;
		
		//Direction Swapping
		cFourUp = new Animation(500, Assets.cycleFour_up);
		cFourDown = new Animation(500, Assets.cycleFour_down);
		cFourLeft = new Animation(500, Assets.cycleFour_left);
		cFourRight = new Animation(500, Assets.cycleFour_right);
	}

	@Override
	public void tick() {
		//Animations
		cFourUp.tick();
		cFourDown.tick();
		cFourLeft.tick();
		cFourRight.tick();
		//Movement
		getInput();
		move();
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().upFour)
			yMove = -speed;
		if(handler.getKeyManager().downFour)
			yMove = speed;
		if(handler.getKeyManager().leftFour)
			xMove = -speed;
		if(handler.getKeyManager().rightFour)
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
		    return cFourLeft.getCurrentFrame();
		   } else if (xMove > 0) {
		    direction = 3;
		    playerMove();
		    constantMove();
		    return cFourRight.getCurrentFrame();
		   } else if (yMove < 0) {
		    direction = 0;
		    playerMove();
		    constantMove();
		    return cFourUp.getCurrentFrame();
		   } else {
		    direction = 1;
		    playerMove();
		    constantMove();
		    return cFourDown.getCurrentFrame();
		   }
		  } else return Assets.cycleFour_still[direction];
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
