
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
			
			try(BufferedReader bufferedReader = new BufferedReader(new FileReader("MonopolyDirections.txt")))

		public static void howToPlay() throws FileNotFoundException, IOException
		{
			
			try(BufferedReader bufferedReader = new BufferedReader(new FileReader("MonopolyDirections")))

			{
				String line;
				while((line = bufferedReader.readLine()) != null)
				{

					JOptionPane.showMessageDialog(frame, line);

					System.out.println(line);

				}
			}

			
		}

	}
