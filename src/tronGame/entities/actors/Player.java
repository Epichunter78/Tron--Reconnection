package tronGame.entities.actors;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import tronGame.Handler;
import tronGame.gfx.Animation;
import tronGame.gfx.Assets;

public class Player extends Actor {
	
	//Direction Swapping
	private Animation cOneUp, cOneDown, cOneLeft, cOneRight;
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Actor.DEFAULT_ACTOR_WIDTH, Actor.DEFAULT_ACTOR_HEIGHT);
	
		bounds.x = 0;
		bounds.y = 5;
		bounds.width = 20;
		bounds.height = 10;
		
		//Direction Swapping
		cOneUp = new Animation(500, Assets.cycleOne_up);
		cOneDown = new Animation(500, Assets.cycleOne_down);
		cOneLeft = new Animation(500, Assets.cycleOne_left);
		cOneRight = new Animation(500, Assets.cycleOne_right);
	}

	@Override
	public void tick() {
		//Animations
		cOneUp.tick();
		cOneDown.tick();
		cOneLeft.tick();
		cOneRight.tick();
		//Movement
		getInput();
		move();
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove = speed;
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
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
	
	private int direction = 1; 
	
	public BufferedImage getCurrentAnimationFrame() {
		  if (xMove != 0 || yMove != 0) {
		   if (xMove < 0) {
		    direction = 2;
		    playerMove();
		    constantMove();
		    return cOneLeft.getCurrentFrame();
		   } else if (xMove > 0) {
		    direction = 3;
		    playerMove();
		    constantMove();
		    return cOneRight.getCurrentFrame();
		   } else if (yMove < 0) {
		    direction = 0;
		    playerMove();
		    constantMove();
		    return cOneUp.getCurrentFrame();
		   } else {
		    direction = 1;
		    playerMove();
		    constantMove();
		    return cOneDown.getCurrentFrame();
		   }
		  } else return Assets.cycleOne_still[direction];
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
