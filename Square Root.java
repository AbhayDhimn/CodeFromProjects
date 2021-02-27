import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double variable;
    Scanner readin = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    variable = readin.nextDouble();
    System.out.println(Math.sqrt(variable));
    
  }
}
