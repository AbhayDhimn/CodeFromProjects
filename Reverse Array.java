import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    int numelements;
    //int arr[] = new int[10];
    
    System.out.println("Enter the number of numbers you have");
    numelements = readin.nextInt();
    
    int arr[] = new int[numelements];
    
    for(int i = 0; i < arr.length; i++){
      System.out.print("Enter a number:");
      arr[i] = readin.nextInt();
    }
    
    for (int j = (arr.length - 1); j>=0; j--){
      System.out.print(arr[j] + ", ");
    }
    
  }
}
