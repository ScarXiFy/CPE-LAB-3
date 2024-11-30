/*
============================================================================
FILE : TicTacToe.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : TicTacToe.
COPYRIGHT : October 21, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe
{
	
	private JFrame frame;
	private JButton[][] buttons;
	private char currentPlayer;
	private char[][] board;
	
	public TicTacToe()
	{
		frame = new JFrame("TicTacToe");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,3));
		
		buttons = new JButton[3][3];
		board = new char[3][3];
		currentPlayer = 'X';
		displayBoard();
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				buttons[i][j] = new JButton("-");
				buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
				buttons[i][j].setFocusPainted(false);
				buttons[i][j].addActionListener(new ButtonClickListener(i, j));
				frame.add(buttons[i][j]);
			}
		}
		
		frame.setVisible(true);
	}
	
	private void displayBoard()
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				board[i][j] = '-';
			}
		}
	}
	
	private void nextTurn()
	{
		currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	}
	
	private boolean isWinner()
	{
		for (int i = 0; i < 3; i++)
		{
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer))
            {
                return true;
            }
        }
		
		if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
	            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer))
		{
	            return true;
	        }
	        return false;
	}
	
	private boolean isDraw()
	{
		for (int i = 0; i < 3; i++)
		{
            for (int j = 0; j < 3; j++)
            {
                if (board[i][j] == '-')
                {
                    return false;
                }
            }
        }
        return true;
	}
	
	private class ButtonClickListener implements ActionListener
	{
		private int row;
        private int col;

        public ButtonClickListener(int row, int col)
        {
            this.row = row;
            this.col = col;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (board[row][col] == '-')
            {
                board[row][col] = currentPlayer;
                buttons[row][col].setText(String.valueOf(currentPlayer));
                if (isWinner())
                {
                    JOptionPane.showMessageDialog(frame, "Player " + currentPlayer + " wins!");
                    displayBoard();
                    for (int i = 0; i < 3; i++)
                    {
                        for (int j = 0; j < 3; j++)
                        {
                            buttons[i][j].setText("-");
                        }
                    }
                } else if (isDraw())
                {
                    JOptionPane.showMessageDialog(frame, "It's a draw!");
                    displayBoard();
                    for (int i = 0; i < 3; i++)
                    {
                        for (int j = 0; j < 3; j++)
                        {
                            buttons[i][j].setText("-");
                        }
                    }
                } else
                {
                    nextTurn();
                }
            } else
            {
                JOptionPane.showMessageDialog(frame, "This move is not valid");
            }
        }
	}
}