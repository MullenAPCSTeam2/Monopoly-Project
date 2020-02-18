
public class Player 
{
	private static int money;
	private static String name;
	protected int   movementDirection;
	
	public Player(int m, String n)
	{
		setMoney(m);
		setName(n);
		this.movementDirection = 1;
	}

	public static int getMoney() {
		return money;
	}

	public static void setMoney(int money) {
		Player.money = money;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Player.name = name;
	}
	
	public void switchDirection(){
		this.movementDirection *= -1;
	}
}
