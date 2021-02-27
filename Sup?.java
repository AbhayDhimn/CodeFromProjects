import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner readin = new Scanner(System.in);
    String banana, name;

    System.out.println("Hi, what's your name?");
    name = readin.nextLine();
    System.out.println("Sup " + name + "?");
    banana = readin.nextLine();
    System.out.println("Nice. I'm good, too, thanks for asking *turns away, upset");
  }
}
