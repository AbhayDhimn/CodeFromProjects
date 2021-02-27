import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    double side, sidediagonal, perimeter, area, diagonal, surfacearea, volume, length, width, slantlength, radius, height, basearea, lateralarea, greatcircleperimeter, greatcirclearea;
    int choice;
    
    System.out.println("For cube enter 1, for cylinder enter 2, for sphere enter 3, for cone enter 4, for rectangular prism enter 5");
    choice = readin.nextInt();
    
    if (choice == 1){
      
      Cube box = new Cube();
      
      System.out.println("You chose cube: ");
      System.out.println();
      System.out.println("Enter the side length: ");
      side = readin.nextDouble();
      box.side = side;
      
      box.setAtt();
      box.printAtt();
      
    }
    
    if (choice == 2){
      
      Cylinder can = new Cylinder();
      
      System.out.println("You chose cylinder: ");
      System.out.println();
      System.out.println("Enter the radius of the base: ");
      radius = readin.nextDouble();
      System.out.println("Enter the height of the cylinder: ");
      height = readin.nextDouble();
      can.radius = radius;
      can.height = height;
      
      can.setAtt();
      can.printAtt();
      
    }
    
    if (choice == 3){
      
      Sphere ball = new Sphere();
      
      System.out.println("You chose sphere: ");
      System.out.println();
      System.out.println("Enter the radius: ");
      radius = readin.nextDouble();
      ball.radius = radius;
      
      ball.setAtt();
      ball.printAtt();
      
    }
    
    if (choice == 4){
      
      Cone icecream = new Cone();
      
      System.out.println("You chose cone: ");
      System.out.println();
      System.out.println("Enter the radius of the base: ");
      radius = readin.nextDouble();
      System.out.println("Enter the height if the cone: ");
      height = readin.nextDouble();
      
      icecream.radius = radius;
      icecream.height = height;
      
      icecream.setAtt();
      icecream.printAtt();
      
    }
    
    if (choice == 5){
      
      RectangularPrism weirdbox = new RectangularPrism();
      
      System.out.println("You chose rectangular prism: ");
      System.out.println();
      System.out.println("Enter the length: ");
      length = readin.nextDouble();
      System.out.println("Enter the width: ");
      width = readin.nextDouble();
      System.out.println("Enter the height: ");
      height = readin.nextDouble();
      weirdbox.length = length;
      weirdbox.width = width;
      weirdbox.height = height;
      
      weirdbox.setAtt();
      weirdbox.printAtt();
      
    }
    
  }
}


public class Cone
{
  public double radius, height, slantlength, basearea, surfacearea, volume;
  
  public void setAtt()
  {
    
    this.slantlength = Math.sqrt((this.radius*this.radius)+(this.height*this.height));
    this.basearea = (Math.PI*this.radius*this.radius);
    this.surfacearea = (Math.PI*this.radius*(this.radius+Math.sqrt((this.height*this.height)+(this.radius*this.radius))));
    this.volume = (Math.PI*this.radius*this.radius*(this.height/3));
    
  }
  
  public void printAtt()
  {
    System.out.println("The radius is: " + this.radius);
    System.out.println("The height is: " + this.height);
    System.out.println("The base area is: " + this.basearea);
    System.out.println("The slant length is: " + this.slantlength);
    System.out.println("The surface area is: " + this.surfacearea);
    System.out.println("The volume is: " + this.volume);
  }
}


public class Cube
{
  public double side, sidediagonal, perimeter, area, diagonal, surfacearea, volume;
  
  public void setAtt()
  {
     this.area = this.side*this.side;
    this.perimeter = this.side*4;
    this.sidediagonal = this.side*Math.sqrt(2);
    this.diagonal = Math.sqrt(Math.pow(this.side, 2)+Math.pow(this.sidediagonal, 2));
    this.surfacearea = this.area*6;
    this.volume = this.side*this.side*this.side;
  }
  
  public void printAtt()
  {
    System.out.println("The side length is: " + this.side);
    System.out.println("The area is: " + this.area);
    System.out.println("The perimeter is: " + this.perimeter);
    System.out.println("The side diagonal is: " + this.sidediagonal);
    System.out.println("The 3D diagonal is: " + this.diagonal);
    System.out.println("The surface area is: " + this.surfacearea);
    System.out.println("The volume is: " + this.volume);
  }
}


public class Cylinder
{
  public double radius, height, basearea, lateralarea, surfacearea, volume;
  
  public void setAtt()
  {
    
    this.basearea = (Math.PI*this.radius*this.radius);
    this.lateralarea = ((Math.PI*this.radius*2)*this.height);
    this.surfacearea = this.basearea+this.lateralarea;
    this.volume = this.basearea*this.height;
    
  }
  
  public void printAtt()
  {
    System.out.println("The radius is: " + this.radius);
    System.out.println("The height is: " + this.height);
    System.out.println("The base area is: " + this.basearea);
    System.out.println("The lateral area is: " + this.lateralarea);
    System.out.println("The surface area is: " + this.surfacearea);
    System.out.println("The volume is: " + this.volume);
  }
}


public class RectangularPrism
{
  public double length, width, height, surfacearea, volume;
  
  public void setAtt()
  {
    this.surfacearea = (this.length*this.width*2)+(this.length*this.height*2)+(this.width*this.height*2);
    this.volume = this.length*this.width*this.height;
  }
  
  public void printAtt()
  {
    System.out.println("The length is: " + this.length);
    System.out.println("The width is: " + this.width);
    System.out.println("The height is: " + this.height);
    System.out.println("The surface area is: " + this.surfacearea);
    System.out.println("The volume is: " + this.volume);
  }
}


public class Sphere
{
  public double radius, greatcircleperimeter, greatcirclearea, surfacearea, volume;
  
  public void setAtt()
  {
    
    this.greatcircleperimeter = (Math.PI*this.radius*2);
    this.greatcirclearea = (Math.PI*this.radius*this.radius);
    this.surfacearea = (4*Math.PI*this.radius*this.radius);
    this.volume = ((4/3)*Math.PI*this.radius*this.radius*this.radius);
    
  }
  
  public void printAtt()
  {
    System.out.println("The radius is: " + this.radius);
    System.out.println("The great circle's perimeter is: " + this.greatcircleperimeter);
    System.out.println("The great circle's area is: " + this.greatcirclearea);
    System.out.println("The surface area is: " + this.surfacearea);
    System.out.println("The volume is: " + this.volume);
  }
}
