
/*
 * Class is responsible for a single tile on the board.
 */
public abstract class Tile {
	int tilePosition;
	
	//Constructor
	Tile(int tilePosition) {
		this.tilePosition=tilePosition;
	}
	
	//Responsible for getting a piece on a tile.
	public abstract boolean isTileOccupied();
	public abstract Piece getPiece();
	
	/*
	 * Class for an empty tile.
	 */
	public static final class EmptyTile extends Tile {
		EmptyTile(int position) {
			super(position);
		}
		
		//If tile is Occupied.
		@Override
		public boolean isTileOccupied() {
			return false;
		}
		
		//Gets piece on empty tile.
		@Override
		public Piece getPiece() {
			return null;
		}
	}
	
	/*
	 * Class for an Occupied Tile
	 */
	public static final class OccupiedTile extends Tile {
		Piece piece;
		
		OccupiedTile(int tilePosition, Piece piece) {
			super(tilePosition);
			this.piece=piece;
		}
		
		@Override
		public boolean isTileOccupied() {
			return true;
		}
		
		@Override
		public Piece getPiece() {
			return this.piece;
		}
	}
	
}
