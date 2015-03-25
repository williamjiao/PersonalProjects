package chessProject;

public class Pawn extends Piece 
{
	public Pawn(int x, int y, boolean white)
	{
		super(x, y, white);
	}
	public boolean validateMove(Move move, Chessboard board)
	{
		if(super.moveInBounds(move))
		{
			int teamFactor;
			if(super.getTeam())
				teamFactor = 1;
			else
				teamFactor = -1;

			if(move.delX == 0 && move.delY == teamFactor)
				return board.getOccupant(super.getX(),  super.getY() + teamFactor) == null;
			else if(move.delX == 1 && move.delY == teamFactor)
				return board.getOccupant(super.getX() + 1,  super.getY() + teamFactor) != null;
			else if(move.delX == -1 && move.delY == 1)
				return board.getOccupant(super.getX() - 1,  super.getY() + 1) != null;
				
		}
		System.out.println("True");
		return false;
	}
}
