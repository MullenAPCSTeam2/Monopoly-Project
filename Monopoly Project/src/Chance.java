

public class Chance extends EventTile
	{

		public Chance(){
			super("Community Chest");
		}
		
		
		//this.method : use when want class you are using to edit itself. I am editing the card array. (simple terms)
	@Override
	public void triggerEvent()
		{
		System.out.println("You Landed on Community Chest! you must draw!");
		System.out.println(Deck.print());
			
		}
	
	// in Runner 

	}

