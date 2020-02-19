
public  class CommunityChest extends EventTile
	{



	public CommunityChest()
		{
			super("Chance");
			// TODO Auto-generated constructor stub
		}


	@Override
	public void triggerEvent()
		{
			System.out.println("You Landed on community chest! you must draw!");
			System.out.println(Deck.print());
			
		}


	}
