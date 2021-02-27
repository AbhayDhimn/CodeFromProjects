class Main 
{
  public static void main(String[] args) 
  {
    Cylinder can = new Cylinder(10, 5);
    can.printAtt();
  }
}


public class Circle
{
  
  
  
}


public class Cylinder
{
  public double radius, height, volume, lateralarea, basearea, basecircumference;
  
  public Cylinder(double radius, double height){
    
    this.radius = radius;
    this.height = height;
    this.basecircumference = Math.PI*radius*2;
    this.basearea = Math.PI*radius*radius;
    this.lateralarea = this.basecircumference*height;
    this.volume = this.basearea*height;
    
  }
  
  public Cylinder(){
    // BLANK CONTRUCTOR
  }
  
  public void setAtt(){
    
    this.basecircumference = Math.PI*this.radius*2;
    this.basearea = Math.PI*this.radius*this.radius;
    this.lateralarea = this.basecircumference*this.height;
    this.volume = this.basearea*this.height;
    
  }
  
  public void printAtt(){
    
    System.out.println("The cylinder's radius is: " + this.radius);
    System.out.println("The cylinder's height is: " + this.height);
    System.out.println("The cylinder's base circumference is: " + this.basecircumference);
    System.out.println("The cylinder's base area is: " + this.basearea);
    System.out.println("The cylinder's lateral area is: " + this.lateralarea);
    System.out.println("The cylinder's volume is: " + this.volume);
    
  }
  
}


public class Rectangle
{
  
  
  
}
