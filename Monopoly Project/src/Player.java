
public class Player 
{
	private static int money;
	private static String name;
	
	public Player(int m, String n)
	{
		setMoney(m);
		setName(n);
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
}
