package chess;

import boardGame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
<<<<<<< HEAD
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
=======
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
>>>>>>> 41a8749f6d63f5cabc37be5082fa8a6bcee9084e
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
<<<<<<< HEAD

=======
	
>>>>>>> 41a8749f6d63f5cabc37be5082fa8a6bcee9084e
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
<<<<<<< HEAD
	
=======

>>>>>>> 41a8749f6d63f5cabc37be5082fa8a6bcee9084e
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD
}
=======
	
	
}
>>>>>>> 41a8749f6d63f5cabc37be5082fa8a6bcee9084e
