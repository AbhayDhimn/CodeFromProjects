class Main 
{
  public static void main(String[] args) 
  {
    Square box = new Square(10);
    box.printAtt();
    
    Square box2 = new Square();
    box2.side = 5;
    box2.setAtt();
    box2.printAtt();
  }
}


public class Square
{
  double side, diagonal, perimeter, area;
  
  public Square(double side)
  {
    
    this.diagonal = side*Math.sqrt(2);
    this.perimeter = side*4;
    this.area = side*side;
    
  }
  
  public Square()
  {
    //blank constructor for use with setAtt() method
  }
  
  public void setAtt()
  {
    double s = this.side;
    this.diagonal = s * Math.sqrt(2);
    this.perimeter = 4 * s;
    this.area = Math.pow(s, 2);
  }
  
  public void printAtt()
  {
    System.out.println("Side: " + this.side + "\nDiagonal: " + this.diagonal + "\nPerimeter: " + this.perimeter + "\nArea: " + this.area);
    System.out.println("________________________________");
  }
}
