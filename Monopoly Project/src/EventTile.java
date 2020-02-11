
public abstract class EventTile extends Tile
	{

		
		public void landOnTile(){
			triggerEvent();
		}
		
		
		public abstract void triggerEvent();
		
		
		
		
	}
