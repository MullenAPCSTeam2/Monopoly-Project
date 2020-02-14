import java.util.ArrayList;

public class Playing 
{
	public static void playing()
	{
		ArrayList<Player> playing = new ArrayList<Player>();
		playing.add(new Player (1, ""));
		
		System.out.println("What is your name?");
		
		for (Player p : playing)
		{
			p.setName(p.getName());
		}
	}
}
