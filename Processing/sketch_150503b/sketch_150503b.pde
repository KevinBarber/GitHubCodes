int x = 250;
int y = 250;
boolean up;
void setup()
{
  size(500,500);
}
void draw()
{
  background(255,0,0);
  ellipse(x,y,100,100);
keyControl();
up = false;
}





void keyPressed()
{
  if(keyCode==UP)
  {
    up=true;
  }
  else 
  { 
    up = false;
  }
}
void keyControl()
{
  if(up)
  {
   y-=5;
  }
}


