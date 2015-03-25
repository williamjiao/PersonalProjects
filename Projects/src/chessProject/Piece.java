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
		System.out.println(finalX + "\t" + finalY);
		return !(finalX > 7 || finalX < 0 || finalY < 0 || finalY > 7);
	}
	public static String getName(Piece piece)
	{
		String name = "";
		if(piece.getTeam())
			name += "w";
		else
			name += "b";
		
		if(piece instanceof Bishop)
			name += "b";
		else if(piece instanceof Rook)
			name += "r";
		else if(piece instanceof Pawn)
			name += "p";
		else if(piece instanceof King)
			name += "k";
		else if(piece instanceof Queen)
			name += "q";
		else
			name += "k";
		return name;
	}
	
}
