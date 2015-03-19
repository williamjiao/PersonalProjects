package chessProject;
import java.awt.*;
import java.awt.geom.Rectangle2D;
public class Chessboard 
{
	private Square[][] board;
	public Chessboard()
	{
		board = new Square[8][8];
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				board[i][j] = new Square(i,j);
			}
		}
	}
	
	public Square[][] getBoard()
	{
		return board;
	}
	

	public static String getSquareName(Square mySquare)
	{
		String tileName = "";
		if(mySquare.getY() == 0)
			tileName += "a";
		if(mySquare.getY() == 1)
			tileName += "b";
		if(mySquare.getY() == 2)
			tileName += "c";
		if(mySquare.getY() == 3)
			tileName += "d";
		if(mySquare.getY() == 4)
			tileName += "e";
		if(mySquare.getY() == 5)
			tileName += "f";
		if(mySquare.getY() == 6)
			tileName += "g";
		if(mySquare.getY() == 7)
			tileName += "h";

		tileName += (new Integer(8 - mySquare.getX())).toString();
		return tileName;
	}
	
	public void move(Square source, Square destination)
	{
		destination.setOccupant(source.getOccupant());
		source.setOccupant(null);

	}
	
}
