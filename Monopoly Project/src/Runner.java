import java.io.FileNotFoundException;
import java.io.IOException;

public class Runner
	{

	public static void main(String[] args) throws IOException
		{
			//Directions.howToPlay();
			//Dice.rollDice();
		//how to print board: 
		//now connect dice to number in board for printing:
			Board.loadBoard();
			System.out.println(Board.board[3].tileName);
			
			
		}
		
	}
