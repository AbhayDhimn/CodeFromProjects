import java.util.Scanner; // Calculates LCM or GCF, whichever you want, of 2 numbers

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    int num1, num2, GCF, LCM, big, small, choice = 0;
    
    System.out.print("Enter 1 for GCF or 2 for LCM:");
    choice = readin.nextInt();
    
    System.out.print("Enter 2 integers for your choice");
    num1 = readin.nextInt();
    num2 = readin.nextInt();
    
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
  
}//end prog
