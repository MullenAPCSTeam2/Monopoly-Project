
public class codeTester {

	public static void main(String[] args) {
		
		Player player1 = new Player(1500, "Tester", "Dog", 0);
		
		player1.changePosition(Dice.rollDice());
		
		
		System.out.println(player1.getPosition());
		Board.loadClassicGame();
		System.out.println((Board.getTile(player1.position)).getName());
		
<<<<<<< HEAD
=======
		//tester
>>>>>>> upstream/master

	}

}
