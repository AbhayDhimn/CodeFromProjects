class Main 
{
  public static void main(String[] args) 
  {
    int arr[] = {14, 63, 22, 19, 85, 53, 42, 99, 11, 4};
    
    large(arr);
    small(arr);
  }
  
  public static void large(int arr[]){
    int large = 0;
    
    for(int i = 0; i< arr.length; i++){
      
      if (arr[i] > large){
        large = arr[i];
      }
      
    }
    
    System.out.println("The largest number is: " + large);
    
  }
  
  public static void small(int arr[]){
    int small = 99;
    for(int i= 0; i< arr.length; i++){
      
      if (arr[i] < small){
        small = arr[i];
      }
      
    }
    
    System.out.println("The smallest number is: " + small);
    
  }
  
}
