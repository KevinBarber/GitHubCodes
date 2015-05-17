package triangleshell;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TriangleShell {

public static void main(String[] args) {
	int length =  25;
for (int i = 0; i < 60; i++)
{
	Tortoise.setSpeed(10);


length = length + 4;
  
Tortoise.setPenColor(Colors.getRandomColor());
 
Tortoise.turn(6);
drawTriangle(length);
}

}


private static void drawTriangle(int length) {
	for (int i = 0; i < 3; i++)
	{
		Tortoise.show();
		Tortoise.move(length);
		Tortoise.turn(360/3);
		
		
	}
	

}
}


