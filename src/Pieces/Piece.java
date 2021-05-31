package Pieces;
/*
 * Generic piece class for all types of pieces to refer to
 */
public abstract class Piece {

	//NOT DECLARED YET
	protected final int piecePosition;
	protected final Alliance pieceAlliance;
	
	Piece(final int  piecePosition, final Alliance pieceAlliance) {
		this.piecePosition=piecePosition;
		this.pieceAlliance=pieceAlliance;
	}
	
	//Calculates legal moves for a piece
	public abstract List<Moves> legalMoves(final Board board);
	
}
