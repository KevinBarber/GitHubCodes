package addingmachine;

import javax.swing.JOptionPane;

public class addingmachine
{
	public static void main(String[] args)
	{
		String num1 = JOptionPane.showInputDialog("Tell me a number.");
		String num2 = JOptionPane
				.showInputDialog("Tell me another number so that the sum of both numbers will be less than 14.");
		int answer = adder(num1, num2);
		if (answer > 13)
		{
			JOptionPane.showMessageDialog(null,
					"I said below 14! Read the instructions!");
		} else
		{
			JOptionPane
					.showMessageDialog(null, "Congrats you have " + adder(num1, num2));
		}
	}

	private static int adder(String number1, String number2)
	{
		int num1;
		int num2;
		num1 = Integer.parseInt(number1);
		num2 = Integer.parseInt(number2);
		int answer = num1 + num2;
		return answer;

	}
}
