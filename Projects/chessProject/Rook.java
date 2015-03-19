package chessProject;
import java.util.ArrayList;
public class Rook extends Piece
{
	public Rook(Square position, boolean white)
	{	
		super(position, "r", white);
	}
	
	public ArrayList<Square> getValidMoves(Chessboard board)
	{
		ArrayList<Square> validMoves = new ArrayList<Square>();
		int posX = super.getX();
		int posY = super.getY();
		for(int i = posX - 1; i > 0; i--)
		{
			validMoves.add(board.getBoard()[i][posY]);
			if(board.getBoard()[i][posY].getOccupant() != null)
				break;
		}
		for(int i = posY - 1; i > 0; i--)
		{
			validMoves.add(board.getBoard()[posX][i]);
			if(board.getBoard()[posX][i].getOccupant() != null)
				break;
		}
		for(int i = posX + 1; i < 8; i++)
		{
			validMoves.add(board.getBoard()[i][posY]);
			if(board.getBoard()[i][posY].getOccupant() != null)
				break;
		}
		for(int i = posY + 1; i > 0; i++)
		{
			validMoves.add(board.getBoard()[posX][i]);
			if(board.getBoard()[posX][i].getOccupant() != null)
				break;
		}
				
		return validMoves;
	}
}
