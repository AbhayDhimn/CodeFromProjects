import java.util.Scanner; // Prints your name vertically, with 1 letter per line

class Main {
  public static void main(String[] args) {
  String name;
  Scanner readin = new Scanner(System.in);
  
  System.out.println("Enter your name:");
  name = readin.nextLine();
  
  for (int a = 0; a<name.length(); a++){
    
    System.out.println(name.charAt(a));
    
  }
  
  }
}
