import java.util.Scanner; // Prints out all possible value combinations of 2 dice

class Main {
  public static void main(String[] args) {
    
    for(int a=0; a<=6; a++){
      for (int d=0; d<=6; d++){
        System.out.println(a+" , "+d);
      }
    }
    
  }
}
