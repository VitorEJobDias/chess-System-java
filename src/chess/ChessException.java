package chess;

<<<<<<< HEAD
import boardGame.BoardException;

public class ChessException extends BoardException {
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
=======
public class ChessException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}
}
>>>>>>> 41a8749f6d63f5cabc37be5082fa8a6bcee9084e
