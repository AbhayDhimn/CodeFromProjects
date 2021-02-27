import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    Square squares[] = new Square[5];
    int side;
    
    for(int d = 0; d< squares.length; d++){
      Square box = new Square();
    System.out.println("Enter the side length");
    side = readin.nextInt();
    box.side = side;
    squares[d] = box;
    }
    
    setAtt(squares);
    printAtt(squares);
  }
  
  public static Square[] setAtt(Square squares[])
  {
    for(int d = 0; d < squares.length; d++){
    squares[d].diagonal = squares[d].getDiagonal(squares[d].side);
    squares[d].perimeter = squares[d].getPerimeter(squares[d].side);
    squares[d].area = squares[d].getArea(squares[d].side);
    }
    return squares;
  }
  
  public static void printAtt(Square squares[])
  {
    for(int d = 0; d < squares.length; d++){
    System.out.println("The side of square is: " + squares[d].side);
    System.out.println("The diagonal of square is " + squares[d].diagonal);
    System.out.println("The perimeter of square is " + squares[d].perimeter);
    System.out.println("The area of square is " + squares[d].area);
    System.out.println("_________________________________________________");
    }
  }
  
}

public class Square
{
  public double side = 0, diagonal, perimeter, area;
  
  public void setAtt(double side){
    
    perimeter = side*4;
    diagonal = side*(Math.sqrt(2));
    area = side*side;
    
  }
  
  public double getDiagonal(double side){
  
  double diagonal = side*(Math.sqrt(2));
  return diagonal;
}

public double getPerimeter(double side){
  
  double perimeter = side*4;
  return perimeter;
}

public double getArea(double side){
  
  double area = side*side;
  return area;
}
}
