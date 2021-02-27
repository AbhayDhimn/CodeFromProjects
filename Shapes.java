import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    double side, length, width, height, radius;
    
    Scanner readin = new Scanner(System.in);
    int temp;
    
    System.out.print("Enter 2 for 2D object or 3 for 3D object");
    temp = readin.nextInt();
    
    if(temp == 2){
      
      System.out.println("You chose 2d: ");
      System.out.println("Enter 1 for square, 2 for rectangle, or 3 for circle");
      temp = readin.nextInt();
      
      if (temp == 1){
        
        Square box = new Square();
        System.out.println("You chose Square:");
        System.out.println("Enter side length");
        side = readin.nextDouble();
        box.side = side;
        box.setAtt();
        box.printAtt();
        
      } else
      
      if (temp == 2){
        
        Rectangle weirdbox = new Rectangle();
        System.out.println("You chose Rectangle:");
        System.out.println("Enter length");
        length = readin.nextDouble();
        System.out.println("Enter width");
        width = readin.nextDouble();
        weirdbox.length = length;
        weirdbox.width = width;
        
        weirdbox.setAtt();
        weirdbox.printAtt();
        
      } else
      
      if (temp == 3){
        
        Circle flatball = new Circle();
        System.out.println("You chose Circle:");
        System.out.println("Enter radius");
        radius = readin.nextDouble();
        flatball.radius = radius;
        
        flatball.setAtt();
        flatball.printAtt();
        
      }
      
    }
    if(temp == 3){
      
      System.out.println("You chose 3d: ");
      System.out.println("Enter 1 for cube, 2 for rectangular prism, 3 for cylinder, 4 for cone, or 5 for sphere");
      temp = readin.nextInt();
      
      if (temp == 1){
        
        Cube box = new Cube();
        System.out.println("You chose Cube:");
        System.out.println("Enter side length");
        side = readin.nextDouble();
        box.side = side;
        
        box.setAtt();
        box.printAtt();
        
      } else
      
      if (temp == 2){
        
        RectangularPrism weirdbox = new RectangularPrism();
        System.out.println("You chose Rectangular Prism:");
        System.out.println("Enter length");
        length = readin.nextDouble();
        System.out.println("Enter width");
        width = readin.nextDouble();
        System.out.println("Enter height");
        height = readin.nextDouble();
        
        weirdbox.length = length;
        weirdbox.width = width;
        weirdbox.height = height;
        
        weirdbox.setAtt();
        weirdbox.printAtt();
        
      } else
      
      if (temp == 3){
        
        Cylinder can = new Cylinder();
        System.out.println("You chose Cylinder:");
        System.out.println("Enter radius");
        radius = readin.nextDouble();
        System.out.println("Enter height");
        height = readin.nextDouble();
        
        can.radius = radius;
        can.height = height;
        
        can.setAtt();
        can.printAtt();
        
      } else
      
      if (temp == 4){
        
        Cone cookiesandcream = new Cone();
        System.out.println("You chose Cone:");
        System.out.println("Enter radius");
        radius = readin.nextDouble();
        System.out.println("Enter height");
        height = readin.nextDouble();
        
        cookiesandcream.radius = radius;
        cookiesandcream.height = height;
        
        cookiesandcream.setAtt();
        cookiesandcream.printAtt();
        
      } else
      
      if (temp == 5){
        
        Sphere ball = new Sphere();
        System.out.println("You chose Ball:");
        System.out.println("Enter the radius of the great circle");
        radius = readin.nextDouble();
        
        ball.radius = radius;
        
        ball.setAtt();
        ball.printAtt();
        
      }
      
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


