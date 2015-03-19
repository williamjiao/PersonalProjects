package chessProject;
import java.util.ArrayList;
public class Queen extends Piece
{
	public Queen(Square location, boolean white)
	{
		super(location, "q", white);
		
	}
	
	public ArrayList<Square> getValidMoves(Chessboard board)
	{
		ArrayList<Square> validMoves = new ArrayList<Square>();
		ArrayList<Square> testBishop = (new Bishop(super.getPosition(), super.getTeam())).getValidMoves(board);
		ArrayList<Square> testRook =  (new Rook(super.getPosition(), super.getTeam())).getValidMoves(board);
		for(Square move : testBishop)
		{
			validMoves.add(move);
		}
		for(Square move : testRook)
		{
			validMoves.add(move);
		}
		return validMoves;
	}
}
