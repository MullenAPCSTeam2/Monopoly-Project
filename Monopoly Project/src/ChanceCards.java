

public class ChanceCards extends EventTile
	{

		public ChanceCards(){
			super("Chance Cards");
		}
		
		
		//this.method : use when want class you are using to edit itself. I am editing the card array. (simple terms)
	@Override
	public void triggerEvent()
		{
		System.out.println("You Landed on Chance! you must draw!");
	//	System.out.println(Deck.print());
			
		}
	
	// in Runner 

	}

