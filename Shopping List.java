import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner readin = new Scanner(System.in);
    
    String arr[] = {"Milk", "Awesomeness", "Confidence", "Bread", "Lucifer"};
    
    System.out.println("Shopping list:");
    
    for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + ", ");
    }
    
  }
}
