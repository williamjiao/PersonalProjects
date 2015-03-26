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
	private JFrame frame;
	public GUI(Chessboard board)
	{
		guiBoard = new JButton[8][8];
		activeRow = -1;
		activeCol = -1;
		this.board = board; 
		frame = new JFrame("Chessboard Test");
	}
	public  void drawBoard()
	{
		frame.setLayout(new GridLayout(8,8));
		frame.setSize(600,600);		
		for(int i = 0 ; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				
				guiBoard[7-i][j] = new JButton();
				if(board.getOccupant(i,j) != null)
					guiBoard[7-i][j].setText(Piece.getName(board.getOccupant(i,j)));
				guiBoard[7-i][j].addActionListener(this);
				frame.add(guiBoard[7-i][j]);

			}
		}
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
	public void updateBoard()
	{
		for(int i = 0 ; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				
				if(board.getOccupant(i,j) != null)
					guiBoard[7-i][j].setText(Piece.getName(board.getOccupant(i,j)));

			}
		}
	}
	public int[] detectActive()
	{
		int[] returnArray = new int[2];
		while(activeRow < 0 || activeCol < 0)
		{
			

		}
		returnArray[0] = activeRow;
		returnArray[1] = activeCol;

		activeRow = -1;
		activeCol = -1;
		
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
				}
	}
	
}
