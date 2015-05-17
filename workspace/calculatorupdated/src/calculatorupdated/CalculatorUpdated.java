package calculatorupdated;

import javax.swing.JOptionPane;

public class CalculatorUpdated
{
	public static void main(String[] args)
	{
		String num1 = JOptionPane.showInputDialog("Tell me a number.");
		String num2 = JOptionPane.showInputDialog("Tell me another number.");
		String calculate = JOptionPane
				.showInputDialog("Tell me what you want me to do with your number. Ex. multiply.");
		Float numone;
		numone = Float.parseFloat(num1);
		Float numtwo;
		numone = Float.parseFloat(num1);
		numtwo = Float.parseFloat(num2);
		if (calculate.equals("+"))
		{
			add(numone, numtwo);
			JOptionPane.showMessageDialog(null, add(numone, numtwo));
		}
		if (calculate.equals("-"))
		{
			sub(numone, numtwo);
			JOptionPane.showMessageDialog(null, sub(numone, numtwo));
		}
		if (calculate.equals("*"))
		{
			try
			{
				multiply(numone, numtwo);	
			} catch (Exception e)
			{
				System.out.println("error");
			}
			JOptionPane.showMessageDialog(null,multiply(numone, numtwo));
		}
		if (calculate.equals("/"))
		{
			divide(numone, numtwo);
			JOptionPane.showMessageDialog(null,divide(numone, numtwo));
		}
	}

	public static Float add(Float numone, Float numtwo)
	{
		return numone + numtwo;
	}

	public static Float sub(Float numone, Float numtwo)
	{
		return numone - numtwo;
	}

	public static Float multiply(Float numone, Float numtwo)
	{
		return numone * numtwo;
	}

	public static Float divide(Float numone, Float numtwo)
	{
		return numone / numtwo;
	}
}
