import java.util.Scanner;

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
