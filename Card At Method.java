import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    //int box = {1, 2, 3};
    Deck deck = new Deck();
    Scanner readin = new Scanner(System.in);
    int userinput, userinput1, userinput2, userinput3, userinput4;
    
    deck.initializeDeck();
    deck.shuffledeck();
    
    System.out.println("Enter the card number for the first card you want");
    userinput = readin.nextInt();
    System.out.println("Enter the card number for the second card you want");
    userinput1 = readin.nextInt();
    System.out.println("Enter the card number for the thirdcard you want");
    userinput2 = readin.nextInt();
    System.out.println("Enter the card number for the fourthcard you want");
    userinput3 = readin.nextInt();
    System.out.println("Enter the card number for the fifth card you want");
    userinput4 = readin.nextInt();
    userinput = userinput-1;
    userinput1 = userinput1-1;
    userinput2 = userinput2-1;
    userinput3 = userinput3-1;
    userinput4 = userinput4-1;
    
    System.out.println("_________________________");
    deck.printcard(userinput);
    System.out.println("_________________________");
    deck.printcard(userinput1);
    System.out.println("_________________________");
    deck.printcard(userinput2);
    System.out.println("_________________________");
    deck.printcard(userinput3);
    System.out.println("_________________________");
    deck.printcard(userinput4);
    System.out.println("_________________________");
    
  }
}


import java.util.Random;

public class Card
{
  public String faceval, color, suit, used;
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
  */
  
  
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
  
  public Card[] shuffledeck()
  {
    Random rand = new Random();
    int num1;
    for (int i = 0; i<cards.length; i++){
    do{
    num1 = rand.nextInt(cards.length);
    num1 = rand.nextInt(cards.length);
    //cards[num1];
    }while(cards[num1].used == "Banana");
    cardz[i] = cards[num1];
    /*System.out.println("The card's facevalue is: " + cards[num1].faceval);
    System.out.println("The card's color is: " + cards[num1].color);
    System.out.println("The card's suit is: " + cards[num1].suit);
    System.out.println();*/
    cards[num1].used = "Banana";
    }
    
    return cardz;
    
  }
  public void printcard(int numberboi){
    
    System.out.println("The card's facevalue is: " + cardz[numberboi].faceval);
    System.out.println("The card's color is: " + cardz[numberboi].color);
    System.out.println("The card's suit is: " + cardz[numberboi].suit);
    
  }
  
  //public Card cardat()
  //{
    
    
    
  //}
  
}
