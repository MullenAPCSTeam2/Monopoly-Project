
public abstract class EventTile extends Tile
	{

		@Override
		public void landOnTile(){
			triggerEvent();
		}
		
		public EventTile(String tileName){
			super(tileName);
			
			
		}
		
		

		public abstract void triggerEvent();
		
		
		
		
	}
