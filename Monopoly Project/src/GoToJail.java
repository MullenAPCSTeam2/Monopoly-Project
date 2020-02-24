
public class GoToJail extends EventTile
	{

		public GoToJail(){
			super("Go To Jail");
		}
		
	@Override
	public void triggerEvent()
		{
			System.out.println("You've gone to jail!");
			int jailPos = Board.tileNames.indexOf("Jail");
			Runner.currentPlayer.setPosition(30);
			
		}

	}
