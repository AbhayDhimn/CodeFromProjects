import java.util.Scanner; // original draft of guess my number
import java.util.Random; // Does not return number of guesses

class Main {
  public static void main(String[] args) {
    Scanner readin = new Scanner(System.in);
    Random rand = new Random();
    int banana, guess;
    banana = rand.nextInt(100) + 1;

    while(guess != banana){
    System.out.println("Guess a number");
    guess = readin.nextInt();

    if (guess == banana){
      System.out.println("Good Job, Boi!!!");
    }
    else
    System.out.println("Sorry, try again");
    
  }
  }
}
