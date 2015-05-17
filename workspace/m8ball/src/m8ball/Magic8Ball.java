package m8ball;
//Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	public static void main(String[] args)
	{
		int randomNumber = new Random().nextInt(4);
		System.out.println(randomNumber);
		JOptionPane.showInputDialog("Ask me a question.");
		String answer;
		if(randomNumber == 0) {
			answer = "Yes.";
		}
		else if(randomNumber == 1) {
			answer = "No.";
		}
		else if(randomNumber == 2) {
			answer = "Maybe?";
		}
		else{
			answer = "Try again.";
		}
		tell(answer);
	}
	private static void tell(String message)
	{
		JOptionPane.showInputDialog(null,message);
	}
static String ask(String question)
{
	String answer = JOptionPane.showInputDialog(question);
	return answer;
}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe?"

	// 8. If the random number is 3

	// -- write your own answer

}


