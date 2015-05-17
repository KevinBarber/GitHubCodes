package org.jointheleague.kb.level0;

import javax.swing.JOptionPane;

public class ChangeCalculator
{

	public static void main(String[] args)
	{

		String nickels = JOptionPane
				.showInputDialog("How many nickels do you have?");

		int numNickels = Integer.parseInt(nickels);

		String dimes = JOptionPane
				.showInputDialog("How many dimes do you have?");
		int numDimes = Integer.parseInt(dimes);

		String quarters = JOptionPane
				.showInputDialog("How many quarters do you have?");
		int numQuarters = Integer.parseInt(quarters);

		double total = numNickels * 0.05 + numDimes * 0.10 + numQuarters * 0.25;

		JOptionPane.showMessageDialog(null, "You have $" + total + ".");

		if (total < 80)
		{
			JOptionPane.showMessageDialog(null, "You are poor.");
		} else if (total > 80)
		{
			JOptionPane.showMessageDialog(null, "You are rich!!!");

		}

	}
}
