
public class Board
	{

		//array represents a 11 x 11 board (40 tiles)
		public static Tile[] board = new Tile[40];
		static boolean isLoaded = false;
		
		public static Tile[]getBoard(){
			if(!isLoaded){
			loadBoard();
			}
			
			return board;
			
		}
		
		public static void loadBoard(){
			//TODO set up the board based on the original game
			
		}
		
		
		
		
		
	}
