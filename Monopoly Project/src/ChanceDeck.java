import javax.smartcardio.Card;
public class ChanceDeck
{
	private Card[] cards = new Card[16];
	private int index = 0;
	private boolean chanceDeck;
	private int total; 
	
	public ChanceDeck(boolean chanceDeck)
	{
		if (chanceDeck == false)
		{
			if (chanceDeck == false)
			{
				this.cards[0] = GoToCard("Advance to Go, collect $200", 0);
				this.cards[1] = GoToCard("Advance to Illinois Avenue- if you pass Go collect $2", 0);
				this.cards[2] = GoToCard("Advance to St. Charles Place- if you pass Go collect $200", 0);
				this.cards[3] = 
				this.cards[4] = 
				this.cards[5] = 
				this.cards[6] = 
				this.cards[7] = 
				this.cards[8] = 
				this.cards[9] = 
				this.cards[10] = 
				this.cards[11] = 
				this.cards[12] = 
				this.cards[13] = 
				this.cards[14] = 
				this.cards[15] = 
				this.total = 16;
			}
		}
	}
	

}
