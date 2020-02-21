
public class Player 

{
	private static int money;
	private static String name;
	private static String piece;
	public static int  movementDirection;
	public static int position;

	
	public Player(int m, String n, String p, int pos)
	{
		setMoney(m);
		setName(n);
		setPiece(p);
		setPosition(pos);
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
	public static int getPosition() {
		return position;
	}
	public static void setPosition(int position) {
		Player.position = position;
	}
	
	public static int changePosition(int roll) {
		position += roll*movementDirection;
		return position;
	}
	

	public void switchDirection(){
		this.movementDirection *= -1;
  }
}
