package chessProject;

public class ChessTester 
{
	public static void main(String[] args)
	{
		Chessboard board = new Chessboard();
		board.startGame();
		GUI.drawBoard(board);
	}
}
