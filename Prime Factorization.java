import java.util.Scanner; // Calculates the Prime Factorization of any number > 1 given

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    int userinput;
    
    System.out.print("Enter a number above 1:");
    userinput = readin.nextInt();
    primeFact(userinput);
    
  }//end main
  
  public static void primeFact(int num)
  {
    Scanner readin = new Scanner(System.in);
    int i = 2;
    
    System.out.print(num + " = ");
    
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
    
    
  }//end primeFact
  
}//program end
