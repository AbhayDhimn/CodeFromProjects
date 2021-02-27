import java.util.Scanner; // Uses the pythagorean theorem to tell what type of triangle a triangle is, given the measurements of the sides

class Main {
  public static void main(String[] args) {
    double a, b, c;
    double s1=0;
    double s2=0;
    double hyp=0;
    Scanner readin = new Scanner(System.in);
    
    System.out.println("Enter a side:");
    a = readin.nextDouble();
    System.out.println("Enter a side:");
    b = readin.nextDouble();
    System.out.println("Enter a side:");
    c = readin.nextDouble();
    
    if (a>b&&a>c){
      
      hyp = a;
      s1 = b;
      s2 = c;
      
    }
    
    if (b>a&&b>c){
      
      hyp = b;
      s1 = a;
      s2 = c;
      
    }
    
    if (c>a&&c>b){
      
      hyp = c;
      s1 = a;
      s2 = b;
      
    }
    
    if (Math.pow(s1,2)+Math.pow(s2,2)>Math.pow(hyp,2)){
      
      System.out.println("The triangle is an acute triangle");
      
    }
    
    if (Math.pow(s1,2)+Math.pow(s2,2)<Math.pow(hyp,2)){
      
      System.out.println("The triangle is an obtuse triangle");
      
    }
    
    if (Math.pow(s1,2)+Math.pow(s2,2)==Math.pow(hyp,2)){
      
      System.out.println("The triangle is a right triangle");
      
    }
    
  }
}
