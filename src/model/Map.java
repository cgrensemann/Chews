package model;

public class Map {
	private Tile[][] map;
	
	public Map(int x, int y) {
		map = new Tile[x][y];
		createTiles(x,y);
	}
	
	private void createTiles(int x, int y) {
		for(int i = 0; i<x; i++) {
			for(int j = 0; j<y; j++) {
				map[i][j] = new Tile(i,j);
			}
		}
	}
	
	public Tile[][] getMap() {
		return map;
	}
	
	public void setMap(Tile[][] map) {
		this.map = map;
	}
}
