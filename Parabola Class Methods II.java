import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    Parabola curve = new Parabola();
    double a = 1, b = 1, c = 0;
    
    System.out.print("Enter the a value");
    a = readin.nextDouble();
    System.out.print("Enter the b value");
    b = readin.nextDouble();
    System.out.print("Enter the c value");
    c = readin.nextDouble();
    
    curve.x(a, b);
    curve.y(a, b, c);
    curve.discriminant(a, b, c);
    curve.zero1(a, b, c);
    curve.zero2(a, b, c);
    
    System.out.println("Vertex = " + curve.xvertex + ", " + curve.yvertex);
    System.out.println("Discriminant = " + curve.discriminant);
    if((curve.discriminant)>0){
    System.out.println("Zeroes are: " + curve.zero1 + ", and " + curve.zero2);
    }else if((curve.discriminant)==0){
    System.out.println("Zeroes is: " + curve.zero1);
    }
    
  }
}

public class Parabola
{
  public double wideness, orientation, max, xvertex, yvertex, LOS, zero1, zero2, discriminant;
  
  public void x(double a, double b){
    
    xvertex = ((-1*b)/(2*a));
    
  }
  
  public void y(double a, double b, double c){
    
    yvertex = (((4*a*c)-(b*b))/(4*a));
    
  }
  
  public void discriminant(double a, double b, double c){
    
    discriminant = ((b*b)-(4*a*c));
    
  }
  
  public void zero1(double a, double b, double c){
    
    discriminant = ((b*b)-(4*a*c));
    zero1 = (((-1*b)+(Math.sqrt(discriminant)))/(2/a));
    
  }
  
  public void zero2(double a, double b, double c){
    
    discriminant = ((b*b)-(4*a*c));
    zero2 = (((-1*b)-(Math.sqrt(discriminant)))/(2/a));
    
  }
  
}
