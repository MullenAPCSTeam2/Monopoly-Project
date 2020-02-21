
public class Railroad extends PurchasableTile
	{
protected int totalOwned;
	public Railroad(String tileName, int cost,boolean purchased, int rC, int tO)
		{
			super(tileName, cost, purchased,rC);
			totalOwned=tO;
		}
	public int getTotalOwned()
		{
			return totalOwned;
		}
	public void setTotalOwned(int totalOwned)
		{
			this.totalOwned = totalOwned;
		}

	}
