import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    int[][] beach = new int[3][5];
    int count = 1, scalar;
    Scanner readin = new Scanner(System.in);
    
    for(int i = 0; i < beach.length; i++){
      for(int j = 0; j < beach[i].length; j++){
        beach[i][j] = count;
        
        count++;
      }
    }
    
    System.out.println("The grid is currently:");
    printgrid(beach);
    System.out.println("");
    System.out.println("Enter the scalar number:");
    scalar = readin.nextInt();
    beach = scalarMult(beach, scalar);
    printgrid(beach);
    
  }
  
  public static void printgrid(int grid[][])
  {
    for(int row = 0; row < grid.length; row++)
    {
      for(int col = 0; col < grid[row].length; col++)
      {
        System.out.print(grid[row][col] + " ");
      }
      System.out.println("");
    }
  }
  
  //scalar multiplication method
  public static int[][] scalarMult(int[][] grid, int scalar)
  {
    
    for(int i = 0; i<grid.length; i++){
      for(int j = 0; j<grid[i].length; j++){
        
        grid[i][j] = grid[i][j]*scalar;
        
      }
    }
    
    return grid;
    
  }
}
