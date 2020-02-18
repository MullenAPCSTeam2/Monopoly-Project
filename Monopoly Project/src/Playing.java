import java.util.ArrayList;
import java.util.Scanner;

public class Playing 
{
	public static void playing()
	{
		ArrayList<Player> playing = new ArrayList<Player>();
		playing.add(new Player (1500, "", ""));
		
		Scanner stringInput = new Scanner(System.in);
		System.out.println("\nWhat is your name?");
		String name = stringInput.nextLine();
		
		for (Player p : playing)
		{
			p.setName(name);
			System.out.println("\nHello, " + p.getName() + ".\nYou start with $" + p.getMoney() + ".\n");
		}
		
		System.out.println("\nWhat monopoly piece do you want to play as?\nIron\nTop Hat\nThimble\nBoot\nWheelbarrow\nCar\nBattleship\nDog");
		String piece = stringInput.nextLine();
		
		if(piece.equals("Iron") || piece.equals("Top Hat") || piece.equals("Thimble") || piece.equals("Boot") 
		|| piece.equals("Wheelbarrow") || piece.equals("Car") || piece.equals("Battleship") || piece.equals("Dog"))
		{
			for (Player p : playing)
			{
				p.setPiece(piece);
				System.out.println("You selected the " + p.getPiece());
			}
		}
		else
		{
			System.out.println("Not one of the monopoly pieces.");
		}
		
	}
}
