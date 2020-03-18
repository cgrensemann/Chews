package model;

public abstract class Figuren {

	//Castle = Turm, Bishop = Laufer, Knight = Springer, Pawn = Bauer
	public enum figuresType {KING, QUEEN, CASTLE, BISHOP, KNIGHT, PAWN};
	public enum figuresColor {WHITE, BLACK};
	
	public figuresType type = null;
	protected boolean isBeaten;
	
	public Figuren (boolean beaten, figuresType type) {
		this.isBeaten = beaten;
		this.type = type;
	}
	
	/**
	 * Shows the figure, references to view where figures where shown
	 * @param type enum, for the type of figure
	 */
	public abstract void showFigure(figuresType type);
	
	/**
	 * Returns the next possible move for the choosen figure
	 * @param type figuresType
	 * @param map the current map
	 * @return tiles, where the figures can move to
	 */
	public abstract Tile getNextMove(figuresType type, Map map);
}

