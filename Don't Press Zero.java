import java.util.Scanner; // A game called "don't press zero". Just don't press zero

class Main {
  public static void main(String[] args) {
    Scanner readin = new Scanner(System.in);
    int num;
    Boolean notZero = true;
    
    System.out.println("Please enter a number that is not zero:");
      num = readin.nextInt();
    
    if (num == 0){
      notZero = false;
      System.out.print("Why would you pick zero? I asked you not to!");
    }
    
    if (num != 0){
      System.out.println("Great Job!");
    }
    
    while (notZero){
      
      System.out.println("Enter another number:");
      num = readin.nextInt();
      
      if (num==0){
        notZero = false;
        //System.out.print("WHAT DID I SAY?!?!?!?");
        System.out.print("Why would you pick zero? I asked you not to!");
      }
      else
      System.out.println("Great Job!");
      
    }
    
    
  }
}
