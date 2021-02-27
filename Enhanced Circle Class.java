import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    Circle ball = new Circle();
    double radius;
    
    System.out.println("Enter a radius and I will calculate the area, circumference, and diameter: ");
    radius = readin.nextDouble();
    
    ball.radius = radius;
    
    ball.setAtt();
    ball.printAtt();
    
  }
}


public class Circle{
  
  public double radius, diameter, circumference, area;
 
 public void setAtt(){
   
   this.diameter = this.radius*2;
   this.circumference = (Math.PI*(this.radius*2));
   this.area = (Math.PI*this.radius*this.radius);
   
 }
 
 public void printAtt(){
   
   System.out.println("The radius is: " + this.radius);
   System.out.println("The diameter is: " + this.diameter);
   System.out.println("The circumference is: " + this.circumference);
   System.out.println("The area is: " + this.area);
   
 }
  
}
