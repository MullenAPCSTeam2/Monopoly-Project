import java.util.ArrayList;

public class Property extends PurchasableTile
	{

	
		protected String color;
		protected int housingCost;
		protected int amountOfHouses;
		protected int amountOfHotels;
		protected int rCost;
		protected boolean hotels;
		protected int housesBought;
		protected int houseCost;
		protected boolean canHouse;
		protected ArrayList<Integer> houseAndHotel;
		public Property(String tileName, int co,boolean p,int r,String c,int hb,boolean h, boolean cH,int hC,ArrayList<Integer>hAH)
		{
			super(tileName, co,p,r );
			housesBought=hb;
			hotels=h;
			c = color;
			canHouse=cH;
			houseCost=hC;
			houseAndHotel=hAH;
			//TODO finish this pojo
		}
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
		public int getHousingCost()
			{
				return housingCost;
			}
		public void setHousingCost(int housingCost)
			{
				this.housingCost = housingCost;
			}
		public int getAmountOfHouses()
			{
				return amountOfHouses;
			}
		public void setAmountOfHouses(int amountOfHouses)
			{
				this.amountOfHouses = amountOfHouses;
			}
		public int getAmountOfHotels()
			{
				return amountOfHotels;
			}
		public void setAmountOfHotels(int amountOfHotels)
			{
				this.amountOfHotels = amountOfHotels;
			}
		public int getrCost()
			{
				return rCost;
			}
		public void setrCost(int rCost)
			{
				this.rCost = rCost;
			}
		public boolean isHotels()
			{
				return hotels;
			}
		public void setHotels(boolean hotels)
			{
				this.hotels = hotels;
			}
		public int getHousesBought()
			{
				return housesBought;
			}
		public void setHousesBought(int housesBought)
			{
				this.housesBought = housesBought;
			}
		public int getHouseCost()
			{
				return houseCost;
			}
		public void setHouseCost(int houseCost)
			{
				this.houseCost = houseCost;
			}
		public boolean isCanHouse()
			{
				return canHouse;
			}
		public void setCanHouse(boolean canHouse)
			{
				this.canHouse = canHouse;
			}
		public ArrayList<Integer> getHouseAndHotel()
			{
				return houseAndHotel;
			}
		public void setHouseAndHotel(ArrayList<Integer> houseAndHotel)
			{
				this.houseAndHotel = houseAndHotel;
			}
		
		
		
		
		
		
		
	}
