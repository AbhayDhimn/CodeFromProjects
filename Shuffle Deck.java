class Main 
{
  public static void main(String[] args) 
  {
    //int box = {1, 2, 3};
    Deck deck = new Deck();
    
    deck.initializeDeck();
    deck.shuffledeck();
    
  }
}


import java.util.Random;

public class Card
{
  public String faceval, color, suit;
  /*int num1, num2;
  Random rand = new Random();
  
  public void setAtt(){
    
  String value[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
  String suitchoice[] = {"Spades", "Diamonds", "Clubs", "Hearts"};
  int num1 = rand.nextInt(13)+1;
  int num2 = rand.nextInt(4)+1;
  
  this.faceval = value[num2];
  this.suit = suitchoice[num1];
  if (this.suit =="Spades"||this.suit =="Clubs"){
    this.color = "Black";
  }else{
    this.color = "Red";
  }
  
  }
  
  public void printAtt(){
    
    System.out.println("The card's facevalue is: " + this.faceval);
    System.out.println("The card's color is: " + this.color);
    System.out.println("The card's suit is: " + this.suit);
    
  }
  */
}


import java.util.Random;
public class Deck
{
  public Card cards[] = new Card[52];
  
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
    /*
    for (int i = 0; i<cards.length; i++){
    System.out.println("The card's facevalue is: " + cards[i].faceval);
    System.out.println("The card's color is: " + cards[i].color);
    System.out.println("The card's suit is: " + cards[i].suit);
    System.out.println();
    }
    */
    
  }
  
 /* public void printDeck(){
    
    for (int i = 0; i<cards.length; i++){
    System.out.println("The card's facevalue is: " + cards[i].faceval);
    System.out.println("The card's color is: " + cards[i].color);
    System.out.println("The card's suit is: " + cards[i].suit);
    System.out.println();
    }
    
  }*/
  
  public void shuffledeck()
  {
    Random rand = new Random();
    int num1;
    for (int i = 0; i<cards.length; i++){
    do{
    num1 = rand.nextInt(cards.length);
    num1 = rand.nextInt(cards.length);
    //cards[num1];
    }while(cards[num1].suit == "Banana");
    System.out.println("The card's facevalue is: " + cards[num1].faceval);
    System.out.println("The card's color is: " + cards[num1].color);
    System.out.println("The card's suit is: " + cards[num1].suit);
    System.out.println();
    cards[num1].suit = "Banana";
    }
  }
}
