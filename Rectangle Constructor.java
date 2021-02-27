class Main 
{
  public static void main(String[] args) 
  {
    Rectangle box1 = new Rectangle();
    Rectangle box2 = new Rectangle();
    
    box1.length = 3;
    box1.width = 5;
    box2.length = 5;
    box2.width = 3;
    
    box1.setAtt();
    box2.setAtt();
    
    box1.printAtt();
    box2.printAtt();
    
  }
}


public class Rectangle
{
  public double length, width, perimeter, area, diagonal;
  
  public void setAtt(){
    
    this.perimeter = (this.length*2)+(this.width*2);
    this.area = this.length*this.width;
    this.diagonal = Math.sqrt((this.length*this.length)+(this.width+this.width));
    
  }
  
  public Rectangle (double length, double width)
{
    this.perimeter = (length*2)+(width*2);
    this.area = length*width;
    this.diagonal = Math.sqrt((length*length)+(width+width));
}
  
  public Rectangle ()
{
    // blank constructor
}

  public void printAtt(){
    
    System.out.println("Length: " + this.length);
    System.out.println("Width: " + this.width);
    System.out.println("Perimeter: " + this.perimeter);
    System.out.println("Area: " + this.area);
    System.out.println("Diagonal: " + this.diagonal);
    System.out.println("_______________________________");
    
  }
  
}
