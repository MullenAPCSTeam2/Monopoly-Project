
public class codeTester {

	public static void main(String[] args) {
		
		Player player1 = new Player(1500, "Tester", "Dog", 0);
		Player player2 = new Player(0, "Losers", "Iron", 20);
		
		player1.changePosition(Dice.rollDice());
		
		
		//System.out.println(player1.getPosition());
		Board.loadClassicGame();
		//System.out.println((Board.getTile(player1.position)).getName());
		System.out.println(player2.getPosition());
		System.out.println(player2.endCondition());
		System.out.println(player2.getPosition());
		
		


	}

}
