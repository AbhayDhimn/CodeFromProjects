class Main 
{
  public static void main(String[] args) 
  {
    Card license = new Card();
    
    license.faceval = "A";
    license.color = "red";
    license.suit = "diamonds";
    
    System.out.println("The card's facevalue is: " + license.faceval);
    System.out.println("The card's color is: " + license.color);
    System.out.println("The card's suit is: " + license.suit);
    
  }
}

public class Card
{
  String faceval, color, suit;
  
}

