import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Square box = new Square();
    double side = 3;
    
    box.setAtt(side);
    printAtt(box);
    
  }
  
    public static void printAtt(Square box)
  {
    Scanner readin = new Scanner(System.in);
    int side = 3;
    
    System.out.println("The perimeter is " + box.perimeter(side));
    System.out.println("The side length is " + side);
    System.out.println("The area is " + box.area(side));
    System.out.println("The diagonal is " + box.diagonal(side));
  
  }
  
}

public class Square
{
  public double side = 3, diagonal, perimeter, area;
  
  public void setAtt(double side){
    
    perimeter = side*4;
    diagonal = side*(Math.sqrt(2));
    area = side*side;
    
  }
  
  public double diagonal(double side){
  
  double diagonal = side*(Math.sqrt(2));
  return diagonal;
}

public double perimeter(double side){
  
  double perimeter = side*4;
  return perimeter;
}

public double area(double side){
  
  double area = side*side;
  return area;
}
}
