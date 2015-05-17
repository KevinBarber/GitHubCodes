//NOTE: MadLibs Online Version Made By Kevin Barber 3/17/15 
package org.jointheleague.kb.level0;

import javax.swing.JOptionPane;

public class Madlibs {
public static void main(String[] args) {
	new Madlibs().run();
}

private void run() {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Welcome to MadLibs Computer Edition.");
	JOptionPane.showMessageDialog(null, "This game is all about building sentences.");
	JOptionPane.showMessageDialog(null, "We will start with two rounds of short and simple sentences.");
	JOptionPane.showMessageDialog(null, "Don't worry the sentences will become much more advanced.");
	JOptionPane.showMessageDialog(null, "Good luck and Have fun!");
	String noun = JOptionPane.showInputDialog("Tell me a noun.");
	String adjective = JOptionPane.showInputDialog("Tell me a adjective");
	String verb = JOptionPane.showInputDialog("Tell me a verb.");
	String adverb = JOptionPane.showInputDialog("Tell me an adverb");
	JOptionPane.showMessageDialog(null, "My "+ adjective + " " + noun + " " + verb + " " + adverb + ".");
	//NOTE: This second part allows the player to choose to go for a second round.
	//NOTE: Optional to turn of of delete.
	JOptionPane.showInputDialog("Lets play again! Try and make the best sentence ever!");
	//NOTE: Now the round will begin if chosen
	String noun1 = JOptionPane.showInputDialog("Tell me a noun.");
	String adjective1 = JOptionPane.showInputDialog("Tell me a adjective");
	String verb1 = JOptionPane.showInputDialog("Tell me a verb.");
	String adverb1 = JOptionPane.showInputDialog("Tell me an adverb");
	JOptionPane.showMessageDialog(null, "My "+ adjective1 + " " + noun1 + " " + verb1 + " " + adverb1 + ".");
	//NOTE: Now begins the harder stage where better more advanced sentences will occur.
	//NOTE: Make sure to test and save a WORKING copy at all times.
	//NOTE: Here I will begin using the Preposistional Phrase. For example, on the beach, or in the room.
	JOptionPane.showInputDialog("Now we will start crafting longer more interesting sentences!");
	String noun2 = JOptionPane.showInputDialog("Tell me a noun! Make it a good one!");
	String verb2 = JOptionPane.showInputDialog("Tell me an action verb.");
	String prepfrase = JOptionPane.showInputDialog("Tell me a prepositional phrase. For example, on the beach or in the woods.");
	JOptionPane.showMessageDialog(null, "My "+ noun2 + " " + verb2 + " " + prepfrase + ".");
	JOptionPane.showInputDialog("Wow what an amazing sentence! How about we step it up even further? Lets go right ahead!");
}
}
