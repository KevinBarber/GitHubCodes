package riddleMeThis;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score =
		0;
	
		
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		String riddleoneanswer = JOptionPane.showInputDialog("What comes once in a minute, twice in a moment, but never in a thousand years.");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddleoneanswer.equals("m"))
		{
			JOptionPane.showMessageDialog(null,"Correct!");
			score = score + 1;
		}
		
		else
		{
			JOptionPane.showMessageDialog(null,"Wrong!!");
			JOptionPane.showMessageDialog(null, "The answer is M!! Nice try.");
		}
		
		
		
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,"Nice job! "+ "Here is your score." +" "+ score);
	
		JOptionPane.showMessageDialog(null, "Lets try another riddle!");
	String riddletwoanswer = JOptionPane.showInputDialog("What word in the dictionary is spelled Incorrectly?");
	if(riddletwoanswer.equals("Incorrectly"))
	{
		JOptionPane.showMessageDialog(null, "Correct!");
		score = score + 1;
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Wrong!");
				JOptionPane.showMessageDialog(null, "The answer is Incorrectly!!");
	}
	JOptionPane.showMessageDialog(null,"Nice job! "+ "Here is your score." +" "+ score);
	
		
		
	}
}

