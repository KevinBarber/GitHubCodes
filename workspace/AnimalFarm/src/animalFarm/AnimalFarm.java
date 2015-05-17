package animalFarm;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm
{

	AnimalFarm()
	{

		for (int i = 3; i > 0; i--)
		{
			
			String Animal = JOptionPane.showInputDialog("What animal would you like? A cow a duck or a dog?");
			if(Animal.equalsIgnoreCase("cow")){
				playMoo();
				
			}
			else if(Animal.equalsIgnoreCase("duck")){
				playQuack();
			}
			else if(Animal.equalsIgnoreCase("dog")){
				playWoof();
			}
		}
	


	}

	void playMoo()
	{
		playNoise(mooURL);
	}

	void playQuack()
	{
		playNoise(quackURL);
	}

	void playWoof()
	{
		playNoise(woofURL);
	}

	String quackURL = "https://github.com/joonspoon/league-jars/blob/master/quack.wav?raw=true";
	String mooURL = "https://github.com/joonspoon/league-jars/blob/master/moo.wav?raw=true";
	String woofURL = "https://github.com/joonspoon/league-jars/blob/master/woof.wav?raw=true";
	String meowURL = "https://github.com/joonspoon/league-jars/blob/master/meow.wav?raw=true";
	String llamaURL = "https://github.com/joonspoon/league-jars/blob/master/llama.wav?raw=true";

	/* Ignore this stuff */

	public void playNoise(String soundURL)
	{
		try
		{
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new URL(soundURL));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		new AnimalFarm();
	}

}
