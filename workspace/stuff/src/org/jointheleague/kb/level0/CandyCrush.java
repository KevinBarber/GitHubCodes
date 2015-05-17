package org.jointheleague.kb.level0;

//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		String dontLike = JOptionPane.showInputDialog("Who don't you like?");

		JOptionPane.showMessageDialog(null, "You totally have a crush on "
				+ dontLike + "!");

		String bestFriend = JOptionPane
				.showInputDialog("What is the name of your best friend?");

		JOptionPane.showMessageDialog(null, bestFriend
				+ " is as sweet as candy.");

	}
}
