class Main 
{
  public static void main(String[] args) 
  {
    char[][] chart = new char[3][3];
    
    chart[0][0] = '1';
    chart[0][1] = '2';
    chart[0][2] = '3';
    chart[1][0] = '4';
    chart[1][1] = '5';
    chart[1][2] = '6';
    chart[2][0] = '7';
    chart[2][1] = '8';
    chart[2][2] = '9';
    
    printGrid(chart);
  }
  
  public static void printGrid(char grid[][])
  {
    
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[i].length; j++){
        
        System.out.print(grid[i][j] + " ");
        
      }
          System.out.println();
    }
  }
}
