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
			int[] activeLoc = myGUI.detectActive();
			int[] destinationLoc = myGUI.detectActive();
			Piece activePiece = board.getOccupant(activeLoc[0], activeLoc[1]);
			Move move = new Move(destinationLoc[1] - activeLoc[1], destinationLoc[0] - activeLoc[0], activePiece);
			if(activePiece.validateMove(move, board))
				board.executeMove(move);
		}
		
	}
}
