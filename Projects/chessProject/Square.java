package chessProject;

public class Square 
{
	private int posX;
	private int posY;
	private Piece occupant;
	public Square(int posX, int posY)
	{
		this.posX = posX;
		this.posY = posY;
		occupant = null;
	}
	public int getX()
	{
		return posX;
	}
	
	public int getY()
	{
		return posY;
	}
	public void setOccupant(Piece occupant)
	{
		this.occupant = occupant;
	}
	public Piece getOccupant()
	{
		return occupant;
	}
	public static boolean isValid(int posX, int posY)
	{
		if(posX < 0 || posX > 7 || posY < 0 || posY > 7)
			return false;
		return true;
	}
}
