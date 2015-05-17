
int x = 250;
int y = 250;
void setup()
{
  size(500,500);
}
void draw()
{
  background(255,0,0);
  ellipse(x,y,100,100);
}
void keyPressed()
{
  if(key=='w')
  {
  y-=7;
  }

  if(key=='d')
  {
  x+=7;
  }
if(key=='s')
  {
  y+=7;
  }
if(key=='a')
  {
  x-=7;
  }










}
