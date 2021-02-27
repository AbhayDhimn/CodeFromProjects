import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
     Scanner readin = new Scanner(System.in);  
    int choice;
    double length, width, height, radius, CSA, CV, SSA, SV;
    
    System.out.print("Let's find Surface Area and Volume!!!(Yay!) Enter 1 for prism, 2 for cylinder, 3 for cube, or 4 for sphere:");
    choice = readin.nextInt();
    
    if (choice == 1){
      
      System.out.print("Enter the length for the prism:");
      length = readin.nextDouble();
      System.out.print("Enter the width for the prism:");
      width = readin.nextDouble();
      System.out.print("Enter the height for the prism:");
      height = readin.nextDouble();
      
      System.out.println("");
      System.out.print("The Volume of the prism is " + prismV(length, width, height));
      System.out.println("");
      System.out.print("The Surface Area of the prism is " + prismSA(length, width, height));
      
    }
    
    if (choice == 2){
      System.out.print("Enter the radius for the cylinder:");
      radius = readin.nextDouble();
      System.out.print("Enter the height for the cylinder:");
      height = readin.nextDouble();
      
      System.out.println("");
      System.out.print("The Volume of the cylinder is " + cylinderV(radius, height));
      System.out.println("");
      System.out.print("The Surface Area of the cylinder is " + cylinderSA(radius, height));
      
    }
    
    if (choice == 3){
      System.out.print("Enter the side length for the cube:");
      length = readin.nextDouble();
      CSA = cubeSA(length);
      CV = cubeV(length);
      System.out.println("");
      System.out.print("The Surface Area of the cube is " + CSA);
      System.out.println("");
      System.out.print("The Volume of the cube is " + CV);
    }
    
    if (choice == 4){
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
  
  public static double prismSA(double length, double width, double height)
  {
    double banana = (length+width+height)*2;
    
    return banana;
    
  }//end prismSA
  
  public static double prismV(double length, double width, double height)
  {
    double CV;
    CV = (length*width*height);
    
    return CV;
    
  }//end prismV
  
  public static double cylinderSA(double radius, double height)
  {
    double SSA = (2*Math.PI*radius*radius)+(2*Math.PI)-height;
    
    return SSA;
    
  }//end cylinderSA
  
  public static double cylinderV(double radius, double height)
  {
    double SV = (Math.PI*radius*radius*height);
    
    return SV;
    
  }//end cylinderV

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

}//end prog
