package tronGame.worlds;

import java.awt.Graphics;

import tronGame.Handler;
import tronGame.entities.EntityManager;
import tronGame.entities.actors.Player;
import tronGame.entities.actors.PlayerFour;
import tronGame.entities.actors.PlayerThree;
import tronGame.entities.actors.PlayerTwo;
import tronGame.tiles.Tile;
import tronGame.utils.Utils;

public class World {

	private Handler handler;
	private int width, height;
	private int[][] tiles;
	//Entities
	private EntityManager entityManager;
	
	public World(Handler handler, String path){
		this.handler = handler;
		entityManager = new EntityManager(handler, new Player(handler, 100, 100), new PlayerTwo(handler, 400, 100), new PlayerThree(handler, 100, 420), new PlayerFour(handler, 420, 100));

		loadWorld(path);
		
		entityManager.getPlayer().setX(520);
		entityManager.getPlayer().setY(520);
		entityManager.getPlayerTwo().setX(0);
		entityManager.getPlayerTwo().setY(520);
		entityManager.getPlayerThree().setX(520);
		entityManager.getPlayerThree().setY(0);
		entityManager.getPlayerFour().setX(-20);
		entityManager.getPlayerFour().setY(0);
	}
		
	public void tick(){
		entityManager.tick();
	}
	
	public void render(Graphics g){
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		for(int y = yStart;y < yEnd;y++){
			for(int x = xStart;x < xEnd;x++){
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		//Entities
		entityManager.render(g);
	}
	
	public Tile getTile(int x, int y){
		if(x < 0 || y < 0 || x >= width || y >= height)
			return Tile.wallTile;
		
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.tronTile;
		return t;
	}
	
	private void loadWorld(String path){
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		tiles = new int[width][height];
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}
	
	
	//Getters
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}
