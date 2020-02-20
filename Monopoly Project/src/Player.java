
public class Player 

{
	private static int money;
	private static String name;
	private static String piece;
	protected int   movementDirection;

	
	public Player(int m, String n, String p)
	{
		setMoney(m);
		setName(n);
		setPiece(p);
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


	public static String getPiece() {
		return piece;
	}

	public static void setPiece(String piece) {
		Player.piece = piece;
  }

	public void switchDirection(){
		this.movementDirection *= -1;
  }
}
