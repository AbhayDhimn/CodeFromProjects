import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Dice banana = new Dice();
    int numSides, numRolls;
    Scanner readin = new Scanner(System.in);
    
    System.out.print("How many dice are you rolling?");
    numRolls = readin.nextInt();
    System.out.print("How many sides do the dice have?");
    numSides = readin.nextInt();
    
    for(int a = 1; a<=numRolls; a++){
      
      System.out.println("Dice Face Value: " + banana.roll(numSides));
      
    }
    
  }
}


import java.util.Random;
public class Dice
{
  public int numSides;
  public int faceValue;
  
  public int roll(int s)
  {
    Random rand = new Random();
    return rand.nextInt(s) + 1;
  }
}
