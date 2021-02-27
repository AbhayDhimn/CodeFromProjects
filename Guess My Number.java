import java.util.Scanner; // I'm going to think of a number. You guess it.
import java.util.Random; // Outputs how many tries it took as well, when you get it

class Main {
  public static void main(String[] args) {
    Scanner readin = new Scanner(System.in);
    Random rand = new Random();
    int banana, guess=0, numguess=0;
    banana = rand.nextInt(100) + 1;

    while(guess != banana){
    System.out.println("Guess a number");
    guess = readin.nextInt();

    if (guess == banana){
      System.out.println("Good Job, Boi!!! You gots it!!! In " + numguess + " guesses!!!");
    }
    else if(guess < banana){
    System.out.println("Go higher");
    }else if(guess > banana){
      System.out.println("Go lower");
    }
    
    numguess++;
    
  }
  }
}
