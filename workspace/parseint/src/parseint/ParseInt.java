package parseint;

import javax.swing.JOptionPane;

public class ParseInt
{
	public static void main(String[] args)
	{
		String number =  JOptionPane.showInputDialog("Tell me a number! Make it a good one to test my memory. Ps I have a photographic memory.");
		int a = Integer.parseInt(number);
		if(a < 10)
		{
			JOptionPane.showMessageDialog(null,"This number is very Low!");
		}
		if(a >10&&a <100)
		{
			JOptionPane.showMessageDialog(null, "This number is Medium.");
		}
		if(a > 100)
		{
			JOptionPane.showMessageDialog(null, "This number is very High.");
		}

	
	
	} 

}
