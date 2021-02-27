import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
     Scanner readin = new Scanner(System.in);  
    int choice;
    double length, width, height, radius, CSA, CV, SSA, SV;
    
    System.out.print("Do you want to find the surface area and volume of rectangular prism or a cylinder? Enter 1 for prism or 2 for cylinder:");
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

}//end prog
