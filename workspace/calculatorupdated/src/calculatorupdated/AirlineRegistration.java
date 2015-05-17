package calculatorupdated;

import javax.swing.JOptionPane;

public class AirlineRegistration
{
	public static void main(String[] args)
	{
		String first = JOptionPane.showInputDialog("First name.");
		String last = JOptionPane.showInputDialog("Last name.");
		String destination = JOptionPane
				.showInputDialog("Airport destination.");
		String birthday = JOptionPane.showInputDialog("Birthday.");
		String gender = JOptionPane.showInputDialog("Gender male or female.");
		for (int i = 5; i > 0; i--)
		{
			System.out.println(last + " " + "/" + " " + first + " " + birthday
					+ " " + gender + ".");
			System.out.println("Traveling to: " + destination + ".");
			System.out.println("copy" + " " + i);
			System.out.println();
		}
	}
}
