class Main 
{
  public static void main(String[] args) 
  {
    
    Dice banana = new Dice();
    banana.numSides = 6;
    
    System.out.print("A dice was rolled. The face value was " + banana.roll(6));
    
  }
}

import java.util.Random;
public class Dice
{
  public int numSides;
  public int faceVal;
  Random rand = new Random();
  
  public int roll(int s)
  {

    int roll = rand.nextInt(s) + 1;
    
    return roll;
    
  }
}
