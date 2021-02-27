import java.util.Random;

class Main 
{
  public static void main(String[] args) 
  {
    int sodoku[][][][] = new int[3][3][3][3];
    Random rand = new Random();
    
    int arr1[][] = new int[3][3];
    arr1 = setgrids();
    int arr2[][] = new int[3][3];
    arr2 = setgrids();
    int arr3[][] = new int[3][3];
    arr3 = setgrids();
    int arr4[][] = new int[3][3];
    arr4 = setgrids();
    int arr5[][] = new int[3][3];
    arr5 = setgrids();
    int arr6[][] = new int[3][3];
    arr6 = setgrids();
    int arr7[][] = new int[3][3];
    arr7 = setgrids();
    int arr8[][] = new int[3][3];
    arr8 = setgrids();
    int arr9[][] = new int[3][3];
    arr9 = setgrids();
    
    sodoku[0][0] = arr1; sodoku[0][1] = arr2; sodoku[0][2] = arr3;
    sodoku[1][0] = arr4; sodoku[1][1] = arr5; sodoku[1][2] = arr6;
    sodoku[2][0] = arr7; sodoku[2][1] = arr8; sodoku[2][2] = arr9;
    
    /*for(int i = 0; i < sodoku.length; i++){
      for(int j = 0; j < sodoku[i].length; j++){
        sodoku[i][j] = 
      }
    }*/
    
  }
  
  public static int[][] setgrids(){
    int banana[][] = new int[3][3];
    int temp;
    Random rand = new Random();
    int box[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    
    for(int i = 0; i < banana.length; i++){
      for(int j = 0; j < banana[i].length; j++){
        //do{
        temp = rand.nextInt(8);
        temp++;
       // }while(temp!=box[0]&&temp!=box[1]&&temp!=box[2]&&temp!=box[3]&&temp!=box[4]&&temp!=box[5]&&temp!=box[6]&&temp!=box[7]&&temp!=box[8]);
          banana[i][j] = temp;
        
    }
  }
  return banana;
  }
}
