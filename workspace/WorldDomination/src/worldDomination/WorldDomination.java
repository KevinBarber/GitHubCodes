package worldDomination;

import javax.swing.JOptionPane;

public class WorldDomination
{
	public static void main(String[] args)
	{
		// 1. Ask the user if they know how to write code.
		int yn = JOptionPane.showConfirmDialog(null, "Do you know how to write code?", "Question", JOptionPane.YES_NO_OPTION);

		// 2. If they say "yes", tell them they will rule the world.
		if(yn == JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "You will rule the world.");
		}

		// 3. Otherwise, wish them good luck washing dishes.
		else{
			JOptionPane.showMessageDialog(null, "Good luck washing dishes.");
		}
			

	}
}
