
public class Utility extends PurchasableTile
	{
protected boolean two;
	public Utility(String tileName, int cost,boolean purchased,int rC,boolean t)
		{
			super(tileName, cost, purchased, rC);
			two =t;
		}
	public boolean isTwo()
		{
			return two;
		}
	public void setTwo(boolean two)
		{
			this.two = two;
		}

	}
