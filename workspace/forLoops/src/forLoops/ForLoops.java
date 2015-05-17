package forLoops;

import java.util.Random;

import javax.swing.JOptionPane;

public class ForLoops

{
public static void main(String[] args)
{
	int range1 = 0;
	int range2 = 0;
	int range3 = 0;
	for (int i = 0; i < 100; i++)
	{
	
	 int random;
	 random = new Random().nextInt(100);
	 System.out.println(random);
	 if(random <= 33){
		range1++;
	 }
	 if(random <= 66&&random >=34){
			range2++;
		 }
	 if(random <= 100&&random >= 67){
			range3++;
		 }
	                     
	 
	}
	JOptionPane.showMessageDialog(null, "Amount of numbers from 0-33" + " >>>> " + range1);
	JOptionPane.showMessageDialog(null, "Amount of numbers from 34-66" + " >>>> " + range2);
	JOptionPane.showMessageDialog(null, "Amount of numbers from 67-100" + " >>>> " + range3);
}										
}