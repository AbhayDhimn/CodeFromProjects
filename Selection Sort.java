class Main 
{
  public static void main(String[] args) 
  {
    int nums[] = {9, 23, 84, 22, 63, 51, 98, 12, 17, 40};
    
    System.out.println("Original Array:");
    for(int i = 0; i < nums.length; i++){
    System.out.print(nums[i] + ", ");
  }
  nums = sSort(nums);
    printArr(nums);
  }
  
  public static void printArr(int arr[])
  {
    /*for(int i = 0; i < arr.length; i++)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();*/
    System.out.println("");
    System.out.println("New, in order Array:");
    for(int g = 0; g < arr.length; g++){
      System.out.print(arr[g] + ", ");
    }
  }
  
  public static int[] sSort(int arr[])
  {
    int temp = 0;
    int min;
    
    for(int i = 0; i<arr.length; i++){
      min = i;
      for(int j = 1+i; j<arr.length; j++){
        if(arr[min] > arr[j]){
          min = j;
        }
      }
      temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
    //System.out.println(Arrays.toString(arr));
    return arr;
  }
}
