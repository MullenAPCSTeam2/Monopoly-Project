
public class Player 

{
<<<<<<< HEAD
	private static int money;
	private static String name;
	private static String piece;
	protected int   movementDirection;
	public static int position;
=======
	protected int money;
	protected String name;
	protected String piece;
	protected int  movementDirection;
	protected int position;
>>>>>>> upstream/master

	
	public Player(int m, String n, String p, int pos)
	{
		setMoney(m);
		setName(n);
		setPiece(p);
		setPosition(pos);
		this.movementDirection = 1;

	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void addMoney(int money){
		this.money+=money;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPiece() {
		return this.piece;
	}

	public void setPiece(String piece) {
		this.piece = piece;
  }
<<<<<<< HEAD
	public static int getPosition() {
		return position;
	}
	public static void setPosition(int position) {
		Player.position = position;
	}
	
	public static int changePosition(int roll) {
		position += roll;
=======
	public int getPosition() {
		return this.position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	public int changePosition(int roll) {
		position += roll*movementDirection;
		if(position >= 40){
		position %= 40;
			Runner.currentPlayer.addMoney(200);
			System.out.println("You pass GO, collect $200.");
		}else if(position < 0){
			position+=40;
			Runner.currentPlayer.addMoney(200);
			System.out.println("You pass GO, collect $200.");
		}
>>>>>>> upstream/master
		return position;
	}
	

	public void switchDirection(){
		this.movementDirection *= -1;
  }

	public void printPlayer(){
		System.out.println("-=-=-=-=-");
		System.out.println(this.name + ":" + this.piece);
		System.out.println("$"+this.money);
		
	}
	

}
