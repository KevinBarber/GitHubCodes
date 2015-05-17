package birthdayReminder;

// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder
{

	public static void main(String[] args)
	{

		String momsBirthday = "October 20th";
		String dadsBirthday = "October 22nd";
		String myBirthday = "April 20th";
		String chosenBDay = JOptionPane
				.showInputDialog("What birthday would you like to know?");
		System.out.println(chosenBDay);
//NOTE: If its == its testing IMPORTANT!!!
		if(chosenBDay.equalsIgnoreCase("Mom")){
			System.out.println(momsBirthday);
}
		else if(chosenBDay.equalsIgnoreCase("Dad")){
			System.out.println(dadsBirthday);
		}
		else if(chosenBDay.equalsIgnoreCase("Mine")){
			System.out.println(myBirthday);
		}
		else{
			System.out.println("Im sorry, I don't remeber that person's birthday!");
		}
	
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
