class Main 
{
  public static void main(String[] args) 
  {
    int[][] grids[] = new int[3][3][3];
    int arr1[][] = new int[3][3];
    int arr2[][] = new int[3][3];
    int arr3[][] = new int[3][3];
    //grids[] = {{arr1[]}, {arr2[]}, {arr3[]}}
    
    arr1[0][0] = 3; arr1[0][1] = 5; arr1[0][2] = 10; //arr1[0][3] = 9;
    arr1[1][0] = 1; arr1[1][1] = 2; arr1[1][2] = 8; //arr1[1][3] = 6;
    arr1[2][0] = 11; arr1[2][1] = 4; arr1[2][2] = 21; //arr1[2][3] = 7;
    
    arr2[0][0] = 8; arr2[0][1] = 5; arr2[0][2] = 2; //arr2[0][3] = 9;
    arr2[1][0] = 6; arr2[1][1] = 7; arr2[1][2] = 1; //arr2[1][3] = 3;
    arr2[2][0] = 13; arr2[2][1] = 25; arr2[2][2] = 17; //arr2[2][3] = 4;
    
    arr3[0][0] = 3; arr3[0][1] = 5; arr3[0][2] = 10; //arr3[0][3] = 9;
    arr3[1][0] = 1; arr3[1][1] = 2; arr3[1][2] = 3; //arr3[1][3] = 4;
    arr3[2][0] = 5; arr3[2][1] = 6; arr3[2][2] = 7; //arr3[2][3] = 8;
    
    grids[0] = arr1;
    grids[1] = arr2;
    grids[2] = arr3;
    
    for(int banana = 0; banana< grids.length; banana++){
    printGrid(grids[banana], banana);
    }
    //create a new grid (2D array) and then store it in grids. Do this 3 times
  }
  
  public static void printGrid(int grid[][], int num)
  {
    //num is the number of the grid, it is used to distinguish which grid is being printed.
    System.out.println("Grid " + num + ": ");
    //outer loop for each row
    for(int row = 0; row < grid.length; row++)
    {
      //inner loop for each element in the column of the row
      for(int col = 0; col < grid[row].length; col++)
      {
        System.out.print(grid[row][col] + " ");
      }
      //new line for each row
      System.out.println();
    }
  }
}
