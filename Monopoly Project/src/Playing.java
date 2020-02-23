import java.util.ArrayList;
import java.util.Scanner;

public class Playing{ 
static ArrayList<Player> playing = new ArrayList<Player>();


	public static void playing()
	{
<<<<<<< HEAD
		ArrayList<Player> playing = new ArrayList<Player>();
=======
>>>>>>> upstream/master
		playing.add(new Player (1500, "", "", 0));
		
		Scanner stringInput = new Scanner(System.in);
		System.out.println("\nWhat is your name?");
		String name = stringInput.nextLine();
		
		for (Player p : playing)
		{
			p.setName(name);
			System.out.println("\nHello, " + p.getName() + ".\nYou start with $" + p.getMoney() + ".\n");
		}
		
		Scanner intInput = new Scanner(System.in);
		System.out.println("\nWhat monopoly piece do you want to play as?\n1.Iron\n2.Top Hat\n3.Thimble\n4.Boot\n5.Wheelbarrow\n6.Car\n7.Battleship\n8.Dog");
		int piece = intInput.nextInt();
		
		if(piece == 1)
		{
			for (Player p : playing)
			{
				p.setPiece("Iron");
				System.out.println("You selected the " + p.getPiece() + ".");
			}
		}
		
		else if(piece == 2)
		{
			for (Player p : playing)
			{
				p.setPiece("Top Hat");
				System.out.println("You selected the " + p.getPiece() + ".");
			}
		}
		
		else if(piece == 3)
		{
			for (Player p : playing)
			{
				p.setPiece("Thimble");
				System.out.println("You selected the " + p.getPiece() + ".");
			}
		}
		
		else if(piece == 4)
		{
			for (Player p : playing)
			{
				p.setPiece("Boot");
				System.out.println("You selected the " + p.getPiece() + ".");
			}
		}
		
		else if(piece == 5)
		{
			for (Player p : playing)
			{
				p.setPiece("Wheelbarrow");
				System.out.println("You selected the " + p.getPiece() + ".");
			}
		}
		
		else if(piece == 6)
		{
			for (Player p : playing)
			{
				p.setPiece("Car");
				System.out.println("You selected the " + p.getPiece() + ".");
			}
		}
		
		else if(piece == 7)
		{
			for (Player p : playing)
			{
				p.setPiece("Battleship");
				System.out.println("You selected the " + p.getPiece() + ".");
			}
		}
		
		else if(piece == 8)
		{
			for (Player p : playing)
			{
				p.setPiece("Dog");
				System.out.println("You selected the " + p.getPiece() + ".");
			}
		}
	
		else
		{
			System.out.println("Not one of the monopoly pieces.");
		}
		
	}


	public static ArrayList<Player> getPlaying()
		{
			return playing;
		}


	public static void setPlaying(ArrayList<Player> playing)
		{
			Playing.playing = playing;
		}
	
	
}
