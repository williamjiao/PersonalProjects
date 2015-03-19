package chessProject;
import java.util.ArrayList;
public class King extends Piece
{
	public King(Square position, boolean white)
	{
		super(position, "k", white);
	}
	public ArrayList<Square> getValidMoves(Chessboard board)
	{
		ArrayList<Square> validMoves = new ArrayList<Square>();
		int posX = super.getX();
		int posY = super.getY();
		if(Square.isValid(posX - 1, posY))
			validMoves.add(board.getBoard()[posX - 1][posY]);
		if(Square.isValid(posX - 1, posY - 1))
			validMoves.add(board.getBoard()[posX - 1][posY - 1]);
		if(Square.isValid(posX - 1, posY + 1))
			validMoves.add(board.getBoard()[posX - 1][posY + 1]);
		if(Square.isValid(posX, posY + 1))
			validMoves.add(board.getBoard()[posX][posY + 1]);
		if(Square.isValid(posX, posY - 1))
			validMoves.add(board.getBoard()[posX][posY - 1]);
		if(Square.isValid(posX + 1, posY - 1))
			validMoves.add(board.getBoard()[posX + 1][posY - 1]);
		if(Square.isValid(posX + 1, posY))
			validMoves.add(board.getBoard()[posX + 1][posY]);
		if(Square.isValid(posX + 1, posY + 1))
			validMoves.add(board.getBoard()[posX + 1][posY + 1]);


		return validMoves;
		
	}

}
