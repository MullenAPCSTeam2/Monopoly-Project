
public class FreeParking extends EventTile
	{

		public FreeParking(){
			super("FreeParking");
		}
		
		
<<<<<<< HEAD
	//@Override
	public void triggerEvent(Player player1)
		{
			//TODO player.switchDirection();
		
		
			player1.switchDirection();
			
		}
=======
//	//@Override
//	public void triggerEvent(Player player1)
//		{
//			//TODO player.switchDirection();
//		
//		
//			player1.switchDirection();
//			
//		}

// this is the appendix:
	@Override
	public void triggerEvent() {
		Runner.currentPlayer.switchDirection();
		
	}
>>>>>>> upstream/master

// this is the appendix:
	@Override
	public void triggerEvent() {
		// TODO Auto-generated method stub
		
	}

	}
