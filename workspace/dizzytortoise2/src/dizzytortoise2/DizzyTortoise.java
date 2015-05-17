package dizzytortoise2;
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		
	String numspins =	JOptionPane.showInputDialog("How many times do you want the tortois to spin from 1-10?");
	int spins = Integer.parseInt(numspins);
	
	dance(spins);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}

