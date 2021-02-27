import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    double length, width, side, radius, shape;
    
    System.out.println("Enter 1 for square, 2 for circle, or 3 for rectangle: ");
    shape = readin.nextDouble();
    
    if (shape ==1){
      
      Square box = new Square();
      
      System.out.println("You chose square. Enter the side length: ");
      side = readin.nextDouble();
      
      box.side = side;
      
      box.setAtt();
      box.printAtt();
      
    }
    else
    if (shape ==2){
      
      Circle ball = new Circle();
      
      System.out.println("You chose circle. Enter the radius: ");
      radius = readin.nextDouble();
      
      ball.radius = radius;
      
      ball.setAtt();
      ball.printAtt();
      
    }
    else
    if (shape ==3){
      
      Rectangle weirdbox = new Rectangle();
      
      System.out.println("You chose rectangle. Enter the Length: ");
      length = readin.nextDouble();
      System.out.println("Enter the Width: ");
      width = readin.nextDouble();
      
      weirdbox.length = length;
      weirdbox.width = width;
      
      weirdbox.setAtt();
      weirdbox.printAtt();
      
    }
    
    
  }
}


public class Circle
{
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


public class Rectangle
{
  public double length, width, perimeter, area, diagonal;
  
  public void setAtt(){
    
    this.perimeter = (2*length)+(2*width);
    this.area = length*width;
    this.diagonal = Math.sqrt((length*length)+(width*width));
    
  }
  
  public void printAtt(){
    
    System.out.println("The length is: " + this.length);
   System.out.println("The width is: " + this.width);
   System.out.println("The perimeter is: " + this.perimeter);
   System.out.println("The area is: " + this.area);
   System.out.println("The diagonal is: " + this.diagonal);
    
  }
  
}


public class Square
{
  public double side, area, perimeter, diagonal;
  
  public void setAtt(){
    
    this.area = this.side*this.side;
    this.perimeter = this.side*4;
    this.diagonal = this.side*Math.sqrt(2);
    
  }
  
  public void printAtt(){
    
    System.out.println("The side length is: " + this.side);
    System.out.println("The area is: " + this.area);
    System.out.println("The perimeter is: " + this.perimeter);
    System.out.println("The side diagonal is: " + this.diagonal);
    
  }
  
}
