import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    int numrows;
    
    System.out.println("How many rows?");
    numrows = readin.nextInt();
    pyramid(numrows);
    
  }//end main
  
  public static void pyramid(int numRows)
  {
    
    for(int a=1; a<=numRows; a++){
      
      for (int d=1; d<=a; d++){
      System.out.print("*");
      }
      System.out.println("");
    }
    
    
  }//end pyramid

  
}//end prog
