import java.util.Scanner; // For all your Pythagorean Theorem Calculations (The right triangle theorem)

class Main 
{
  public static void main(String[] args) 
  {
    int userinput;
    Scanner readin = new Scanner(System.in);
    System.out.println("Do you wish to calculate a leg or a hypotenuse for a right triangle?");
    System.out.println("Enter 1 for leg or 2 for hypotenuse");
    userinput = readin.nextInt();
    
    if (userinput == 1){
      pythagLeg();
    }
    
    if (userinput == 2){
      pythagHyp();
    }
    
  }
  
  public static void pythagLeg()
  {
    double legA, legB, hyp;
    Scanner readin = new Scanner(System.in);
    
    System.out.println("You chose Leg");
    System.out.println("Enter the length of the known leg:");
    legA = readin.nextDouble();
    System.out.println("Enter the length of the hypotenuse:");
    hyp = readin.nextDouble();
    
    legB = Math.sqrt(Math.pow(hyp,2) - Math.pow(legA,2));
    System.out.print("The value of one leg being " + legA + ", and the value of the hypotenuse being " + hyp + ", the value of the remaining, or missing leg is " + legB);
  }
  
  public static void pythagHyp()
  {
   double legA, legB, hyp;
   Scanner readin = new Scanner(System.in);
   
   System.out.println("You chose Hypotenuse");
   System.out.println("Enter the length of one leg:");
   legA = readin.nextDouble();
   System.out.println("Enter the length of the other leg:");
   legB = readin.nextDouble();
   
    hyp = Math.sqrt(Math.pow(legA,2) + Math.pow(legB,2));
    System.out.print("The value of one leg being " + legA + ", and the value of the other leg being " + legB + ", the value of the hypotenuse is " + hyp); 
  }
}
