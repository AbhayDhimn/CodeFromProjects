import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    int radius;
    Circle circles[] = new Circle[5];
    
    for(int d = 0; d < circles.length; d++){
    System.out.print("Enter the radius for circle");
    Circle ball = new Circle();
    radius = readin.nextInt();
    ball.radius = radius;
    circles[d] = ball;
    }
    setAtt(circles);
    printAtt(circles);
  }
  
  public static Circle[] setAtt(Circle circles[])
  {
    for(int d = 0; d < circles.length; d++){
    circles[d].diameter = circles[d].getDiameter(circles[d].radius);
    circles[d].circumference = circles[d].getCircumference(circles[d].radius);
    circles[d].area = circles[d].getArea(circles[d].radius);
    }
    return circles;
  }
  
  public static void printAtt(Circle circles[])
  {
    for(int d = 0; d < circles.length; d++){
    System.out.println("The radius of circle is: " + circles[d].radius);
    System.out.println("The diameter of circle is " + circles[d].diameter);
    System.out.println("The circumference of circle is " + circles[d].circumference);
    System.out.println("The area of circle is " + circles[d].area);
    System.out.println("_________________________________________________");
    }
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
