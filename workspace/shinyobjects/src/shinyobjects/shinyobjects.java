package shinyobjects;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class shinyobjects
{
	public static void main(String[] args)
	{
		String objnum = JOptionPane.showInputDialog("How many shiny objects do you want?");
		int objnum1;
		objnum1 = Integer.parseInt(objnum);
		//NOTE: on the left there is objnum1 that is the integer. On the right there is just objnum1 that is the string that will be converted.
		for (int i = 0; i < objnum1; i++)
		{
			System.out.println(i);
			playMisterZee();
		}
	}

	public static void playMisterZee()
	{
		try
		{
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new URL(
							"https://github.com/joonspoon/league-jars/blob/master/shiny%20objects.wav?raw=true"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
