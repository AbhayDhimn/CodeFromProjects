class Main 
{
  public static void main(String[] args) 
  {
    
    int beach[][] = new int[3][3];
    int count = 1;
    
    for(int i = 0; i < beach.length; i++){
      for(int j = 0; j < beach[i].length; j++){
        beach[i][j] = count;
        
        count++;
      }
    }
    printgrid(beach);
  }
  
  public static void printgrid(int grid[][]){
    
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[i].length; j++){
        
        System.out.print(grid[i][j] + " ");
        
      }
      System.out.println("");
    }
    
  }
  
}


