package chessProject;
import java.util.ArrayList;
public class Bishop extends Piece
{
	public Bishop(Square location, boolean white)
	{
		super(location, "b", white);
	}
	
	public ArrayList<Square> getValidMoves(Chessboard board)
	{
		int posX = super.getX();
		int posY = super.getY();
		int testPosX = posX;
		int testPosY = posY;
		ArrayList<Square> validMoves = new ArrayList<Square>();
		
		if(Square.isValid(posX - 1, posY - 1))
			validMoves.add(board.getBoard()[posX - 1][posY - 1]);
		if(Square.isValid(posX - 1, posY + 1))
			validMoves.add(board.getBoard()[posX - 1][posY + 1]);
		if(Square.isValid(posX + 1, posY - 1))
			validMoves.add(board.getBoard()[posX + 1][posY - 1]);
		if(Square.isValid(posX + 1, posY + 1))
			validMoves.add(board.getBoard()[posX + 1][posY + 1]);
		
		testPosX++;
		testPosY++;
		while(board.getBoard()[testPosX][testPosY]== null && Square.isValid(testPosX + 1, testPosY + 1))
		{
			validMoves.add(board.getBoard()[testPosX + 1][testPosY + 1]);
			testPosX++;
			testPosY++;
		}
		testPosX = posX;
		testPosY = posY;
		testPosX--;
		testPosY++;
		while(board.getBoard()[testPosX][testPosY]== null && Square.isValid(testPosX - 1, testPosY + 1))
		{
			validMoves.add(board.getBoard()[testPosX - 1][testPosY + 1]);
			testPosX--;
			testPosY++;
		}
		testPosX = posX;
		testPosY = posY;
		testPosX--;
		testPosY--;
		while(board.getBoard()[testPosX][testPosY]== null && Square.isValid(testPosX - 1, testPosY - 1))
		{
			validMoves.add(board.getBoard()[testPosX - 1][testPosY - 1]);
			testPosX--;
			testPosY--;
		}
		testPosX = posX;
		testPosY = posY;
		testPosX++;
		testPosY--;
		while(board.getBoard()[testPosX][testPosY]== null && Square.isValid(testPosX + 1, testPosY - 1))
		{
			validMoves.add(board.getBoard()[testPosX + 1][testPosY - 1]);
			testPosX++;
			testPosY--;
		}
		
		return validMoves;
	}
}
