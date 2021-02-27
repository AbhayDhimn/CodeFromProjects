import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner readin = new Scanner(System.in);
    int num, count = 1;
    Boolean prime = true;

    System.out.print("Enter a number:");
    num = readin.nextInt();

    while (count<num){
      count++;
      if (num%count==0&&count!=num){
        prime = false;
      }
    }
    if (num==1){
      System.out.println("1 is neither prime nor composite");
    }
    else if (prime){
      System.out.println(num+" is prime");
    }
    else{
      System.out.println(num+" is composite");
    }

  }
}
