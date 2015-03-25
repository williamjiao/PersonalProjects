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
		board[7][0] = new Rook(7,0,true);
		board[7][1] = new Knight(7,1,true);
		board[7][2] = new Bishop(7,2,true);
		board[7][3] = new Queen(7,3,true);
		board[7][4] = new King(7,4,true);
		board[7][5] = new Bishop(7,5,true);
		board[7][6] = new Knight(7,6,true);
		board[7][7] = new Rook(7,7, true);
		
		board[6][0] = new Pawn(6,0,true);
		board[6][1] = new Pawn(6,1,true);
		board[6][2] = new Pawn(6,2,true);
		board[6][3] = new Pawn(6,3,true);
		board[6][4] = new Pawn(6,4,true);
		board[6][5] = new Pawn(6,5,true);
		board[6][6] = new Pawn(6,6,true);
		board[6][7] = new Pawn(6,7,true);

		
		board[0][0] = new Rook(0,0,false);
		board[0][1] = new Knight(0,1,false);
		board[0][2] = new Bishop(0,2,false);
		board[0][3] = new Queen(0,3,false);
		board[0][4] = new King(0,4,false);
		board[0][5] = new Bishop(0,5,false);
		board[0][6] = new Knight(0,6,false);
		board[0][7] = new Rook(0,7, false);
		
		board[1][0] = new Pawn(1,0,false);
		board[1][1] = new Pawn(1,1,false);
		board[1][2] = new Pawn(1,2,false);
		board[1][3] = new Pawn(1,3,false);
		board[1][4] = new Pawn(1,4,false);
		board[1][5] = new Pawn(1,5,false);
		board[1][6] = new Pawn(1,6,false);
		board[1][7] = new Pawn(1,7,false);
	}
	public Piece getOccupant(int x, int y)
	{
		return board[x][y];
	}
	public Piece executeMove(Move move)
	{
		
		Piece active = move.piece;
		Piece captured = getOccupant(active.getX() + move.delX, active.getY() + move.delY);
		board[active.getX()][active.getY()] = null;
		board[active.getX() + move.delX][active.getY() + move.delY] = active;
		System.out.println("move test");
		return captured;	
	}
}
