import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    int choice = 0, trichoice = 0;
    double side = 0, radius = 0, base = 0, height = 0, a = 0, b = 0, c = 0, length = 0, width = 0; 
    
    System.out.println("Enter 1 for square, 2 for circle, 3 for triangle, 4 for rectangle, 5 for cube, 6 for cone, or 7 for sphere");
    choice = readin.nextInt();
    
    switch (choice){
    case 1:
      
      System.out.println("Enter the side length");
      side = readin.nextDouble();
      Square box = new Square(side);
      box.printAtt();
      break;
    case 2:
      
      System.out.println("Enter the radius");
      radius = readin.nextDouble();
      Circle ball = new Circle(radius);
      ball.printAtt();
      break;
      
    case 3:
      while(trichoice<1 || trichoice>2){
      System.out.println("If you know the height, enter 1, if not, enter 2");
      trichoice = readin.nextInt();
      }
    
    if (trichoice == 1){
      System.out.println("Enter the base length:");
      base = readin.nextDouble();
      System.out.println("Enter the height:");
      height = readin.nextDouble();
      
      System.out.println("");
      Triangle triangle3 = new Triangle(base, height);
      //triangle.printAtt();
    }else
    if (trichoice == 2){
      System.out.println("Enter the base length:");
      a = readin.nextDouble();
      System.out.println("Enter the length of another side:");
      b = readin.nextDouble();
      System.out.println("Enter the length of the last side:");
      c = readin.nextDouble();
      
      System.out.println("");
      Triangle triangle2 = new Triangle(a, b, c);
      //triangle2.printAtt();
    }
    break;
    case 4:
      
      System.out.println("Enter length:");
      length = readin.nextDouble();
      System.out.println("Enter width:");
      width = readin.nextDouble();
      Rectangle weirdbox = new Rectangle(length, width);
      weirdbox.printAtt();
      break;
      
    case 5:
      
      System.out.println("Enter side length:");
      side = readin.nextDouble();
      Cube rubix = new Cube(side);
      rubix.printAtt();
      break;
      
    case 6:
      
      System.out.println("Enter the radius:");
      radius = readin.nextDouble();
      System.out.println("Enter the height:");
      height = readin.nextDouble();
      Cone icecream = new Cone(radius, height);
      icecream.printAtt();
      break;
      
    case 7:
      
      System.out.println("Enter the radius of the great circle:");
      radius = readin.nextDouble();
      Sphere roundball = new Sphere(radius);
      roundball.printAtt();
      
    }
  }
}


public class Circle
{
  public double radius, diameter, circumference, area;
 
 public Circle(double radius){
   
   this.radius = radius;
   this.diameter = this.radius*2;
   this.circumference = (Math.PI*(this.radius*2));
   this.area = (Math.PI*this.radius*this.radius);
   
 }
 
 public Circle(){
   //blank constructor
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
  public double radius, height, slantLength, surfaceArea, volume;
  
  public Cone(double radius, double height){
    this.radius = radius;
    this.height = height;
    Circle base = new Circle(radius);
    this.slantLength = Math.sqrt((height*height)+(radius*radius));
    this.surfaceArea = (slantLength*base.circumference)+base.area;
    this.volume = (base.area*height)/3;
  }
  
  public void printAtt(){
    
    System.out.println("The cone's radius is: " + this.radius);
    System.out.println("The cone's height is: " + this.height);
    System.out.println("The cone's slant length is: " + this.slantLength);
    System.out.println("The cone's surface area is: " + this.surfaceArea);
    System.out.println("The cone's volume is: " + this.volume);
    
  }
  
}


public class Cube
{
  public double side, faceDiagonal, facePerimeter, faceArea, surfaceArea, volume, diagonal;
  
  
  public Cube(double side){
    //Cube box = new Cube(3);
    
    this.side = side;
    this.faceDiagonal = side*Math.sqrt(2);
    this.facePerimeter = side*4;
    this.faceArea = side*side;
    this.surfaceArea = faceArea*6;
    this.volume = side*side*side;
    this.diagonal = Math.sqrt((side*side)+(faceDiagonal*faceDiagonal));
    
  }
  
  public Cube(){
    
    // blank contructor
    
  }
  
  public void printAtt(){
    
    System.out.println("The cube's side length is: " + this.side);
    System.out.println("The cube's face diagonal is: " + this.faceDiagonal);
    System.out.println("The cube's face perimeter is: " + this.facePerimeter);
    System.out.println("The cube's face area is: " + this.faceArea);
    System.out.println("The cube's surface area is: " + this.surfaceArea);
    System.out.println("The cube's volume is: " + this.volume);
    System.out.println("The cube's diagonal is: " + this.diagonal);
    
  }
  
}


public class Rectangle
{
  public double length, width, perimeter, area, diagonal;
  
  public void setAtt(){
    
    this.perimeter = (this.length*2)+(this.width*2);
    this.area = this.length*this.width;
    this.diagonal = Math.sqrt((this.length*this.length)+(this.width+this.width));
    
  }
  
  public Rectangle (double length, double width)
{
    this.length = length;
    this.width = width;
    this.perimeter = (length*2)+(width*2);
    this.area = length*width;
    this.diagonal = Math.sqrt((length*length)+(width+width));
}
  
  public Rectangle ()
{
    // blank constructor
}

  public void printAtt(){
    
    System.out.println("Length: " + this.length);
    System.out.println("Width: " + this.width);
    System.out.println("Perimeter: " + this.perimeter);
    System.out.println("Area: " + this.area);
    System.out.println("Diagonal: " + this.diagonal);
    System.out.println("_______________________________");
    
  }
  
}


public class Sphere
{
  public double radius, greatcircleperimeter, greatcirclearea, surfacearea, volume;
  
  public Sphere(double radius)
  {
    
    this.radius = radius;
    this.greatcircleperimeter = (Math.PI*this.radius*2);
    this.greatcirclearea = (Math.PI*this.radius*this.radius);
    this.surfacearea = (4*Math.PI*this.radius*this.radius);
    this.volume = ((4/3)*Math.PI*this.radius*this.radius*this.radius);
    
  }
  
  public Sphere(){
    //blank constructor
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
  double side, diagonal, perimeter, area;
  
  public Square(double side)
  {
    this.side = side;
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


public class Triangle
{
  public double sideA, sideB, sideC, base, height, perimeter, area, p, halfbase;
  
  public Triangle(){
    //blank constructor
  }
  
  public Triangle(double base, double height){
    this.height = height;
    this.base = base;
    this.area = (0.5)*base*height;
    System.out.println("The area is: " + this.area);
    }
  
  public Triangle(double a, double b, double c){
    this.base = a;
    this.sideA = a;
    this.sideB = b;
    this.sideC = c;
    this.p = (a+b+c)/2;
    this.area = (Math.sqrt(this.p*(this.p-a)*(this.p-b)*(this.p-c)));
    System.out.println("The area is: " + this.area);
    }
    
  /*public void printAtt(){
   System.out.println("The area is: " + this.area);
 }*/
}


