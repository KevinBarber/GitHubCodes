package something;

import javax.swing.JOptionPane;

public class Something {
public static void main(String[] args) {
	String name =JOptionPane.showInputDialog("What is your name?");	
	JOptionPane.showInputDialog("Hello " + name + ".");
	JOptionPane.showMessageDialog(null, "Hi there");
}
}
