package tronGame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage title, tron, corruption, wall;
	public static BufferedImage[] cycleOne_up, cycleOne_left, cycleOne_down, cycleOne_right;
	public static BufferedImage[] cycleOne_still;
	public static BufferedImage[] cycleTwo_up, cycleTwo_left, cycleTwo_down, cycleTwo_right;
	public static BufferedImage[] cycleTwo_still;
	public static BufferedImage[] cycleThree_up, cycleThree_left, cycleThree_down, cycleThree_right;
	public static BufferedImage[] cycleThree_still;
	public static BufferedImage[] cycleFour_up, cycleFour_left, cycleFour_down, cycleFour_right;
	public static BufferedImage[] cycleFour_still;
	public static BufferedImage[] btn_start;
	public static BufferedImage[] btn_start_pressed;
	
	public static void init(){
		//Title Assets
		btn_start = new BufferedImage[1];
		btn_start[0] = ImageLoader.loadImage("/textures/btn_start.png");
		btn_start_pressed = new BufferedImage[1];
		btn_start_pressed[0] = ImageLoader.loadImage("/textures/btn_start_pressed.png");
		
		title = ImageLoader.loadImage("/textures/title.png");
		
		//Cycle One		
		cycleOne_up = new BufferedImage[1];
		cycleOne_left = new BufferedImage[1];
		cycleOne_down = new BufferedImage[1];
		cycleOne_right = new  BufferedImage[1];
		
		cycleOne_still = new BufferedImage[4];
		
		cycleOne_up[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerOneCycleUP.png");
		cycleOne_left[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerOneCycleLEFT.png");
		cycleOne_down[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerOneCycleDOWN.png");
		cycleOne_right[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerOneCycleRIGHT.png");
		
		cycleOne_still[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerOneCycleUP.png");
		cycleOne_still[2] = ImageLoader.loadImage("/Character Sprites/TronPlayerOneCycleLEFT.png");
		cycleOne_still[1] = ImageLoader.loadImage("/Character Sprites/TronPlayerOneCycleDOWN.png");
		cycleOne_still[3] = ImageLoader.loadImage("/Character Sprites/TronPlayerOneCycleRIGHT.png");
		
		//Cycle Two
		cycleTwo_up = new BufferedImage[1];
		cycleTwo_left = new BufferedImage[1];
		cycleTwo_down = new BufferedImage[1];
		cycleTwo_right = new  BufferedImage[1];
		
		cycleTwo_still = new BufferedImage[4];
		
		cycleTwo_up[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerTwoCycleUP.png");
		cycleTwo_left[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerTwoCycleLEFT.png");
		cycleTwo_down[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerTwoCycleDOWN.png");
		cycleTwo_right[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerTwoCycleRIGHT.png");
		
		cycleTwo_still[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerTwoCycleUP.png");
		cycleTwo_still[2] = ImageLoader.loadImage("/Character Sprites/TronPlayerTwoCycleLEFT.png");
		cycleTwo_still[1] = ImageLoader.loadImage("/Character Sprites/TronPlayerTwoCycleDOWN.png");
		cycleTwo_still[3] = ImageLoader.loadImage("/Character Sprites/TronPlayerTwoCycleRIGHT.png");

		//Cycle Three
		cycleThree_up = new BufferedImage[1];
		cycleThree_left = new BufferedImage[1];
		cycleThree_down = new BufferedImage[1];
		cycleThree_right = new  BufferedImage[1];
		
		cycleThree_still = new BufferedImage[4];
		
		cycleThree_up[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerThreeCycleUP.png");
		cycleThree_left[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerThreeCycleLEFT.png");
		cycleThree_down[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerThreeCycleDOWN.png");
		cycleThree_right[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerThreeCycleRIGHT.png");
		
		cycleThree_still[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerThreeCycleUP.png");
		cycleThree_still[2] = ImageLoader.loadImage("/Character Sprites/TronPlayerThreeCycleLEFT.png");
		cycleThree_still[1] = ImageLoader.loadImage("/Character Sprites/TronPlayerThreeCycleDOWN.png");
		cycleThree_still[3] = ImageLoader.loadImage("/Character Sprites/TronPlayerThreeCycleRIGHT.png");

		//Cycle Four
		cycleFour_up = new BufferedImage[1];
		cycleFour_left = new BufferedImage[1];
		cycleFour_down = new BufferedImage[1];
		cycleFour_right = new  BufferedImage[1];
		
		cycleFour_still = new BufferedImage[4];
		
		cycleFour_up[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerFourCycleUP.png");
		cycleFour_left[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerFourCycleLEFT.png");
		cycleFour_down[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerFourCycleDOWN.png");
		cycleFour_right[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerFourCycleRIGHT.png");
		
		cycleFour_still[0] = ImageLoader.loadImage("/Character Sprites/TronPlayerFourCycleUP.png");
		cycleFour_still[2] = ImageLoader.loadImage("/Character Sprites/TronPlayerFourCycleLEFT.png");
		cycleFour_still[1] = ImageLoader.loadImage("/Character Sprites/TronPlayerFourCycleDOWN.png");
		cycleFour_still[3] = ImageLoader.loadImage("/Character Sprites/TronPlayerFourCycleRIGHT.png");

		
		tron = ImageLoader.loadImage("/textures/tronTile.png");
		corruption = ImageLoader.loadImage("/textures/TronCorruption.png");
		wall = ImageLoader.loadImage("/textures/WallTile.png");
	}
	
}
