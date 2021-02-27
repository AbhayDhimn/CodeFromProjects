class Main 
{
  public static void main(String[] args) 
  {
    Cone needle = new Cone(3, 5);
    
    needle.printAtt();
    
  }
}


public class Circle
{
  public double radius, area, diameter, circumference;
  public Circle(double radius){
    
    this.radius  = radius;
    this.area = (Math.PI*radius*radius);
    this.diameter = 2*radius;
    this.circumference = Math.PI*this.diameter;
    
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


