package chessProject;
import  java.util.ArrayList;
public class Knight extends Piece
{
	public Knight(Square position, boolean white)
	{
		super(position, "kn", white);
	}
	
	public ArrayList<Square> getValidMoves(Chessboard board)
	{
		int posX = super.getX();
		int posY = super.getY();
		
		ArrayList<Square> validMoves = new ArrayList<Square>();
		
		if(Square.isValid(posX - 2, posY + 1))
			validMoves.add(board.getBoard()[posX - 2][posY + 1]);
		if(Square.isValid(posX + 2, posY + 1))
			validMoves.add(board.getBoard()[posX + 2][posY + 1]);
		if(Square.isValid(posX - 2, posY - 1))
			validMoves.add(board.getBoard()[posX - 2][posY - 1]);
		if(Square.isValid(posX + 2, posY - 1))
			validMoves.add(board.getBoard()[posX + 2][posY - 1]);
		if(Square.isValid(posX - 1, posY + 2))
			validMoves.add(board.getBoard()[posX - 1][posY + 2]);
		if(Square.isValid(posX + 1, posY + 2))
			validMoves.add(board.getBoard()[posX + 1][posY + 2]);
		if(Square.isValid(posX - 1, posY - 2))
			validMoves.add(board.getBoard()[posX - 1][posY - 2]);
		if(Square.isValid(posX + 1, posY - 2))
			validMoves.add(board.getBoard()[posX + 1][posY - 2]);
		
		return validMoves;
		
	}
}
