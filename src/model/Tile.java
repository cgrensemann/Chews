package model;

import java.awt.Color;

public class Tile {
	private int posX;
	private int posY;
	private Color color;
	
	public Tile(int x, int y) {
		setX(x);
		setY(y);
		giveColor();
	}
	public int getX() {
		return posX;
	}
	
	public int getY() {
		return posY;
	}
	
	public void setX(int x) {
		posX = x;
	}
	
	public void setY (int y) {
		posY = y;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color c) {
		color = c;
	}
	
	private void giveColor() {
		if((getX() + getY())%2 == 0) {
			setColor(Color.DARK_GRAY);
		} else {
			setColor(Color.WHITE);
		}
	}

}
