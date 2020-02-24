import java.util.Scanner;

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
		
		//suggestion: make a public void that sysos all of the info not individual info 
	}
