
public class Dice 
{
	public static void rollDice() 
	{
		int die1 = (int)(Math.random()*6) + 1;
		int die2 = (int)(Math.random()*6) + 1;
		int totalDie = die1 + die2;
		int count = 0;
		
		while(die1 == die2)
		{
			if(die1 == die2)
			{
				count++;
				System.out.println("Rolling again. Both die are the same.");
				System.out.println(die1);
				System.out.println(die2);
				die1 = 0;
				die2 = 0;
				totalDie = 0;
				die1 = (int)(Math.random()*6) + 1;
				die2 = (int)(Math.random()*6) + 1;
				totalDie = die1 + die2;
				System.out.println("You roll a " + die1);
				System.out.println("You roll a " + die2);
			}
		}
			if(count == 3)
			{
				System.out.println("Go to jail.");
			}
		
			else
			{
				System.out.println("You roll a " + die1);
				System.out.println("You roll a " + die2);
				System.out.println("Your total " + totalDie);
			}	
	}		
}
