import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    char letter;
    String word = "Computer";
    for( int y = 0; y< 8 ; y++){
    System.out.print(toUpper(word.charAt(y)));
}
  }
  
  public static char toUpper(char letter){
    //int ascii = 0;
    //char banana = 'g';
    
    char caps[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    char lower[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    
    for (int i = 0; i<26; i++){
      if(caps[i]==letter){
        return letter;
      }else if(lower[i]==letter){
        //ascii = letter-32;
        letter = caps[i];
        return letter;
      }
    }
 return letter;
  }
  
}
