import java.util.ArrayList;
import java.util.Scanner;

public abstract class PurchasableTile extends Tile
	{

		protected boolean purchased;
		protected Player owner;
		protected int cost;
		static Scanner userInput = new Scanner(System.in);
		static ArrayList<Player> players = new ArrayList<Player>();
		static Player currentPlayer;
		static int choice;

		public PurchasableTile(String tileName, int cost)
			{
				super(tileName);
				// this.purchased=false;
				this.cost = cost;
			}

		@Override
		public void landOnTile(){
			if(purchased == false) {
			System.out.println("You landed on: " + tileName);
			System.out.println("Would you like to buy " + tileName + "? It costs: $" + cost +
					"\n1.Yes 2.No");
			choice = userInput.nextInt();

			
			if (choice == 1)

			{
				
								if (Runner.currentPlayer.getMoney() >= cost)
									{
										owner = Runner.currentPlayer;
										purchased = true;
										Runner.currentPlayer.addMoney(cost * -1);
										System.out.println("You have bought: " + tileName + "\nYou now have: $"
												+ Runner.currentPlayer.getMoney());
									}
								else
									{
										System.out.println("You do not have enough money to buy " + tileName);
									}
							}

					}

			}
			
	
		
	}

		
