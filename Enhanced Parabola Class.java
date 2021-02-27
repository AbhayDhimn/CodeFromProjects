import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    double a, b, c;
    Parabola curve = new Parabola();
    
    System.out.println("Welcome to a program that uses the a, b, and c values of a parabola to find the vertex, discriminant, and zeroes");
    System.out.println();
    System.out.println("Enter the a value: ");
    a = readin.nextDouble();
    System.out.println("Enter the b value: ");
    b = readin.nextDouble();
    System.out.println("Enter the c value: ");
    c = readin.nextDouble();
    
    curve.a = a;
    curve.b = b;
    curve.c = c;
    
    curve.setAtt();
    curve.printAtt();
    
  }
}


public class Parabola
{
  public double wideness, orientation, max, xvertex, yvertex, LOS, zero1, zero2, discriminant, a, b, c;
  
  public void setAtt(){
    
    this.xvertex = ((-1*this.b)/(2*this.a));
    this.yvertex = (((4*this.a*this.c)-(this.b*this.b))/(4*this.a));
    this.discriminant = ((this.b*this.b)-(4*this.a*this.c));
    this.zero1 = ((-1*this.b)+(Math.sqrt(this.discriminant)))/(2*this.a);
    this.zero2 = ((-1*this.b)-(Math.sqrt(this.discriminant)))/(2*this.a);
    
  }
  
  public void printAtt(){
    
    System.out.println("Here are the results: ");
    System.out.println();
    System.out.println("The a value is: "+this.a);
    System.out.println("The b value is: "+this.b);
    System.out.println("The c value is: "+this.c);
    System.out.println();
    /*System.out.println("The vertex is at ("+this.xvertex+", "+this.yvertex+")");
    System.out.println("The discriminant is: "+this.discriminant);
    System.out.println("The zero1 is: "+this.zero1);
    System.out.println("The zero2 is: "+this.zero2);*/
    
    System.out.println("Vertex = " + this.xvertex + ", " + this.yvertex);
    System.out.println("Discriminant = " + this.discriminant);
    if((this.discriminant)>0){
    System.out.println("Zeroes are: " + this.zero1 + ", and " + this.zero2);
    }else if((this.discriminant)==0){
    System.out.println("Zeroes is: " + this.zero1);
    }
    System.out.println("Equation = " + a + "x^2 + " + b + "x + " + c);
    if(a>0){
      System.out.println("The parabola opens upward");
    }
    if(a<0){
      System.out.println("The parabola opens downward");
    }
    if (Math.abs(a)<1 && Math.abs(a)>0){
    System.out.println("This parabola is wide");
    }else if (Math.abs(a)>1){
      System.out.println("This parabola is skinny");
    }
    System.out.println("The line of symmetry is at " + this.xvertex);
    if(a>0){
      System.out.println("The Minimum is at y = " + this.yvertex);
    } else if(a<0){
      System.out.println("The Maximum is at y = " + this.yvertex);
    }
    
  }
  
}
