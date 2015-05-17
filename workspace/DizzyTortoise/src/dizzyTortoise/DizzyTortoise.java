package dizzyTortoise;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise
{

	public static void main(String[] args)
	{

		String spins = JOptionPane
				.showInputDialog("How many time would you like to spin the tortoise from 1-10?");
		int numOfSpins = Integer.parseInt(spins);
		dance(numOfSpins);
		// squareWalk();
		flowerWalk();

	}

	static void dance(int numberOfSpins)
	{
		for (int i = 0; i < numberOfSpins; i++)
		{
			Tortoise.turn(360);
		}
	}

	static void squareWalk()
	{

		for (int i = 0; i < 4; i++)
		{
			Tortoise.move(100);
			Tortoise.turn(90);
		}

	}

	static void flowerWalk()
	{
		Tortoise.setSpeed(5);
		for (int i = 0; i < 8; i++)
		{
			squareWalk();
			Tortoise.turn(45);

		}

	}
}
