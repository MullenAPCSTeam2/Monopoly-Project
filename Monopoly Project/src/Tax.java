
public class Tax extends EventTile
	{

		public Tax(String name){
			super(name);
		}
		
		
	@Override
	public void triggerEvent()
		{
			int pay = 0;
			switch(this.getName()) {
				case "\"Income Tax\"":
					pay = 150;
				case "\"Luxury Tax\"":
					pay = 500;
				default:
					pay = 100;
			}
			System.out.println("Pay $" + pay +".");
			Runner.currentPlayer.addMoney(pay * -1);
			
			
		}

	}
