class Main 
{
  public static void main(String[] args) 
  {
    Cylinder bob = new Cylinder();
    
    bob.radius = 5;
    bob.height = 5;
    
    bob.setAtt();
    bob.printAtt();
    
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
 /*
 public void printAtt(){
   
   System.out.println("The radius is: " + this.radius);
   System.out.println("The diameter is: " + this.diameter);
   System.out.println("The circumference is: " + this.circumference);
   System.out.println("The area is: " + this.area);
   
 }
  */
}


public class Cylinder
{
  public double radius, height, basearea, lateralarea, surfacearea, volume, diameter, circumference;
  
  // diameter, baseCircumference
  
  public void setAtt()
  {
    
    Circle base = new Circle();
    base.radius = this.radius;
    base.setAtt();
    this.basearea = base.area;
    this.diameter = base.diameter;
    this.circumference = base.circumference;
    Rectangle surface = new Rectangle();
    surface.length = base.circumference;
    surface.width = this.height;
    surface.setAtt();
    this.lateralarea = surface.area;
    this.surfacearea = this.lateralarea+(2*base.area);
    this.volume = base.area*this.height;
    
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
  /*
  public void printAtt(){
    
    System.out.println("The length is: " + this.length);
   System.out.println("The width is: " + this.width);
   System.out.println("The perimeter is: " + this.perimeter);
   System.out.println("The area is: " + this.area);
   System.out.println("The diagonal is: " + this.diagonal);
    
  }
  */
}
