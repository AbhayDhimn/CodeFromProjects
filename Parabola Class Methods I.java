import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    Parabola curve = new Parabola();
    double a = 1, b = 1, c = 0;
    
    curve.x(a, b);
    curve.y(a, b, c);
    
    System.out.println("Vertex = " + curve.xvertex + ", " + curve.yvertex);
    
  }
}

public class Parabola
{
  public double wideness, orientation, max, xvertex, yvertex, LOS, zero1 = -1, zero2 = 0, discriminant;
  
  public void x(double a, double b){
    
    xvertex = ((-1*b)/(2*a));
    
  }
  
  public void y(double a, double b, double c){
    
    yvertex = (((4*a*c)-(b*b))/(4*a));
    
  }
  
  
}
