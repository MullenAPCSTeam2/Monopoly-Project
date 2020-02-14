import javax.smartcardio.Card;

public class Deck
	{
		  private Card[] cards= new Card[20];// my card array
		    private int index = 0;
		    private boolean chanceDeck;
		    private int total;
	public Deck(boolean chanceDeck)
		{
			if(chanceDeck==false) {
				if (chanceDeck == false){ // this is the presets of the community chest deck
				    this.cards[0]= new PayCard("bank error in your favor - collect $200", 200);
				    this.cards[1]= new PayCard("Doctor's fee - pay $50", -50);
				    this.cards[2]= new PayCard("Income Tax Refund - collect $20",20);
				    this.cards[3]= new PayCard("Life Insurance matures - collect $100", 100);
				    this.cards[4]= new PayCard("Pay Hospital fees - pay $100", -100);
				    this.cards[5]= new PayCard("Pay School tax - pay $150", -150);
				    this.cards[6]= new PayCard("Receive for 'Services' ;) - collect $25", 25);
				    this.cards[7]= new PayCard("You win 2nd place in a fat contest - collect $10", 10);
				    this.cards[8]= new PayCard("Your parents die, you inherit $100", 100);
				    this.cards[9]= new PayCard("From sale of stock you earn 45$", 45);
				    this.cards[10]= new PayCard("Xmas fund matures - collect 100$", 100);
				    this.cards[11] = new PayPerBuildingCard (45,115,"You are assessed for street repairs – $40 per house, $115 per hotel");
				    this.cards[12] = new PayPlayerCard(50,"Grand Opera Night - pay 50$ to each player");
				    this.cards[13] = new GetOutOfJailCard("Get out of jail free – this card may be kept until needed, or sold");
				    this.cards[14] = new GoToJailCard("Go to jail – go directly to jail – Do not pass Go, do not collect $200 ");
				    this.cards[15] = new GoToCard("Advance to Go, Collect 200$",0);
				    this.total = 16;
			}
			
		}

	}
