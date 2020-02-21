import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class Runner
	{
	static Scanner userInput = new Scanner(System.in);
	static int choice = 0;

	public static void main(String[] args) throws IOException

		{

	
		
		System.out.println("Welcome to Monopoly! Would you like directions?");
		System.out.println("1) Yes \n2) No");
		choice= userInput.nextInt();
		
		if (choice == 1)

		{
			Directions.howToPlay();
			SetUpPlayer.setUpPlaying();
			System.out.println();
			Dice.rollDice();
		
			
		}
		else
		{
			SetUpPlayer.setUpPlaying();
			Dice.rollDice();
			
		}

			
		}
		
	}
