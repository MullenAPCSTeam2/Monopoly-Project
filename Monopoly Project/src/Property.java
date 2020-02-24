
public class Property extends PurchasableTile
	{

		protected String color;
		protected int housingCost;
		protected int amountOfHouses;
		protected int amountOfHotels;
		protected int rentCost;
		protected boolean purchased;
		
		public Property(String tileName, int cost,String color)
		{
			super(tileName, cost );
			this.color = color;
		
			//TODO finish this pojo
		}
	

		public void landOnTile(){
			if(purchased = false) {
			System.out.println("would you like to buy " + tileName + " it costs " + cost);
			}
			else {
				System.out.println("You do not own this tile someone else does you owe them rent");
			}
			
		}
		
		
		
		
		
		
		
	}
