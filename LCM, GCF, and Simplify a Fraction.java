import java.util.Scanner; // Calculates LCM, GCF, or simplifies a given fraction

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    int num1 = 0, num2 = 0, GCF, LCM, big, small, choice = 0, num = 1, dum = 2;
    
    System.out.print("Enter 1 for GCF, 2 for LCM, or 3 for simplifying a fraction:");
    choice = readin.nextInt();
    
    if (choice==1||choice==2){
    System.out.print("Enter 2 integers for your choice");
    num1 = readin.nextInt();
    num2 = readin.nextInt();
    }else if (choice ==3){
      System.out.print("Enter numerator first, then denominator");
    num = readin.nextInt();
    dum = readin.nextInt();
    }
    
    if (num1>num2){
    big = num1;
    small = num2;
    }
    else{
    big = num2;
    small = num1;
    }
    
    if (choice == 1){
      GCF = gcf(big, small);
      System.out.print("The GCF is " + GCF);
    }
    
    if (choice == 2){
      LCM = lcm(big, small);
      System.out.print("The LCM is " + LCM);
    }
    
    if (choice == 3){
      simplify(num, dum);
    }
    
  }//end main
  
  public static int gcf(int a, int b)
  {
    Scanner readin = new Scanner(System.in);
    int i=0, gcf;
    
    for (i=1; i<=b; i++){
      if (a % i == 0 && b % i == 0){
        gcf = i;
      }
    }
   return i;
    
  }//end gcf
  
  public static int lcm(int a, int b)
  {
    Scanner readin = new Scanner(System.in);
    int i=0;
    int lcm, gcf=0;
    
    for (i=1; i<=b; i++){
      if (a % i == 0 && b % i == 0){
        gcf = i;
      }
    }
    
    lcm = (a*b)/gcf;
    return lcm;
    
  }//end lcm
  
  public static void simplify(int a, int b)
  {
    Scanner readin = new Scanner(System.in);
    int i=0, gcf = 0;
    
    for (i=1; i<=b; i++){
      if (a % i == 0 && b % i == 0){
        gcf = i;
      }
    }
    a = a/gcf;
    b = b/gcf;
    
   System.out.print("The simplified form of your fraction is " + a + " / " + b);
    
  }// end simplify
  
}//end prog
