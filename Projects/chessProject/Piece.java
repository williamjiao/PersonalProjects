package chessProject;
import java.util.ArrayList;
public abstract class Piece 
{
	private Square position;
	private String name;
	private boolean white;
	public Piece(Square position, String name, boolean white)
	{
		this.position = position;
		this.name = name;
		this.white = white;
	}
	public abstract ArrayList<Square> getValidMoves(Chessboard board);
	public int getX()
	{
		return position.getX();
	}
	public int getY()
	{
		return position.getY();
	}
	public Square getPosition()
	{
		return position;
	}
	public String getName()
	{
		return name;
	}
	public boolean getTeam()
	{
		return white;
	}

	
	
}
