package tronGame.entities;

import java.awt.Graphics;
import java.util.ArrayList;

import tronGame.Handler;
import tronGame.entities.actors.Player;
import tronGame.entities.actors.PlayerFour;
import tronGame.entities.actors.PlayerThree;
import tronGame.entities.actors.PlayerTwo;

public class EntityManager {
	
	private Handler handler;
	private Player player;
	private ArrayList<Entity> entities;
	private PlayerTwo playerTwo;
	private PlayerThree playerThree;
	private PlayerFour playerFour;
	
	public EntityManager(Handler handler, Player player,  PlayerTwo playerTwo, PlayerThree playerThree, PlayerFour playerFour){
		this.handler = handler;
		this.player = player;
		this.setPlayerTwo(playerTwo);
		this.setPlayerThree(playerThree);
		this.setPlayerFour(playerFour);
		entities = new ArrayList<Entity>();
		addEntity(player);
		addEntity(playerTwo);
		addEntity(playerThree);
		addEntity(playerFour);
	}
	
	public void tick(){
		for(int i = 0;i < entities.size();i++){
			Entity e = entities.get(i);
			e.tick();
		}
	}
	
	public void render(Graphics g){
		for(Entity e : entities){
			e.render(g);
		}
	}
	
	public void addEntity(Entity e){
		entities.add(e);
	}
	
	//Getters and Setters

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}

	public PlayerTwo getPlayerTwo() {
		return playerTwo;
	}

	public void setPlayerTwo(PlayerTwo playerTwo) {
		this.playerTwo = playerTwo;
	}

	public PlayerThree getPlayerThree() {
		return playerThree;
	}

	public void setPlayerThree(PlayerThree playerThree) {
		this.playerThree = playerThree;
	}

	public PlayerFour getPlayerFour() {
		return playerFour;
	}

	public void setPlayerFour(PlayerFour playerFour) {
		this.playerFour = playerFour;
	}

}
