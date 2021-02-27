import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
  Scanner readin = new Scanner(System.in);  
    int choice;
    double length, radius, CSA, CV, SSA, SV;
    
    System.out.print("Do you want to find the surface are and volume of a cube or a sphere? Enter 1 for cube or 2 for sphere:");
    choice = readin.nextInt();
    
    if (choice == 1){
      System.out.print("Enter the side length for the cube:");
      length = readin.nextDouble();
      CSA = cubeSA(length);
      CV = cubeV(length);
      System.out.println("");
      System.out.print("The Surface Area of the cube is " + CSA);
      System.out.println("");
      System.out.print("The Volume of the cube is " + CV);
    }
    
    if (choice == 2){
      System.out.print("Enter the radius for the sphere:");
      radius = readin.nextDouble();
      SSA = sphereSA(radius);
      SV = sphereV(radius);
      System.out.println("");
      System.out.print("The Surface Area of the sphere is " + SSA);
      System.out.println("");
      System.out.print("The Volume of the sphere is " + SV);
    }
    
  }//end main
  
  public static double cubeSA(double side)
  {
    Scanner readin = new Scanner(System.in);
    
    side = (side*side*6);
    
    return side;
    
  }//end cubeSA
  
  public static double cubeV(double side)
  {
    Scanner readin = new Scanner(System.in);
    
    side = (side*side*side);
    
    return side;
    
  }//end cubeV
  
  public static double sphereSA(double side)
  {
    Scanner readin = new Scanner(System.in);
    
    side = (4*Math.PI*side*side);
    
    return side;
    
  }//end sphereSA
  
  public static double sphereV(double side)
  {
    Scanner readin = new Scanner(System.in);
    
    side = ((4.0/3)*Math.PI*side*side*side);
    
    return side;
    
  }//end sphereV
}//end program
