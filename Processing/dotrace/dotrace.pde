
//1. Make a variable to hold the X co-ordinate of the dot, and set it to something. DONE


 int xcord = 100;
void setup() {
  size(800, 200);
  background(20,50,130);
}

void draw() {
   background(20,50,130);
  ellipse(xcord,100,100,100);
  fill(125,190,125);
  if(mousePressed){
  xcord = xcord + 150;
  }
  if(xcord > 800){
  }
    
  //3. make it a nice color. DONE
 
  //4. if the mouse is pressed...DONE
     
//5. ... change the X co-ordinate so that the dot moves to the rightDONE
      
  //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.

//6. Make your dot move really fast so that it can win the race (you have to figure out what part of your code to change)

//7. Use this method to play a ding when your dot crosses the finish line. 


}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  if (!soundPlayed) {// Copyright Wintriss Technical Schools 2013
    Minim minim = new Minim(this);        
    AudioSample sound = minim.loadSample("ding2.wav");
    sound.trigger();
    soundPlayed = true;
  }
}




