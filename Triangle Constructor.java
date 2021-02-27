import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    double choice;
    double base, height, a, b, c;
    
    System.out.println("Welcome to a program that finds the area of any triangle for you!");
    System.out.println("");
    System.out.println("If you know the height, enter 1, if not, enter 2");
    choice = readin.nextInt();
    
    if (choice == 1){
      System.out.println("Enter the base length:");
      base = readin.nextDouble();
      System.out.println("Enter the height:");
      height = readin.nextDouble();
      
      Triangle weirdoval1 = new Triangle(base, height);
      System.out.println("");
      System.out.println("The area of your triangle is...drumroll please... " + weirdoval1.area);
    }else
    if (choice == 2){
      System.out.println("Enter the base length:");
      a = readin.nextDouble();
      System.out.println("Enter the length of another side:");
      b = readin.nextDouble();
      System.out.println("Enter the length of the last side:");
      c = readin.nextDouble();
      
      Triangle weirdoval2 = new Triangle(a, b, c);
      System.out.println("");
      System.out.println("The area of your triangle is...drumroll please... " + weirdoval2.area);
    }
    
  }
}


public class Triangle
{
  public double sideA, sideB, sideC, base, height = 0, perimeter, area, p;
  
  public Triangle(){
    //blank constructor
  }
  
  public Triangle(double base, double height){
    this.height = height;
    this.base = base;
    this.area = (1/2)*base*height;
    }
  
  public Triangle(double a, double b, double c){
    this.base = a;
    this.sideA = a;
    this.sideB = b;
    this.sideC = c;
    this.p = (a+b+c)/2;
    this.area = Math.sqrt(this.p*(this.p-a)*(this.p-b)*(this.p-c));
    }
  
  /*
  public void heightknown(double base, double height){
    
    this.height = height;
    this.base = base;
    this.area = 0.5*base*height;
    
  }
  
  public void heron(double base, double a, double b, double c){
    
    this.base = base;
    this.sideA = a;
    this.sideB = b;
    this.sideC = c;
    this.p = (a+b+c)/2;
    this.area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    
  }
  */
}
