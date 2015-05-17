package parseint;
import java.util.Random;

import javax.swing.JOptionPane;
public class ParseIntHilo
{
public static void main(String[] args)
{
	int r = new Random().nextInt(100);
	int SecretNum = r;
	int UserGuess = -1;
	while(UserGuess!=SecretNum)
	{

	String userguess = JOptionPane.showInputDialog("Input a number in the space below.");
	UserGuess = Integer.parseInt(userguess);
	if(UserGuess > SecretNum)
	{
	userguess = JOptionPane.showInputDialog("Too high. Guess a lower number!");
	}
	else if(UserGuess < SecretNum)
	{
	userguess =JOptionPane.showInputDialog("Too low. Guess a higher number!");
	}
	else if(UserGuess == SecretNum)
	{
	userguess =JOptionPane.showInputDialog("Congrats You have guessed the number correctly!");
	}
	
	}
	}
	
	
	
	
}

