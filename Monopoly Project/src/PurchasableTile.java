
public abstract class PurchasableTile extends Tile
	{

		public PurchasableTile(String tileName)
		{
			super(tileName);
			// TODO Auto-generated constructor stub
		}


		protected boolean purchased;
		protected Player owner;
		protected int cost;
		public PurchasableTile(String tileName, int cost) {
			super(tileName);
		this.purchased=false;
		this.cost=cost;
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
