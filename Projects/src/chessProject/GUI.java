package chessProject;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GUI implements ActionListener
{
	private JButton[][] guiBoard;
	private int activeRow;
	private int activeCol;
	private Chessboard board;
	boolean canReturn;
	public GUI(Chessboard board)
	{
		guiBoard = new JButton[8][8];
		activeRow = -1;
		activeCol = -1;
		this.board = board; 
	}
	public  void drawBoard()
	{
		JFrame jf = new JFrame("Chessboard Test");
		jf.setLayout(new GridLayout(8,8));
		jf.setSize(600,600);		
		for(int i = 0 ; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				
				guiBoard[i][j] = new JButton();
				if(board.getOccupant(i,j) != null)
					guiBoard[i][j].setText(Piece.getName(board.getOccupant(i,j)));
				guiBoard[i][j].addActionListener(this);
				jf.add(guiBoard[i][j]);

			}
		}
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jf.setVisible(true);
	}
	public int[] detectActive()
	{
		if(canReturn)
		{
			int[] returnArray = new int[2];
			returnArray[0] = activeRow;
			returnArray[1] = activeCol;
			activeRow = -1;
			activeCol = -1;
			System.out.println(activeCol);

		}
		
		return returnArray;
	}
	public void actionPerformed(ActionEvent e)
	{
		for(int row = 0; row < guiBoard.length; row++)
			for(int col = 0; col < guiBoard[0].length; col++)
				if(guiBoard[row][col] == e.getSource())
				{
					activeRow = row;
					activeCol = col;
					canReturn = true;
				}
		System.out.println("Action test");
	}
	
}
