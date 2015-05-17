package stephenHawking;

import javax.swing.JOptionPane;

public class StephenHawking
{
	public static void main(String[] args)
	{
		String words = JOptionPane.showInputDialog("Tell me a sentence");
		for (int i = 20; i > 0; i--)
		{
			
			System.out.println("I just got a return value which is " + speak(words, i));
		}
	}

	static String speak(String junk, int j)
	{
		try
		{
			Runtime.getRuntime().exec("say" + junk).waitFor();
			
		} catch (Exception e)
		{
			System.out.println(junk + " " + j);
			return "trying to speak";
		}
		return "";
	}
}