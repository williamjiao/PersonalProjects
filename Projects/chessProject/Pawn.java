package chessProject;
import java.util.ArrayList;

public class Pawn extends Piece
{
	public Pawn(Square location, boolean white)
	{
		super(location, "p", white);
	}
	public ArrayList<Square> getValidMoves(Chessboard board)
	{
		ArrayList<Square> validMoves = new ArrayList<Square>();
		int posX = super.getX();
		int posY = super.getY();
		if(super.getTeam())
		{
			if(Square.isValid(posX, posY + 1) && board.getBoard()[posX][posY + 1].getOccupant() == null)
				validMoves.add(board.getBoard()[posX][posY + 1]);
			if(Square.isValid(posX + 1, posY + 1) && board.getBoard()[posX][posY + 1].getOccupant() != null)
				validMoves.add(board.getBoard()[posX + 1][posY + 1]);
			if(Square.isValid(posX - 1, posY + 1) && board.getBoard()[posX][posY + 1].getOccupant() != null)
				validMoves.add(board.getBoard()[posX - 1][posY + 1]);

		}
		else
		{
			if(Square.isValid(posX, posY - 1) && board.getBoard()[posX][posY + 1].getOccupant() == null)
				validMoves.add(board.getBoard()[posX][posY - 1]);
			if(Square.isValid(posX + 1, posY - 1) && board.getBoard()[posX][posY + 1].getOccupant() != null)
				validMoves.add(board.getBoard()[posX + 1][posY - 1]);
			if(Square.isValid(posX - 1, posY - 1) && board.getBoard()[posX][posY + 1].getOccupant() != null)
				validMoves.add(board.getBoard()[posX - 1][posY - 1]);
		}
		return validMoves;
	}
	public String getImage()
	{
		String name = "";
		if(super.getTeam())
			name += "White ";
		else
			name += "Black ";
		name += super.getName();
		return name;
			
	}
}
