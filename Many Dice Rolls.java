class Main 
{
  public static void main(String[] args) 
  {
   
   int rolls = 50;
   Dice alpha = new Dice();
   Dice beta = new Dice();
   alpha.numSides = 6;
   beta.numSides = 6;
   for (int d = 1; d<=50; d++){
   System.out.println("Dice 1: "+ alpha.roll(6) +" Dice 2: " + beta.roll(6));
   }
    
  }
}

import java.util.Random;
public class Dice
{
  public int numSides = 6;
  public int faceValue;

  public int roll(int s)
  {
    
    Random rand = new Random();
    faceValue = rand.nextInt(s) + 1;
    return faceValue;
    
  }
}
