
public class Dice 
{
	public static int rollDice() 
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
				System.out.println("You roll " +die1+ " and " +die2+ ". Rolling again because both die are the same.");
				die1 = 0;
				die2 = 0;
				totalDie = 0;
				die1 = (int)(Math.random()*6) + 1;
				die2 = (int)(Math.random()*6) + 1;
				totalDie = die1 + die2;
			}
		}
			if(count == 3)
			{
				System.out.println("You rolled a duplicate three times, go to jail.");
			}
		
			else
			{
				System.out.println("You roll a " + die1 + " and " + die2 +".\nMove " + totalDie + " spaces.");
				
			}	
			
			return totalDie;
	}		
}
