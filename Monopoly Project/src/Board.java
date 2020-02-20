

import java.util.concurrent.PriorityBlockingQueue;





import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;

import java.util.Scanner;

public class Board
	{
		
		static ArrayList<String> tileNames = new ArrayList<String>();

		//array represents a 11 x 11 board (40 tiles)
		public static Tile[] board = new Tile[40];
		static boolean isLoaded = false;
		
		public static Tile[] getBoard(){
			if(!isLoaded){
				loadBoard();
			}
			
			return board;
			
		}
		
		public static void loadBoard(){
      isLoaded = true;
			//TODO set up the board based on the original game
			
			
			//set upm reader
			
			try
				{
					FileReader UBreader = new FileReader(new File("TileSettings.txt"));
					BufferedReader reader= new BufferedReader(UBreader);
					
					
					for(int i = 0; i < 40; i ++){
						String[] line = reader.readLine().split(", ");
						System.out.println(i + ": " + line[0]);
						switch(line[0]){
							
							case "Property":
								board[i] = new Property(line[1], Integer.parseInt(line[2]), line[3]);
								break;
								
							case "GO":
								board[i] = new GO();
								break;
								
							case "Chance":
								board[i] = new ChanceCards();
								break;
								
							case "Tax":
								board[i] = new Tax(line[1]);
								break;
								
							case "Railroad":
								board[i] = new Railroad(line[1],  Integer.parseInt(line[2]));
								break;
								
							case "Chance (again)":
								board[i] = new ChanceCards();
								break;
								
							case "Jail":
								board[i] = new Jail();
								break;
								
							case "Utility":
								board[i] = new Utility(line[1], Integer.parseInt(line[2]));
								break;
								
							case "FreeParking":
								 board[i] = new FreeParking();
								 break;
								 
							case "GoToJail":
								board[i] = new GoToJail();
								break;
								
							default:
								System.out.println("Something went terribly wrong while loading the board...");
								
							
						}
						tileNames.add(board[i].getName());
						
						
					}
					
					
				} catch (FileNotFoundException e)
				{
					loadClassicGame();
				} catch (IOException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			
			

			
					
			}
		
		public static void loadClassicGame(){
			board[0] = new GO();
			board[1] = new Property("Mediterranian Avenue", 60, "Purple");
			board[2] = new ChanceCards();
			board[3] = new Property("Baltic Avenue", 60, "Purple");
			board[4] = new Tax("Income Tax");
			board[5] = new Railroad("Reading Railroad", 60);
			board[6] = new Property("Oriental Avenue", 100, "Light Blue");
			board[7] = new ChanceCards();
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
			board[22] = new ChanceCards();
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
			board[36] = new ChanceCards();
			board[37] = new Property("Park Place", 350, "Blue");
			board[38] = new Tax("Luxary Tax");
			board[39] = new Property("Boardwalk", 400, "Blue");

			
		
			
		
			
					
			

		}

			
			
			
			
		
		
		
		
		
		
	}

