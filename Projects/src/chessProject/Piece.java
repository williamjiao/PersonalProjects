package chessProject;

public abstract class Piece 
{
	private int x;
	private int y;
	private boolean white;
	public Piece(int x, int y, boolean white)
	{
		this.x = x;
		this.y = y;
		this.white = white;
	}
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public boolean getTeam()
	{
		return white;
	}
	public abstract boolean validateMove(Move move, Chessboard board);
	public boolean moveInBounds(Move move)
	{
		int finalX = x + move.delX;
		int finalY = y + move.delY; 
		return !(finalX > 7 || finalX < 0 || finalY < 0 || finalY > 7);
	}
	
}
