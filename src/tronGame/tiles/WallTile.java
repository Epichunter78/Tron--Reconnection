package tronGame.tiles;

import tronGame.gfx.Assets;

public class WallTile extends Tile {

	public WallTile(int id) {
		super(Assets.wall, id);
		// TODO Auto-generated constructor stub
	
		
	}

	public boolean isSolid(){
		return true;
	}
}
