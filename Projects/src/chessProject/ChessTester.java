package chessProject;

public class ChessTester 
{
	public static void main(String[] args)
	{
		Chessboard board = new Chessboard();
		board.startGame();
		GUI myGUI = new GUI(board);
		myGUI.drawBoard();
		while(true)
		{
			int[] activeLoc = {-1,-1};
			while(activeLoc[0] < 0)
			{
				activeLoc = myGUI.detectActive();
			}
			Piece activePiece = null;
			while(activePiece == null)
				activePiece = board.getOccupant(activeLoc[0], activeLoc[1]);
			System.out.println(Piece.getName(activePiece));

			int[] destinationLoc = {-1,-1};
			while(destinationLoc[0] < 0)
				destinationLoc = myGUI.detectActive();
			Move move = new Move(destinationLoc[1] - activeLoc[1], destinationLoc[0] - activeLoc[0], activePiece);

			if(activePiece != null && activePiece.validateMove(move, board))
			{
				System.out.println(Piece.getName(activePiece));
			}
		}
		
	}
}
