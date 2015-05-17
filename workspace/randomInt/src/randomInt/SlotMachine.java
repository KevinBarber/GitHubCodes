package randomInt;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomInt {
public static void main(String[] args)
{
 int random;
	 random = new Random().nextInt(3);
	 System.out.println(random);
	
	 int random2 =
	  new Random().nextInt(3);
	 System.out.println(random2);
	 
	 int random3 =
	 new Random().nextInt(3);
	 System.out.println(random3);
if(random==random2&&random==random3){
	System.out.println("You Win");
}
else{
	JOptionPane.showMessageDialog(null, "Try Again.");
}

{
	
}
}
}