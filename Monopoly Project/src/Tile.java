
public abstract class Tile
	{
		protected  String tileName;
		
		
		public Tile(String tileName){
			this.tileName = tileName;
		}
		
		
	 
		public abstract void landOnTile();
		
		public String getName(){
			return this.tileName;
		}
		
		
	}
