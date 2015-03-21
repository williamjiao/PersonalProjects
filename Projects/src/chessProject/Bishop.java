package chessProject;

public class Bishop extends Piece
{
	public Bishop(int x, int y, boolean white)
	{
		super(x, y, white);
	}
	public boolean validateMove(Move move, Chessboard board)
	{
		if(!(super.moveInBounds(move) && Math.abs(move.delX) == Math.abs(move.delY)))
			return false;
		if(Math.abs(move.delX) == 1)
			return true;
		int xDirection = move.delX / Math.abs(move.delX);
		int yDirection = move.delY / Math.abs(move.delY);
		
		int i = 1;
		while(board.getOccupant(super.getX() + i * xDirection, super.getY() + i * yDirection) == null)
		{
			i++;
			if(i == move.delX)
				return true;
		}
		return false;
	}
	
}
