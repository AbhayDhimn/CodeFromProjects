class Main {
  public static void main(String[] args) {
    double legA, legB, hyp;
    legA = 3;
    hyp = 5;
    legB = Math.sqrt(Math.pow(hyp,2) - Math.pow(legA,2));
    System.out.print("The value of one leg being " + legA + ", and the value of the hypotenuse being " + hyp + ", the value of the remaining, or missing leg is " + legB);
    
    
  }
}
