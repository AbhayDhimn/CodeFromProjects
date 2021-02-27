import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner readin = new Scanner(System.in);
    int arr1[][] = new int[4][4];
    int arr2[][] = new int[4][4];
    
    arr1[0][0] = 3; arr1[0][1] = 5; arr1[0][2] = 10; arr1[0][3] = 9;
    arr1[1][0] = 1; arr1[1][1] = 2; arr1[1][2] = 8; arr1[1][3] = 6;
    arr1[2][0] = 11; arr1[2][1] = 4; arr1[2][2] = 21; arr1[2][3] = 7;
    arr1[3][0] = 123; arr1[3][1] = 456; arr1[3][2] = 789; arr1[3][3] = 0;
    
    System.out.println("Welcome to a program that sorts a grid/chart");
    System.out.println("");
    System.out.println("Original Grid:");
    printarr(arr1);
    System.out.println("");
    System.out.println("Sorted Grid:");
    arr2 = iSort(arr1);
    printarr(arr2);
    
  }
  
  public static void printarr(int arr[][]){
    
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println("");
    }
    
  }
  
  public static int[][] iSort(int arr[][])
  {
    int temp;
    int banana = 0;
    //for(int j = 0; j < arr[banana].length; j++){
    for(int l = 0; l < (arr[banana].length-1); l++){
      for(int i = 0; i < arr[banana].length; i++){
    for(int y = 0; y < (arr[banana].length-1); y++){
      while(arr[banana][y+1]<arr[banana][y]){
        temp = arr[banana][y];
        arr[banana][y] = arr[banana][y+1];
        arr[banana][y+1] = temp;
      }
    }
    }
      banana++;
    }
    
    int temp1;
    for(int l = 0; l < (arr[3].length-1); l++){
    for(int y = 0; y < (arr[3].length-1); y++){
      while(arr[3][y+1]<arr[3][y]){
        temp1 = arr[3][y];
        arr[3][y] = arr[3][y+1];
        arr[3][y+1] = temp1;
      }
    }
    }
    
    //}
return arr;
  }
  
}
