package model;

public interface Figuren {

	//Castle = Turm, Bishop = Laufer, Knight = Springer, Pawn = Bauer
	public enum figuresType {KING, QUEEN, CASTLE, BISHOP, KNIGHT, PAWN};
	
	public static final figuresType type = null;
	
	/**
	 * Shows the figure, references to view where figures where shown
	 * @param type enum, for the type of figure
	 */
	public void showFigure(figuresType type);
	
	/**
	 * Returns the next possible move for the choosen figure
	 * @param type figuresType
	 * @param map the current map
	 * @return tiles, where the figures can move to
	 */
	public Tile getNextMove(figuresType type, Map map);
}

