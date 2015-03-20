package chessProject;

public class Move 
{
	public int delX;
	public int delY;
	public Piece piece;
	public Move(int delX, int delY, Piece piece)
	{
		this.delX = delX;
		this.delY = delY;
		this.piece = piece;
	}
	
	
}
