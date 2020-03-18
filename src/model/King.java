package model;

public class King extends Figuren {

	public static final figuresType type = figuresType.KING;
	
	public King(boolean isBeaten) {
		super(isBeaten, type);
	}
	
	public void showFigure(figuresType type) {
		// TODO Auto-generated method stub

	}

	public Tile getNextMove(figuresType type, Map map) {
		// TODO Auto-generated method stub
		return null;
	}

}
