class Main 
{
  public static void main(String[] args) 
  {
    int nums[] = {9, 23, 84, 22, 63, 51, 98, 12, 17, 40};
    //int bob[] = {9, 23, 84, 22, 63, 51, 98, 12, 17, 40};
    
    nums = bubbleSort(nums);
    printArr(nums);
  }
  
  public static int[] bubbleSort(int arr[])
  {
    for(int i=0; i < (arr.length-1); i++){
      for(int j = 0; j < (arr.length-1-i); j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
      return arr;
  }
  
  public static void printArr(int arr[])
  {
    
    for(int g = 0; g < arr.length; g++){
      System.out.print(arr[g] + ", ");
    }
    
  }
}
