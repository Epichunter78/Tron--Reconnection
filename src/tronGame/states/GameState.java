package tronGame.states;

import java.awt.Graphics;

import tronGame.Handler;
import tronGame.entities.actors.Player;
import tronGame.entities.actors.PlayerFour;
import tronGame.entities.actors.PlayerThree;
import tronGame.entities.actors.PlayerTwo;
import tronGame.worlds.World;

public class GameState extends State {
	
	private Player player;
	private PlayerTwo playerTwo;
	private PlayerThree playerThree;
	private PlayerFour playerFour;
	private World world;
	
	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "data/worlds/world1.txt");
		handler.setWorld(world);
		player = new Player(handler, 100, 100);
		playerTwo = new PlayerTwo(handler, 400, 100);
		playerThree = new PlayerThree(handler, 100, 420);
		playerFour = new PlayerFour(handler, 400, 420);
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
		playerTwo.tick();
		playerThree.tick();
		playerFour.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
		playerTwo.render(g);
		playerThree.render(g);
		playerFour.render(g);
	}

}
