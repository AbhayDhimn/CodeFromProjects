import java.util.Scanner;
import java.util.Random;
class Main 
{
  public static Deck deck = new Deck();
  
  public static void main(String[] args) 
  {
    int playernum = 1;
    
    Scanner readin = new Scanner(System.in);
    
    deck.initializeDeck();
    deck.shuffledeck();
    Card hand1[] = new Card[5];
    Card hand2[] = new Card[5];
    
    hand1 = poker(playernum);
    playernum = 2;
    hand2 = poker(playernum);
    System.out.println("Here comes the first player's deck:");
    printstuff(hand1);
    System.out.println("Here comes the second player's deck:");
    printstuff(hand2);

  }
  
  public static Card[] poker(int playernum){
    Random rand = new Random();
    //int cardnumber;
    Card temphand[] = new Card[5];
    
    for(int i = 0; i<temphand.length; i++){
    //cardnumber = rand.nextInt();
    
    temphand[i] = deck.cardz[playernum];
    playernum = playernum+2;
    
    }
    
    return temphand;
  }
  
  public static void printstuff(Card[] playerhand){
    
    for(int d = 0; d< playerhand.length; d++){
      System.out.println("Card " + (d+1) + ":");
    System.out.println("The card's facevalue is: " + playerhand[d].faceval);
    System.out.println("The card's color is: " + playerhand[d].color);
    System.out.println("The card's suit is: " + playerhand[d].suit);
  }
  System.out.println("_____________________________________");
  }
  
}


import java.util.Random;

public class Card
{
  public String faceval, color, suit, used;
  
  
}


import java.util.Random;
public class Deck
{
  public Card cards[] = new Card[52];
  public Card cardz[] = new Card[52];
  
  String value[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
  String suitchoice[] = {"Spades", "Diamonds", "Clubs", "Hearts"};
  
  public void initializeDeck()
  {
    int num=0;
    
    for(int i = 0; i<52; i++){
      Card card = new Card();
      cards[i] = card;
     }
    
    for (int i = 0; i<suitchoice.length; i++){
      for (int j = 0; j<value.length; j++){
        cards[num].suit = suitchoice[i];
        cards[num].faceval = value[j];
        
        if(cards[num].suit == "Spades"|| cards[num].suit == "Clubs"){
          cards[num].color = "Black";
        }else
        cards[num].color = "Red";
        
        num++;
      }
      
      
    }
    
  }
  
  public Card[] shuffledeck()
  {
    Random rand = new Random();
    int num1;
    for (int i = 0; i<cards.length; i++){
    do{
    num1 = rand.nextInt(cards.length);
    num1 = rand.nextInt(cards.length);

    }while(cards[num1].used == "Banana");
    cardz[i] = cards[num1];

    cards[num1].used = "Banana";
    }
    
    return cardz;
    
  }
  public void printcard(int numberboi){
    
    System.out.println("The card's facevalue is: " + cardz[numberboi].faceval);
    System.out.println("The card's color is: " + cardz[numberboi].color);
    System.out.println("The card's suit is: " + cardz[numberboi].suit);
    
  }
  
}


