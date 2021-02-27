import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String Name;
    int ID, hoursWorked;
    double payRate, totalPay;
    Scanner readin = new Scanner(System.in);
    
    System.out.print("Enter name:");
    Name = readin.nextLine();
    System.out.print("Enter ID Number:");
    ID = readin.nextInt();
    System.out.print("Enter Pay Rate:");
    payRate = readin.nextDouble();
    System.out.print("Enter hours worked:");
    hoursWorked = readin.nextInt();
    
    totalPay = payRate*hoursWorked;
    
    System.out.println("Employee Name: " + Name);
    System.out.println("Employee ID Number: " + ID);
    System.out.println("Employee Total Pay: " + totalPay);
    
  }
}
