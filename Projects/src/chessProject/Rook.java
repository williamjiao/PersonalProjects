package chessProject;

public class Rook extends Piece 
{
	public Rook(int x, int y, boolean team)
	{
		super(x, y, team);
	}
	public boolean validateMove(Move move, Chessboard board)
	{
		if(!super.moveInBounds(move) || (move.delX != 0 && move.delY != 0) || (move.delX == 0 && move.delY == 0))
			return false;
		boolean vertical = (move.delY != 0);
		int directionIndex;
		int i = 1;
		if(vertical)
		{
			directionIndex = move.delY / Math.abs(move.delY);
			while(board.getOccupant(super.getX(), super.getY() + i * directionIndex) != null)
			{
				i++;
				if(move.delY == i * directionIndex)
					return true;
			}
		}
		else
		{
			directionIndex = move.delX / Math.abs(move.delX);
			while(board.getOccupant(super.getX() + i*directionIndex, super.getY()) != null)
			{
				i++;
				if(move.delX == i * directionIndex)
					return true;
			}
		}
		return false;

	}
}
