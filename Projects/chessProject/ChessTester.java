package chessProject;
import java.awt.*;
import java.util.HashMap;
import java.util.Set;
public class ChessTester
{	
	public ChessTester()
	{
		
	}
	
	public static void main(String[] args)
	{
		Chessboard myBoard = new Chessboard();
		setPieces(myBoard);
		HashMap<String, Piece> pieces = setPieces(myBoard);
		GUI.buildShit(myBoard);
	}

	private static HashMap<String, Piece> setPieces(Chessboard board)
	{
		HashMap<String, Piece> pieces = new HashMap<String, Piece>();
		pieces.put("White Rook 1", (Piece)(new Rook(board.getBoard()[7][0], true)));
		pieces.put("White Rook 2", (Piece)(new Rook(board.getBoard()[7][7], true)));
		pieces.put("White Pawn 1", (Piece)(new Pawn(board.getBoard()[6][0], true)));
		pieces.put("White Pawn 2", (Piece)(new Pawn(board.getBoard()[6][1], true)));
		pieces.put("White Pawn 3", (Piece)(new Pawn(board.getBoard()[6][2], true)));
		pieces.put("White Pawn 4", (Piece)(new Pawn(board.getBoard()[6][3], true)));
		pieces.put("White Pawn 5", (Piece)(new Pawn(board.getBoard()[6][4], true)));
		pieces.put("White Pawn 6", (Piece)(new Pawn(board.getBoard()[6][5], true)));
		pieces.put("White Pawn 7", (Piece)(new Pawn(board.getBoard()[6][6], true)));
		pieces.put("White Pawn 8", (Piece)(new Pawn(board.getBoard()[6][7], true)));
		pieces.put("White Knight 1", (Piece)(new Knight(board.getBoard()[7][1], true)));
		pieces.put("White Knight 2", (Piece)(new Knight(board.getBoard()[7][6], true)));
		pieces.put("White Bishop 1", (Piece)(new Bishop(board.getBoard()[7][2], true)));
		pieces.put("White Bishop 2", (Piece)(new Bishop(board.getBoard()[7][5], true)));
		pieces.put("White Queen", (Piece)(new Queen(board.getBoard()[7][3], true)));
		pieces.put("White King", (Piece)(new King(board.getBoard()[7][4], true)));
		
		pieces.put("Black Rook 1", (Piece)(new Rook(board.getBoard()[0][0], false)));
		pieces.put("Black Rook 2", (Piece)(new Rook(board.getBoard()[0][7], false)));
		pieces.put("Black Pawn 1", (Piece)(new Pawn(board.getBoard()[1][0], false)));
		pieces.put("Black Pawn 2", (Piece)(new Pawn(board.getBoard()[1][1], false)));
		pieces.put("Black Pawn 3", (Piece)(new Pawn(board.getBoard()[1][2], false)));
		pieces.put("Black Pawn 4", (Piece)(new Pawn(board.getBoard()[1][3], false)));
		pieces.put("Black Pawn 5", (Piece)(new Pawn(board.getBoard()[1][4], false)));
		pieces.put("Black Pawn 6", (Piece)(new Pawn(board.getBoard()[1][5], false)));
		pieces.put("Black Pawn 7", (Piece)(new Pawn(board.getBoard()[1][6], false)));
		pieces.put("Black Pawn 8", (Piece)(new Pawn(board.getBoard()[1][7], false)));
		pieces.put("Black Knight 1", (Piece)(new Knight(board.getBoard()[0][1], false)));
		pieces.put("Black Knight 2", (Piece)(new Knight(board.getBoard()[0][6], false)));
		pieces.put("Black Bishop 1", (Piece)(new Bishop(board.getBoard()[0][2], false)));
		pieces.put("Black Bishop 2", (Piece)(new Bishop(board.getBoard()[0][5], false)));
		pieces.put("Black Queen", (Piece)(new Queen(board.getBoard()[0][3], false)));
		pieces.put("Black King", (Piece)(new King(board.getBoard()[0][4], false)));

		Set<String> pieceKeys = pieces.keySet();
		for(String key : pieceKeys)
			pieces.get(key).getPosition().setOccupant(pieces.get(key));

		return pieces;




	}
	
}
