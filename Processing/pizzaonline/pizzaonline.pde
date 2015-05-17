void setup()
{
  size(2880, 1800);
  fill(120, 70, 80);
}
void draw()
{
  ellipse(100, 100, 100, 100);
  PImage pepperoni = loadImage("pepperoni.gif");  
    pepperoni.resize(10, 10)
    image(pepperoni, x, y);

}
