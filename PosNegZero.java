import java.util.Scanner; // Tells you whether a number is positive, negative, or zero

class Main {
  public static void main(String[] args) {
    double num;
    Scanner readin = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    num = readin.nextDouble();
    
    if(num<0){
      
      System.out.print(num + " is negative");
      
    }
    
    if(num>0){
      
      System.out.print(num + " is positive");
      
    }
    
    if(num==0){
      
      System.out.print("0 is neither positive nor negative");
      
    }
  }
}
