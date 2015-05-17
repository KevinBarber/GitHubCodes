PImage creeper;  
int creeperX = 40;
int creepery = 40;
PImage tree; 


void setup()
{
 size(500,500);
creeper=loadImage("creeper.png");
tree=loadImage("tree.jpg");
tree.resize(500, 500);
background(tree);
creeper.resize(40, 40);


}



void draw()
{
  background(tree);
  image(creeper, 40, 40);    
  if(mousePressed)
  {
    
  }
  if(isNear(mouseX, creeperX)
  {
    fill(0,255,0)
  }
   if(isNear(mouseY, creeperY)
  {
    fill(0,255,0)
  }
{ellipse(mouseX,mouseY,50,50);
}
fill(255, 0, 0);
if(mouseX < 20 && mouseY < 20)
{
fill(0,255,0);
}
else
{
fill(255,0,0);
}
}

{
  boolean isNear(int a, int b) {
      if (abs(a - b) < 10)
          return true;
     return false;
}




