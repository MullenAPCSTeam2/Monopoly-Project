import java.util.ArrayList;


public class ChanceDeck 
{

	static ArrayList<String> chanceCards = new ArrayList<String>();
	
	public static void chanceDeck()
	{

//		tileNames.add("Advance to Go, collect $200");
//		tileNames.add("Advance to St. Charles Place- if you pass Go collect $200");
//		tileNames.add("Advance to St. Charles Place- if you pass Go collect $200");
//		tileNames.add("Advance token to the nearest Untility. If unowned, you may buy it. If owned, throw dice and pay owner a total of ten times "
//				+ "the amount thrown");
//		tileNames.add("Advance to token to the nearest Railroad and pay owner twice the rent on that property. If Railroad is unowned, you may"
//				+ "buy it" );
//		tileNames.add("You get $50");
//		tileNames.add("Get out of Jail Free");
//		tileNames.add("Go back 2 spaces");
//		tileNames.add("Go to Jail. If you pass Go do not collect $200");
//		tileNames.add("Make general repairs to all your property- for each house pay $25 and pay $100 for each hotel");
//		tileNames.add("Pay poor tax of $15");
//		tileNames.add("Take a trip to Reading Railraod. If you pass Go collect $200");
//		tileNames.add("Take a walk on the Boardwalk- advance token to Boardwalk");
//		tileNames.add("You have been elected Chairman of the Board- pay $50 to each player");
//		tileNames.add("Your building and loan matures- collect $150");
//		tileNames.add("You have won a crossword competition- collect $100");
//				
//		
			
			
		
			
			
			
			

		
		chanceCards.add("Advance to Go, collect $200");
		chanceCards.add("Advance to St. Charles Place- if you pass Go collect $200");
		chanceCards.add("Advance to St. Charles Place- if you pass Go collect $200");
		chanceCards.add("Advance token to the nearest Untility. If unowned, you may \n"
				+ "buy it. If owned, throw dice and pay owner a total of ten times \n"
				+ "the amount thrown");
		chanceCards.add("Advance to token to the nearest Railroad and pay owner twice \n"
				+ "the rent on that property. If Railroad is unowned, you may"
				+ "buy it" );
		chanceCards.add("You get $50");
		chanceCards.add("Get out of Jail Free");
		chanceCards.add("Go back 2 spaces");
		chanceCards.add("Go to Jail. If you pass Go do not collect $200");
		chanceCards.add("Make general repairs to all your property- for each house pay \n"
				+ "$25 and pay $100 for each hotel");
		chanceCards.add("Pay poor tax of $15");
		chanceCards.add("Take a trip to Reading Railraod. If you pass Go collect $200");
		chanceCards.add("Take a walk on the Boardwalk- advance token to Boardwalk");
		chanceCards.add("You have been elected Chairman of the Board- pay $50 to each player");
		chanceCards.add("Your building and loan matures- collect $150");
		chanceCards.add("You have won a crossword competition- collect $100");

		
	}
	
	public static void printCard()
	{
		chanceDeck();
		int randomDraw = (int) (Math.random()*16) +1;
		chanceCards.get(randomDraw);
		System.out.println("\""+chanceCards.get(randomDraw)+"\"");
	}
		
	

}
