import java.util.Scanner;

public class codeTester
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				Player player1 = new Player(1500, "Tester", "Dog", 0);
				// player 2 = bankrupt
				// Player player2 = new Player(0, "Losers", "Iron", 20);

				boolean playing = true;
				while (playing == true)
					{

						Runner.currentPlayer = player1;
						Runner.currentPlayer.changePosition(Dice.rollDice());
						System.out.println(Runner.currentPlayer.getPosition());
						Board.loadClassicGame();
						System.out.println((Board.getTile(Runner.currentPlayer.position)).getName());

						System.out.println("Press 'Enter' to roll again.");
						userInput.nextLine();
					}

			}

//		System.out.println(player2.getPosition());
//		System.out.println(player2.endCondition());
//		System.out.println(player2.getPosition());

	}
