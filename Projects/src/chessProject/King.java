package chessProject;

public class King extends Piece 
{
	public King(int x, int y, boolean team)
	{
		super(x, y, team);
	}
	public boolean validateMove(Move move, Chessboard board)
	{
		return super.moveInBounds(move) && Math.abs(move.delX) < 2 && Math.abs(move.delY) < 2 && (move.delX != 0 || move.delY != 0); 
	}
}
