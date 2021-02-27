import java.util.Scanner; // Tells you which of 2 numbers is greater

class Main {
  public static void main(String[] args) {
    Scanner readin = new Scanner(System.in);
    double num1, num2, max;
    
    System.out.print("Enter a number:");
    num1 = readin.nextDouble();
    System.out.print("Enter a number:");
    num2 = readin.nextDouble();
    
    max = bigger(num1, num2);
    if(num1==num2){
      System.out.print("Both numbers are the same.");
    }else
    System.out.print(max + " is greater");
    
    
  }
  public static double bigger(double num1, double num2){
    double bigger = 0;
    
    if (num1 > num2){
      bigger = num1;
    }
    if (num2 > num1){
      bigger = num2;
    }
    
    
    return bigger;
  }
  
}
