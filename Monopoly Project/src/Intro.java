import java.util.Scanner;

public class Intro
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub

			}
public static void getNames() {
	Scanner askTotal = new Scanner(System.in);
	System.out.println("How many people are playing only a max of 4 can play");
	
	int userInput = askTotal.nextInt();
	int people[] = new int[userInput];
	System.out.println("you have " + userInput + " total players");
	Scanner askPlayer = new Scanner(System.in);

	
	for(int i =0; i<people.length;i++) {
		System.out.println("what are the player's names");
		
		people[i] =askTotal.nextInt();
	}
}
	}
