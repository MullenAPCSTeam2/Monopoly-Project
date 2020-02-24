import java.util.ArrayList;
import java.util.Scanner;

public class SetUpPlayer 
{

	static ArrayList<Player> playing = new ArrayList<Player>();

	
	public static void setUpPlaying()
	{

		playing.add(new Player (1500, "", "", 0));
		
		Scanner intInput = new Scanner(System.in);
		System.out.println("What monopoly theme do you want to play?\n1.Classic Monopoly\n2.Star Wars Monopoly");
		int monopolyTheme = intInput.nextInt();
		
		for (Player p : playing)
		{
		Scanner stringInput = new Scanner(System.in);
		System.out.println("\nWhat is your name?");
		String name = stringInput.nextLine();
		
		
			p.setName(name);
			System.out.println("\nHello, " + p.getName() + ".\nYou start with $" + p.getMoney() + ".\n");
		
		
		
		
		if(monopolyTheme == 1)
		{
			System.out.println("\nWhat monopoly piece do you want to play as?\n1.Iron\n2.Top Hat\n3.Thimble\n4.Boot\n5.Wheelbarrow\n6.Car\n7.Battleship\n8.Dog");
			int classicPiece = intInput.nextInt();
		
			
			
				if(classicPiece == 1)
				{
					p.setPiece("Iron");
					System.out.println("You selected the " + p.getPiece() + ".");	
				}
		
				else if(classicPiece == 2)
				{
					p.setPiece("Top Hat");
					System.out.println("You selected the " + p.getPiece() + ".");
				}
		
				else if(classicPiece == 3)
				{
					p.setPiece("Thimble");
					System.out.println("You selected the " + p.getPiece() + ".");
				}
		
				else if(classicPiece == 4)
				{
					p.setPiece("Boot");
					System.out.println("You selected the " + p.getPiece() + ".");
				}
		
				else if(classicPiece == 5)
				{
					p.setPiece("Wheelbarrow");
					System.out.println("You selected the " + p.getPiece() + ".");
				}
		
				else if(classicPiece == 6)
				{
					p.setPiece("Car");
					System.out.println("You selected the " + p.getPiece() + ".");
				}
		
				else if(classicPiece == 7)
				{
					p.setPiece("Battleship");
					System.out.println("You selected the " + p.getPiece() + ".");
				}
		
				else if(classicPiece == 8)
				{
					p.setPiece("Dog");
					System.out.println("You selected the " + p.getPiece() + ".");
				}
			}

		else if(monopolyTheme == 2)
		{
			System.out.println("\nWho do you want to play as?\n1.Luke Skywalker\n2.Darth Vader\n3.Obi Wan Kenobi\n4.Kylo Ren\n5.Yoda\n6.Palpatine\n7.Chewbacca\n8.R2-D2");
			int starWarsPiece = intInput.nextInt();
		
				if(starWarsPiece == 1)
				{
					p.setPiece("Luke Skywalker");
					System.out.println("You selected " + p.getPiece() + ".");	
				}
		
				else if(starWarsPiece == 2)
				{
					p.setPiece("Darth Vader");
					System.out.println("You selected " + p.getPiece() + ".");
				}
		
				else if(starWarsPiece == 3)
				{
					p.setPiece("Obi Wan Kenobi");
					System.out.println("You selected " + p.getPiece() + ".");
				}
		
				else if(starWarsPiece == 4)
				{
					p.setPiece("Kylo Ren");
					System.out.println("You selected " + p.getPiece() + ".");
				}
		
				else if(starWarsPiece == 5)
				{
					p.setPiece("Yoda");
					System.out.println("You selected " + p.getPiece() + ".");
				}
		
				else if(starWarsPiece == 6)
				{
					p.setPiece("Palpatine");
					System.out.println("You selected " + p.getPiece() + ".");
				}
		
				else if(starWarsPiece == 7)
				{
					p.setPiece("Chewbacca");
					System.out.println("You selected " + p.getPiece() + ".");
				}
		
				else if(starWarsPiece == 8)
				{
					p.setPiece("R2-D2");
					System.out.println("You selected " + p.getPiece() + ".");
				}
			}
		}
	}

	
	public static ArrayList<Player> getPlaying()
		{
			return playing;
		}



}


