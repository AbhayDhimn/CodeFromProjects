import java.util.Scanner; // Tells whether a positive integer is prime or composite, gives the factors in ascending order, as well as the prime factorization

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    int userinput;
    
    System.out.println("Enter a positive integer");
    userinput = readin.nextInt();
    
    if (userinput ==1 ){
      evenOdd(userinput);
    } else if (userinput > 1){
      
      evenOdd(userinput);
      System.out.println(" ");
      prime(userinput);
      System.out.println(" ");
      factorsOf(userinput);
      System.out.println(" ");
      primeFactorization(userinput);
      
    }
    
  }
  
  public static void prime(int input)
  {
    
    int i=1;
    Boolean prime = true;
    
    while(i<input){
      i++;
      
    if (input%i == 0 && input !=i){
      prime = false;
    }
    
    }
    if (input==1){
      System.out.print(input + " is neither prime nor composite");
    }
    if (input!=1){
    if (prime==false){
      System.out.print(input + " is composite");
    }
    
    if (prime==true){
      System.out.print(input + " is prime");
    }
    }
    
  }
  
  public static void evenOdd(int x)
  {
    
    if (x % 2 == 0){
      //System.out.println("This number is Even!!! Yay!!!");
      System.out.println(x + " is Even");
    }
    else
    //System.out.println("This number is Odd!!! Yay!!!");
    System.out.println(x + " is Odd");
    
  }
  
  public static void factorsOf(int num)
  {
   
   System.out.print("Factors: ");
    Scanner readin = new Scanner(System.in);
    for(int a=1; a<=num; a++){
      
      if(num % a == 0){
        System.out.print(a);
      }
      if (num % (a+1) == 0){
        System.out.print(", ");
      }
    }
    
  }
  
  public static void primeFactorization(int num)
  {
    
    Scanner readin = new Scanner(System.in);
    int i = 2;
    
    System.out.print("Prime Factorization: " + num + " = ");
    
    while(num > i){
      
      if(num%i != 0){
        
        i++;
        
      }
      
      System.out.print(i);
      num = num/i;
        System.out.print(" * ");
      
    }
    
    if (i == num){
      System.out.print(i);
    }
    
  }
}
