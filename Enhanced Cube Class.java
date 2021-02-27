import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Cube box = new Cube();
    Scanner readin = new Scanner(System.in);
    double side;
    
    System.out.println("Enter the side length for a cube and I will find the area, perimeter, and diagonal of one face, as well as the 3D diagonal, the surface area, and the volume: ");
    side = readin.nextDouble();
    box.side = side;
    
    box.setAtt();
    box.printAtt();
    
  }
}


public class Cube
{
  public double side, area, perimeter, sidediagonal, diagonal, surfacearea, volume;
  
  public void setAtt(){
    
    this.area = this.side*this.side;
    this.perimeter = this.side*4;
    this.sidediagonal = this.side*Math.sqrt(2);
    this.diagonal = Math.sqrt(Math.pow(this.side, 2)+Math.pow(this.sidediagonal, 2));
    this.surfacearea = this.area*6;
    this.volume = this.side*this.side*this.side;
    
  }
  
  public void printAtt(){
    
    System.out.println("The side length is: " + this.side);
    System.out.println("The area is: " + this.area);
    System.out.println("The perimeter is: " + this.perimeter);
    System.out.println("The side diagonal is: " + this.sidediagonal);
    System.out.println("The 3D diagonal is: " + this.diagonal);
    System.out.println("The surface area is: " + this.surfacearea);
    System.out.println("The volume is: " + this.volume);
    
  }
  
}
