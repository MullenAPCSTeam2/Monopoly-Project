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

	public static void main(String[] args) throws IOException

		{

	
		
		System.out.println("Welcome to Monopoly! Would you like directions?");
		System.out.println("1) Yes \n2) No");
		choice= userInput.nextInt();
		
		if (choice == 1)

		{
			Directions.howToPlay();
			Playing.playing();
			System.out.println();
			Dice.rollDice();
		
			
		}
		else
		{
			Playing.playing();
			Dice.rollDice();
			
		}
		
		
		
		
		//running the game
		
		//turns
		players = Playing.getPlaying();
		currentPlayer = players.get(0);
		
		//now for each player
		boolean playing = true;
		while(playing){
			
			//display current player info
			currentPlayer.printPlayer();
			
			//roll
			int roll = Dice.rollDice();
			
			
			//jail?
			
			//land on tile
			Player.changePosition(roll);
			
			
			//next turn?
			
			
			
			
		}
		
		
		
		
		

			
		}
	
	public static void nextPlayer(){
		int index = players.indexOf(currentPlayer);
		index %= players.size();
		currentPlayer = players.get(index);
	}
	
		
	}
