package chessProject;

public class Chessboard 
{
	private Piece[][] board;
	public Chessboard()
	{
		board = new Piece[8][8];
	}
	
	public void startGame()
	{
		board[0][0] = new Rook(0,0,true);

	}
	public Piece getOccupant(int x, int y)
	{
		return board[x][y];
	}
	public Piece executeMove(Move move)
	{
		
		Piece active = move.piece;
		Piece captured = getOccupant(active.getX() + move.delX, active.getY() + move.delY);
		board[active.getX() + move.delX][active.getY() + move.delY] = null;
		board[active.getX() + move.delX][active.getY() + move.delY] = active;
		
		return captured;	
	}
}
