
public class Jail extends EventTile
	{

		public Jail()
			{
				super("Jail");
				// TODO Auto-generated constructor stub
			}

		@Override
		public void triggerEvent()
			{
				System.out.println("You have skipped your turn");
				Runner.currentPlayer.setPosition(30);

			}

	}
