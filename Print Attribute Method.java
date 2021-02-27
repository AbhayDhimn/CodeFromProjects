import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    Square box = new Square();
    
    /*box.perimeter(side);
    box.side(side);
    box.area(side);
    box.diagonal(side);
    */
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
  public double side, diagonal, perimeter, area;
  
  
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

