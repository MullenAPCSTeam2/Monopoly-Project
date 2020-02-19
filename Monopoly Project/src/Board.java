<<<<<<< HEAD
import java.util.concurrent.PriorityBlockingQueue;

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
			
			
			board[0] = new GO();
			board[1] = new Property("Mediterranian Avenue", 60, "Purple");

			//TODO community chest
			board[3] = new Property("Baltic Avenue", 60, "Purple");

			board[2] = new CommunityChest();
			board[2] = new Chance();

			board[3] = new Property("Baltic Avenue", 60, "Purple");
			board[4] = new Tax("Income Tax");

			board[5] = new Railroad("Reading Railroad", 60);
			board[6] = new Property("Oriental Avenue", 100, "Light Blue");
			board[7] = new Chance();
			board[8] = new Property("Vermont Avenue", 100, "Light Blue");
			board[9] = new Property("Connecticut Avenue", 120, "Light Blue");
			board[10] = new Jail();
			board[11] = new Property("St. Charles Place", 140, "Pink");
			board[12] = new Utility("Electric Company", 150);
			board[13] = new Property("States Avenue", 140, "Pink");
			board[14] = new Property("Virginia Avenue", 160, "Pink");
			board[15] = new Railroad("Pennsylvania Railroad", 200);
			board[16] = new Property("St. James Place", 180, "Orange");

			//TODO community chest
			board[18] = new Property("Tennessee Avenue", 180, "Orange");
			board[19] = new Property("New York Avenue", 200, "Orange");
			// TODO free parking

			board[17] = new CommunityChest();
			board[17] = new Chance();
			board[18] = new Property("Tennessee Avenue", 180, "Orange");
			board[19] = new Property("New York Avenue", 200, "Orange");
			board[20] = new FreeParking();

			board[21] = new Property("Kentucky Avenue", 220, "Red");
			board[22] = new Chance();
			board[23] = new Property("Indiana Avenue", 220, "Red");
			board[24] = new Property("Illinois Avenue", 240, "Red");
			board[25] = new Railroad("B & O Railroad", 200);
			board[26] = new Property("Atlantic Avenue", 260, "Yellow");
			board[27] = new Property("Ventnor Aventue", 260, "Yellow");
			board[28] = new Utility("Water Works", 150);
			board[29] = new Property("Marvin Gardens", 280, "Yellow");

			//TODO go to jail
			board[31] = new Property("Pacific Avenue", 300, "Green");
			board[32] = new Property("North Carolina Avenue", 300, "Green");
			//TODO community chest

			board[30] = new GoToJail();
			board[31] = new Property("Pacific Avenue", 300, "Green");
			board[32] = new Property("North Carolina Avenue", 300, "Green");

			board[33] = new CommunityChest();

			board[33] = new Chance();

			board[34] = new Property("Penneylvania Avenue", 320, "Green");
			board[35] = new Railroad("Short Line", 200);
			board[36] = new Chance();
			board[37] = new Property("Park Place", 350, "Blue");

			board[38] = new Tax("Luxary Tax");

			board[39] = new Property("Boardwalk", 400, "Blue");
			
					
			}
			
			
			
			
		
		
		
		
		
		
	}
=======
import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;

public class Board
	{
		
		static ArrayList<String> tileNames = new ArrayList<String>();

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
			
			
			board[0] = new GO();
			board[1] = new Property("Mediterranian Avenue", 60, "Purple");
			board[2] = new ChanceCards();
			board[3] = new Property("Baltic Avenue", 60, "Purple");
			board[4] = new Tax("Income Tax");
			board[5] = new Railroad("Reading Railroad", 60);
			board[6] = new Property("Oriental Avenue", 100, "Light Blue");
			board[7] = new Chance();
			board[8] = new Property("Vermont Avenue", 100, "Light Blue");
			board[9] = new Property("Connecticut Avenue", 120, "Light Blue");
			board[10] = new Jail();
			board[11] = new Property("St. Charles Place", 140, "Pink");
			board[12] = new Utility("Electric Company", 150);
			board[13] = new Property("States Avenue", 140, "Pink");
			board[14] = new Property("Virginia Avenue", 160, "Pink");
			board[15] = new Railroad("Pennsylvania Railroad", 200);
			board[16] = new Property("St. James Place", 180, "Orange");
			board[17] = new ChanceCards();
			board[18] = new Property("Tennessee Avenue", 180, "Orange");
			board[19] = new Property("New York Avenue", 200, "Orange");
			board[20] = new FreeParking();
			board[21] = new Property("Kentucky Avenue", 220, "Red");
			board[22] = new Chance();
			board[23] = new Property("Indiana Avenue", 220, "Red");
			board[24] = new Property("Illinois Avenue", 240, "Red");
			board[25] = new Railroad("B & O Railroad", 200);
			board[26] = new Property("Atlantic Avenue", 260, "Yellow");
			board[27] = new Property("Ventnor Aventue", 260, "Yellow");
			board[28] = new Utility("Water Works", 150);
			board[29] = new Property("Marvin Gardens", 280, "Yellow");
			board[30] = new GoToJail();
			board[31] = new Property("Pacific Avenue", 300, "Green");
			board[32] = new Property("North Carolina Avenue", 300, "Green");
			board[33] = new ChanceCards();
			board[34] = new Property("Penneylvania Avenue", 320, "Green");
			board[35] = new Railroad("Short Line", 200);
			board[36] = new Chance();
			board[37] = new Property("Park Place", 350, "Blue");
			board[38] = new Tax("Luxary Tax");
			board[39] = new Property("Boardwalk", 400, "Blue");
			
					
			}
			
			
			
			
		
		
		
		
		
		
	}
>>>>>>> upstream/master
