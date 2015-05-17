import ddf.minim*;
AudioPlayer Sound;
minim m:
PImage face;
int leftpupilx = 40;
int leftpupily = 40;
int rightpupilx = 60;
int rightpupily = 40;
void setup()
{
  m = newMinim(this);
  sound = m.loadfile("sound.mp3,2048);
  size(100,100);
  face = loadImage("face.jpeg");
  face.resize(100,100);


}



void draw()
{
  
 leftpupilx = mouseX;
 leftpupily = mouseY;
  rightpupilx = mouseX;
 rightpupily = mouseY;

   if(leftpupilx<37)
  {
    leftpupilx = 37;
  }
   if(leftpupilx>43)
  {
    leftpupilx = 43;
  }
    if(leftpupily<37)
  {
    leftpupily = 37;
  }
   if(leftpupily>43)
  {
    leftpupily = 43;
  }
 //Switch
    if(rightpupilx<56)
  {
    rightpupilx = 56;
  }
   if(rightpupilx>65)
  {
    rightpupilx = 65;
  }
    if(rightpupily<37)
  {
    rightpupily = 37;
  }
   if(rightpupily>43)
  {
    rightpupily = 43;
  }
 
image(face,0,0);
  fill(255,255,255);
  ellipse(40,40,10,20);
  ellipse(60,40,10,20);
  fill(0,0,0);
   if(mousePressed)
   {
   line(mouseX,mouseY,leftpupilx,leftpupily);
     line(mouseX,mouseY,rightpupilx,rightpupily);
   }
 {
 fill(60,203,159);
 }
  ellipse(leftpupilx,leftpupily,5,10);
  ellipse(rightpupilx,rightpupily,5,10);
  

  
 
}
