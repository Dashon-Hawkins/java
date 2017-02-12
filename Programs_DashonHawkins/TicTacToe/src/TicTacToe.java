import java.util.*;
public class TicTacToe
{
	// Use a 3X3 (two-dimensional) array for the game board.
	
	private static char[][] board = new char[3][3];
	private static char turn;
	private static int row;		// Loop controls to
	private static int col;		// display the board
	private static int turnrow; // User input to
	private static int turnCol; // Select move
	private static boolean entryError;
	private static boolean anothergame = true;
	private static char repeat; // User input: y or Y to repeat;
	private static int entryCount = 0;	// Game ends when board is full
	//(when entryCount = 9);
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
			
				while(anotherGame)
			{
				newGame();
				
				while(!winner());
				{
					writeboard();
					getmove();
				
				}
				System.out.println("Another game? Enter Y or y for yes.");
				repeat = keyboard.next().charAt(0);
									if(repeat == 'y' || repeat == 'Y')
										anotherGame = true:
									else
										anotherGame = false;
									
			}
	}
	
}

	private static void writeBoard();
	{
System.out.println("--------------------");
	System.out.println("|R\\C| 1 | 2 | 3 |");
System.out.println("--------------------");
		for(row = 0; row < 3; ++row)
		{
			System.out.println(" | " + (row + 1);
							+ " | " board[row][0]
							+ " | " board[row][1]
							+ " | " board[row][2]

		}
	}
	
	private static void getMove()
	{
		entryError = true;	//will change to false if valid row
							//and columnnumbers are entered.
		Scanner keyboard = new
Scanner(System.in);
		
		while(entryError)
		{
			System.out.println();
			System.out.println(turn + "'s turn.");
			System.out.println("Please enter row number and column number."
										+ "seperated by a space.");
			System.out.println();
			
			turnRow = keyboard.nextInt();
			turnCol = keyboard.nextInt();
			System.out.println("You have entered row #" + turnRow);
			
			
		}
	
	
	private char currentPlayerMark;
	public TicTacToe() 
	{
		board = new char[3][3];
		currentPlayerMark = 'x';
		this.initializeBoard("");
    }

//* Set/Reset the board back to all empty values.
	
	public void initializeBoard() 
	{
		//Create game and initialize it.
		//First player will be 'x'
			
			TicTacToe game = new TicTacToe();

		//Player 'x' places a mark in the top right corner row 0, column 2
		//These values are based on a zero index array, so you may need to simply take in a row 1 and subtract 1 from it if you want that.
			
			game.placeMark(0,2);

		//Lets print the board

			game.printBoard();

		//Did we have a winner?
			
			if (game.checkForWin()) 
			{
				System.out.println("We have a winner! Congrats!");
				System.exit(0);
			}
			else if (game.isBoardFull()) 
			{
				System.out.println("Appears we have a draw!");
				System.exit(0);
			}
			
		//No winner or draw, switch players to 'o'
			
			game.changePlayer();

		//Repeat steps again for placing mark and checking game status...
//* Loop through rows

		for (int i = 0; i < 3; i++) 
	{

// Loop through columns

	for (int j = 0; j < 3; j++) 
	{
		
	board[i][j] = '-';

}
	}
		
		}

// Print the current board (may be replaced by GUI implementation later)

	public void printBoard() {

		System.out.println("-------------");
	
	for (int i = 0; i < 3; i++) 
	{
		System.out.print("| ");
	
		for (int j = 0; j < 3; j++) {
		System.out.print(board[i][j] + " | ");
	
	}
		System.out.println();
		System.out.println("-------------");
       }
    }


    }


		{

	

	}
