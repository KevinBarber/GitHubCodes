package magic8Ball;

//Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball
{
	public static void main(String[] args)
	{
		int randomNumber = new Random().nextInt(4);
		System.out.println(randomNumber);
		ask("Tell me a question for my Magic 8 Ball.");
		String answer;
		if (randomNumber == 0)
		{
			answer = "Yes.";
		}

		else if (randomNumber == 1)
		{
			answer = "No.";
		} else if (randomNumber == 2)
		{
			answer = "Maybe?";
		} else
		{
			answer = "Try again.";
		}
		tell(answer);
	}

	private static void tell(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}

	static String ask(String question)
	{
		String answer = JOptionPane.showInputDialog(question);
		return answer;
	}
}
