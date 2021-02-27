import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    int userinput;
    
    System.out.print("How many rows?");
    userinput = readin.nextInt();
    centerPyramid(userinput);
    
  }//end main

  public static void centerPyramid(int numRows)
  {
   int numSpace = numRows-1;
   
    for(int a=1; a<=numRows; a++){
      
      for (int k=1; k<= numSpace; k++){
      System.out.print(" ");
      }
      for (int d=1; d<= (numRows - numSpace); d++){
        System.out.print("* ");
      }
      System.out.println("");
      numSpace--;
    }
    
  }//end centerPyramid
}//end prog
