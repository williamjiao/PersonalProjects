package chessProject;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GUI implements ActionListener
{
	private JButton[][] guiBoard;
	private Piece activePiece;
	private Chessboard board;
	private JFrame frame;
	public GUI(Chessboard board)
	{
		guiBoard = new JButton[8][8];
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
				
				guiBoard[i][j] = new JButton();
				if(board.getOccupant(i,j) != null)
					guiBoard[i][j].setText(Piece.getName(board.getOccupant(i,j)));
				guiBoard[i][j].addActionListener(this);
				frame.add(guiBoard[i][j]);

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
					guiBoard[i][j].setText(Piece.getName(board.getOccupant(i,j)));

			}
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Piece sourcePiece = null;
		for(int row = 0; row < guiBoard.length; row++)
			for(int col = 0; col < guiBoard[0].length; col++)
				if(guiBoard[row][col] == e.getSource())
				{
					sourcePiece = board.getOccupant(row,  col);
					break;
				}
		if(activePiece == null)
		{
			activePiece = sourcePiece;
			System.out.println(activePiece);
		}
			
	}
	
	public int[] detectActive()
	{
		
		if(activePiece != null)
		{
			System.out.println("Test2");
			int[] returnArray = new int[]{activePiece.getX(), activePiece.getY()};
			activePiece = null;
			return returnArray;
		}
		return new int[]{-1,-1};
	
	}
	
}
