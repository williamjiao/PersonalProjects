package chessProject;

public class Queen extends Piece 
{
	public Queen(int x, int y, boolean team)
	{
		super(x, y, team);
	}
	public boolean validateMove(Move move, Chessboard board)
	{
		Bishop testBishop = new Bishop(super.getX(), super.getY(), super.getTeam());
		Rook testRook = new Rook(super.getY(), super.getY(), super.getTeam());
		return testBishop.validateMove(move, board) || testRook.validateMove(move, board);
	}
}
