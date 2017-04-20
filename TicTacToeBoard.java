/** This class is designed to test that the methods in TicTacToe.java
* It has a board that will be updated until there is a winner and a method
* to draw the board.
*
*
* @author Eric Ehmann
* @Version Last Modified 12_17_15
*
**/
class TicTacToeBoard
	{
	
		public static void main (String[]arg)
		{
		String one= "one";
		String two= "two";
		String oneMark= "X";
		String twoMark= "O";
		String board[][] = new String [][]{
				{"|", " ", " ", " ", "|"}, 
				{"|", " ", " ", " ", "|"},
				{"|", " ", " ", " ", "|"}
				};
		boolean oneWin=false;
		boolean twoWin=false;
		int count=0;
			System.out.println("Welcome! Tic Tac Toe is a two player game.");
			TicTacToe game= new TicTacToe();
			one= game.name(one);
			two= game.name(two);
			System.out.print("Players take turns marking a square.  Only squares \n" +
			"not already marked can be picked.  Once a player has \n "+
			"marked three squares in a row, he or she wins!" +
			"If all squares are marked and no three squares are the same, a tied is declared");
			System.out.println();
			do
			{
				board=game.turn(board, one, oneMark);
				toString(board);
				oneWin=game.checkWin(board, oneMark);
				if(oneWin)
					{
						System.out.println ("Game Over! " + one + " WINS!");
						break;
					}
				count++;
					if(count==5)
						{
							System.out.println("Game over! It's a tie!");
							break;
						}
				board=game.turn(board, two, twoMark);
				toString(board);
				twoWin=game.checkWin(board, twoMark);
				
			}
			while (!twoWin);
			 if (twoWin)
				{
					System.out.println ( "Game Over! " + two + " WINS!");  
				}
			
		}
/**
* This method will take a 2D String array and print each string in the array, followed by a space
*
* @param String[][] board, The array that will printed, originally designed for a Tic Tac Toe game
*/

			public static void toString(String [][] board)
		{
			for(int row=0; row<board.length; row++)
			{
					for( int col=0; col<board[row].length; col++)
				{
			System.out.print(board[row][col]+ " ");
				}
			System.out.println();
			}		
		}		
	}
				