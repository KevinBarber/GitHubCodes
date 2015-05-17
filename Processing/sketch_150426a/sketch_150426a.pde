void setup() {
  size(800, 800);
  
}




void draw(){
 
  if(mousePressed){
     ellipse(mouseX,mouseY, random(400),random(400));
     fill(random(255),random(255),random(255));
     rect(random(100),random(100), random(400), random(400));
     fill(random(255),random(255),random(255));
     triangle(random(900),random(900),random(900),random(900),random(900),random(900));
   
   
   
  }
 



}

