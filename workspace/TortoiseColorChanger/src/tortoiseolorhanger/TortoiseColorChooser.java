package tortoiseolorhanger;

//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser
{
	public static void main(String[] args)
	{
		for (int j = 0; j < 10; j++)
		{
			// 3. ask the user what color they would like the tortoise to draw
			String penColor = JOptionPane
					.showInputDialog("What Color would you like to have the tortoise draw in?");

			// 4. use an if/else statement to set the pen color that the user
			// requested
			if (penColor.equalsIgnoreCase("red"))
			{
				Tortoise.setPenColor(Color.RED);
			} else if (penColor.equalsIgnoreCase("blue"))
			{
				Tortoise.setPenColor(Color.BLUE);
			}

			else if (penColor.equalsIgnoreCase("green"))
			{
				Tortoise.setPenColor(Color.GREEN);
			}
			// 5. if the user doesn’t enter anything, choose a random color
			else
			{
				Tortoise.setPenColor(Color.CYAN);
			}

			// 6. put a loop around your code so that you keep asking the user
			// for more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);

			// 1. make the tortoise draw a shape (this will take more than one
			// line of code)
			Tortoise.setSpeed(10);
			for (int i = 0; i < 60; i++)
			{
				Tortoise.move(300);
				Tortoise.turn(204);

			}

		}
	}
}
