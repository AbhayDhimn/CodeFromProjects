class Main 
{
  public static void main(String[] args) 
  {
    int nums[] = {9, 23, 84, 22, 63, 51, 98, 12, 17, 40};
    //int bob[] = {9, 23, 84, 22, 63, 51, 98, 12, 17, 40};
    
    System.out.println("Original Array:");
    for(int i = 0; i < nums.length; i++){
    System.out.print(nums[i] + ", ");
  }
  nums = iSort(nums);
    printArr(nums);
  }
  
  public static void printArr(int arr[])
  {
    System.out.println("");
    System.out.println("New, in order Array:");
    for(int g = 0; g < arr.length; g++){
      System.out.print(arr[g] + ", ");
    }
  }
  
  public static int[] iSort(int arr[])
  {
    int temp;
    for(int l = 0; l < (arr.length-1); l++){
    for(int y = 0; y < (arr.length-1); y++){
      while(arr[y+1]<arr[y]){
        temp = arr[y];
        arr[y] = arr[y+1];
        arr[y+1] = temp;
      }
    }
    }
return arr;
  }
}
