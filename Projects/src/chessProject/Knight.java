package chessProject;

public class Knight extends Piece
{
	public Knight(int x, int y, boolean team)
	{
		super(x, y, team);
	}
	public boolean validateMove(Move move, Chessboard board)
	{
		return super.moveInBounds(move) && ((Math.abs(move.delX) == 2 && Math.abs(move.delY) == 1) || (Math.abs(move.delX) == 2 && Math.abs(move.delY) == 1));
	}
}
