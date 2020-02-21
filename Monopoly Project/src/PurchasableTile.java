
public abstract class PurchasableTile extends Tile
	{

	


		protected boolean purchased;
		protected int rentCost;
		protected int cost;
		public PurchasableTile(String tileName, int c,boolean p, int r) {
			super(tileName);
		purchased=p;
		c=cost;
		rentCost=r;
		}
		
		

		public boolean isPurchased()
			{
				return purchased;
			}



		public void setPurchased(boolean purchased)
			{
				this.purchased = purchased;
			}



		public int getRentCost()
			{
				return rentCost;
			}



		public void setRentCost(int rentCost)
			{
				this.rentCost = rentCost;
			}



		public int getCost()
			{
				return cost;
			}



		public void setCost(int cost)
			{
				this.cost = cost;
			}



		@Override
		public void landOnTile(){
			if(purchased = false) {
			System.out.println("would you like to buy " + tileName + " it costs " + cost);
			}
			else {
				System.out.println("You do not own this tile someone else does you owe them rent");
			}
			
		}
		
		
		
	}
