package madlibs2;

import javax.swing.JOptionPane;

public class Madlibs2 {
	public static void main(String[] args) {
	//MadLibs 2.0 Kevin Barber 3/18/15
	//NOTE: Down here is where the computer asks the user for nouns and stuff and compiles it into story at bottom.
	String noun1 =	JOptionPane.showInputDialog("During Summer my mom took me to a (place) on a vacation to (place)");
	String adjective1 = JOptionPane.showInputDialog("The weather there was very (adjective)" + ".");
	String noun2 = JOptionPane.showInputDialog("There were so many (noun) at the (noun)");
	
	
	
	//NOTE: Down here goes the end of the story where it puts all the stuff together. Final copy to show to user.
	JOptionPane.showMessageDialog(null, "During Summer my mom took me to a " + noun1 + ".");
	JOptionPane.showMessageDialog(null, "The weather there was very " + adjective1 + ".");
	JOptionPane.showMessageDialog(null, "There were so many " + noun2 + ".");
	
	
	}

}
