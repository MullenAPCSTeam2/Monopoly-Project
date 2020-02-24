
public class Player

	{

		protected int money;
		protected String name;
		protected String piece;
		protected int movementDirection;
		protected int position;

		public Player(int m, String n, String p, int pos)
			{
				setMoney(m);
				setName(n);
				setPiece(p);
				setPosition(pos);
				this.movementDirection = 1;

			}

		public int getMoney()
			{
				return this.money;
			}

		public void setMoney(int money)
			{
				this.money = money;
			}

		public void addMoney(int money)
			{
				this.money += money;
			}

		public String getName()
			{
				return this.name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getPiece()
			{
				return this.piece;
			}

		public void setPiece(String piece)
			{
				this.piece = piece;
			}

		public int getPosition()
			{
				return this.position;
			}

		public void setPosition(int position)
			{
				this.position = position;
			}

		public int changePosition(int roll)
			{
				position += roll * movementDirection;
				if (position >= 40)
					{
						position %= 40;
						Runner.currentPlayer.addMoney(200);
						System.out.println("You pass GO, collect $200.");
					} else if (position < 0)
					{
						position += 40;
						Runner.currentPlayer.addMoney(200);
						System.out.println("You pass GO, collect $200.");
					}

				return position;
			}

		public void switchDirection()
			{
				this.movementDirection *= -1;
			}

		public void printPlayer()
			{
				System.out.println("-=-=-=-=-");
				System.out.println(this.name + ":" + this.piece);
				System.out.println("$" + this.money);

			}

		public boolean endCondition()
			{

				if (money <= 0)
					{
						System.out.println("You have gone bankrupt- you lose.");
						System.exit(0);
						return true;
					} else
					{
						return false;
					}
			}

	}
