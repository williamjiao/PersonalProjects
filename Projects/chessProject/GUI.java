package chessProject;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI 
{
	public static void buildShit(Chessboard board) 
    {
		JFrame jf = new JFrame("Chessboard Test");
		jf.setLayout(new GridLayout(8,8));
		jf.setSize(600,600);		
		JButton[][] guiBoard = new JButton[8][8];
		for(int i = 0 ; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				
				guiBoard[i][j] = new JButton(Chessboard.getSquareName(board.getBoard()[i][j]));
				if(board.getBoard()[i][j].getOccupant() != null)
					guiBoard[i][j].setText(board.getBoard()[i][j].getOccupant().getName());

				jf.add(guiBoard[i][j]);

			}
		}

		jf.setVisible(true);
	}	
	
}
