import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
	static Scanner userInput = new Scanner(System.in);
	static int choice = 0;
	static ArrayList<Player> players = new ArrayList<Player>();
	static Player currentPlayer;
	static Scanner continuePlay = new Scanner(System.in);

	public static void main(String[] args) throws IOException

		{

	
		
		System.out.println("Welcome to Monopoly! Would you like directions?");
		System.out.println("1.Yes \n2.No");
		choice= userInput.nextInt();
		
		if (choice == 1)

		{
			Directions.howToPlay();

			SetUpPlayer.setUpPlaying();
			System.out.println();
// 			Dice.rollDice();
		
			
		}
		else
		{
			SetUpPlayer.setUpPlaying();
// 			Dice.rollDice();


		}
		
		
		
		
		//running the game
		
		//turns
		players = SetUpPlayer.getPlaying();

		currentPlayer = players.get(0);
		
		//now for each player
		boolean playing = true;
		while(playing){
			
			//display current player info
			currentPlayer.printPlayer();
			
			//roll
			int roll = Dice.rollDice();
			
			//land on tile
			currentPlayer.changePosition(roll);			
			//Board.getBoard()[currentPlayer.getPosition()].landOnTile();
			Board.loadBoard();
			Board.getTile(currentPlayer.position).getName();
			
			// checks money status, bankrupt = lose game
			currentPlayer.endCondition();

			
			
			//next turn?
			System.out.println("Press 'Enter' to roll again.");
			continuePlay.nextLine();
					
			
			
			
		
		}
		
		
		
		
		
	}
	
	public static void nextPlayer(){
		int index = players.indexOf(currentPlayer);
		index %= players.size();
		currentPlayer = players.get(index);
	}
	
		
}
