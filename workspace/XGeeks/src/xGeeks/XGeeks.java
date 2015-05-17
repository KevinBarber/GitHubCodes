package xGeeks;

//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class XGeeks
{
	public static void main(String[] args)
	{

		// 1. Save the superpower for each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String UserName1 = JOptionPane.showInputDialog("What is your name?");

		// 3. Show the superpower in a pop-up, depending on the name entered.
		JOptionPane.showInputDialog("Hi there " + UserName1
				+ " you're superpower is being an epic programmer.");
		String UserName2 = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showInputDialog("Hi there " + UserName2
				+ " you're superpower is being able to fly.");
		
		String UserName3 = JOptionPane.showInputDialog("What is your name?");
		
		JOptionPane.showInputDialog("Hi there " + UserName3
				+ "Im sorry but you do not have a superpower. You are an average person just like the other 7 billion people on this Earth.");
		


	}
}
