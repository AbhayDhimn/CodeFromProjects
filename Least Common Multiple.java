import java.util.Scanner; // Gives you the least common multiple of any given 2 numbers

class Main {
  public static void main(String[] args) {
    int big, lcm, num1, num2;
    int i=0;
    int gcf = 0;
    int small = 0;
    Scanner readin = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    num1 = readin.nextInt();
    System.out.println("Enter a number:");
    num2 = readin.nextInt();
    
    if (num1>num2){
    big = num1;
    small = num2;
    }
    else{
    big = num2;
    small = num1;
    }
    
    for (i=1; i<=small; i++){
      if (num1 % i == 0 && num2 % i == 0){
        gcf = i;
      }
    }
    
    lcm = (num1*num2)/gcf;
    
    //System.out.println("GCF: " + gcf);
    System.out.println("The LCM is " + lcm);
    
  }
}
