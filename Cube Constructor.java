class Main 
{
  public static void main(String[] args) {
    Cube box = new Cube(3);
    //box.side = 3;
    
    //Cube(3);
    
    box.printAtt();
    
  }
}


public class Cube
{
  public double side, faceDiagonal, facePerimeter, faceArea, surfaceArea, volume, diagonal;
  
  
  public Cube(double side){
    //Cube box = new Cube(3);
    
    this.side = side;
    this.faceDiagonal = side*Math.sqrt(2);
    this.facePerimeter = side*4;
    this.faceArea = side*side;
    this.surfaceArea = faceArea*6;
    this.volume = side*side*side;
    this.diagonal = Math.sqrt((side*side)+(faceDiagonal*faceDiagonal));
    
  }
  
  public Cube(){
    
    // blank contructor
    
  }
  
  public void printAtt(){
    
    System.out.println("The cube's side length is: " + this.side);
    System.out.println("The cube's face diagonal is: " + this.faceDiagonal);
    System.out.println("The cube's face perimeter is: " + this.facePerimeter);
    System.out.println("The cube's face area is: " + this.faceArea);
    System.out.println("The cube's surface area is: " + this.surfaceArea);
    System.out.println("The cube's volume is: " + this.volume);
    System.out.println("The cube's diagonal is: " + this.diagonal);
    
  }
  
}


class Square{
 
 
  
}

