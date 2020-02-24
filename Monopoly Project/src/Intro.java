import java.util.Scanner;

public class Intro
	{

		public static void main(String[] args)
			{
				Intro.getNames();

			}

		public static void getNames()
			{
				Scanner askTotal = new Scanner(System.in);
				System.out.println("How many people are playing only a max of 4 can play");

				int userInput = askTotal.nextInt();
				String people[] = new String[userInput];
				System.out.println("you have " + userInput + " total players");
				Scanner askPlayer = new Scanner(System.in);

				for (String n : people)
					{
						System.out.println("who are the people playing");
						String players = askPlayer.nextLine();
						// test
						for (String s : people)
							{
								System.out.println(s);
							}

					}

			}
	}
