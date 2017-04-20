/**TicTacToe.java
* This class is designed to produce the actions needed to play Tic Tac Toe, with
* the exception of showing the board.  It will help produce markings on the board
* and check if there is  winner to the game
*
*@author Eric Ehmann
*Version Last modified 12_17_2015
**/

import java.util.*;
public class TicTacToe

{
/**
* This method will create names for the players.  It will take the name, which is either one or two,
* and replace it with the name that the user inputs.
*
*@param String name this is the original name
*@return String name is the name of the user has given.
*/
	public String name (String name)
		{
			String newName= name;
			Scanner keyboard= new Scanner (System.in);
			System.out.println("Enter player " + newName + "'s name:");
			newName = keyboard.nextLine();
			return newName;
		}
/** 
* This method is needed for a player to take a turn.  It make sure that the player makes valid move
* one that is appropriate range and is not already played.  
* After making a valid selection, it will mark the square with the player's marker (X or )
*
* @ param String [][] board, which is the current game
* @ param String name, this is the player's name
*@ param String mark, this is the player's mark, where X or O
*@ return String [][] board, which will be the new board after being a square was marked
*/	
	public String[][] turn(String [][] board, String name, String mark)		
		{
			Scanner keyboard= new Scanner (System.in);
			System.out.println("It is " + name + "'s turn");
			int row;
			int col;
					do
						{
							System.out.println("Pick a row between 1 and 3");
							row = keyboard.nextInt()-1;
							System.out.println("Pick a column between 1 and 3");
							col= keyboard.nextInt();
							if(row<0 || row>2 || col<1 || col>3 || board[row][col]!=" ")
							{
								System.out.println("That move is invalid.  Please pick another square");
							}
						}
							while(row<0 || row>2 || col<1|| col>3 || board[row][col]!=" "); 
				board[row][col]=mark;
				return board;
		}
/**
* This method checks all possible cases for a win
* If there is a possible win, it will return true
*
*@ param String[] board, the state of the game
*@ param String mark, this is the mark of the player, who just made a move
*@ return boolean win  It will tell whether or not there is a win 
*/		
		public boolean checkWin (String[][] board, String mark)
			{
				boolean win=false;
				if(board[0][1]==mark & board [0][2]==mark & board[0][3]==mark)
					{
						win=true;
					}
				else if (board[1][1]==mark & board [1][2]==mark & board[1][3]==mark)
					{
						win=true;
					}
				else if (board[2][1]==mark & board [2][2]==mark & board[2][3]==mark)
				{
						win=true;
					}
				else if (board[0][1]==mark & board [1][1]==mark & board[2][1]==mark)
					{
						win=true;
					}
				else if (board[0][2]== mark & board [1][2]== mark 	& board[2][2]==mark)
					
				{
						win=true;
					}
				else if (board[0][3]== mark & board [1][3]== mark 	& board[2][3]==mark)
				{
						win=true;
					}
				else if (board[0][1]== mark & board [1][2]== mark 	& board[2][3]==mark)
				{
						win=true;
					}
				else if (board[0][3]== mark & board [1][2]== mark 	& board[2][1]==mark)
				{
					win=true;
				}
				else
				{
				}
				return win;
			}
			
/** 
* This method prints out the current state of the board
* @param String[][] board.  This is the game board
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
				
				
				
// method move takes in row col.  scanner for next move, returns array.
//player method transform array into separate ints.  passed to check from board 
// which returns bool.  If true passed onto board. place on board takes int,int for placement and String 
// players move