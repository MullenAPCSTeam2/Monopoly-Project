
public class FreeParking extends EventTile
	{

		public FreeParking(){
			super("FreeParking");
		}
		
		
	//@Override
	public void triggerEvent(Player player1)
		{
			//TODO player.switchDirection();
		
		
			player1.switchDirection();
			
		}

// this is the appendix:
	@Override
	public void triggerEvent() {
		// TODO Auto-generated method stub
		
	}

	}
