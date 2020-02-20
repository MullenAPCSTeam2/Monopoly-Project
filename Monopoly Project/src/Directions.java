
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Directions
	{
	static JFrame frame = new JFrame();

	

		public static void howToPlay() throws FileNotFoundException, IOException
		{
			
			try(BufferedReader bufferedReader = new BufferedReader(new FileReader("MonopolyDirections")))

			{
				String line;
				while((line = bufferedReader.readLine()) != null)
				{

					
					System.out.println(line);

				}
			}

			
		}
//		The Bank: 
//			1) The bank pays salaries.
//			2) The bank collects mortgages with interest when players mortgage their property.
//			3) The bank also prices all properties and monitors selling and auctioning of properties. 
//			4) The bank will not run out of money. 


	}
