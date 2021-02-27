import java.util.Scanner; // Sums up all positive integers up to a given number

class Main {
  public static void main(String[] args) {
    Scanner readin = new Scanner(System.in);
    int num, sum=0;
    
    System.out.println("Enter a number to which you want the sum");
    num = readin.nextInt();
    
    for (int a=1; a<=num; a++){
      
      sum += a;
      
    }
    System.out.print("Sum = " + sum);
    
  }
}
