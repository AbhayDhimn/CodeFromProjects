import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    Circle ball1 = new Circle();
    Circle ball2 = new Circle();
    
    double rad1, rad2, area1, area2, shad1, shad2;
    
    System.out.println("Enter the radius of the outer circle: ");
    rad1 = readin.nextDouble();
    System.out.println("Enter the radius of the inner circle: ");
    rad2 = readin.nextDouble();
    
    area1 = ball1.getArea(rad1);
    area2 = ball2.getArea(rad2);
    
    System.out.println("The area of the shaded region is " + Math.abs(area1-area2));
    
  }
}

public class Circle
{
  public double radius;
  public double diameter;
  public double circumference;
  public double area;
  
  public double getDiameter(double radius)
  {
    return radius*2;
  }
  public double getCircumference(double radius)
  {
    return Math.PI*(radius+radius);
  }
  public double getArea(double radius)
  {
    return Math.PI*radius*radius;
  }
}
