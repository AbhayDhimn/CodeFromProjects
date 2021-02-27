class Main 
{
  public static void main(String[] args) 
  {
    //int arr[] = new int[10];
    int arr[] = {9, 23, 84, 22, 63, 51, 98, 12, 17, 40};
    
    method(arr);
    
    for(int i = 0; i< arr.length; i++){
      System.out.print(arr[i] + ", ");
    }
    
  }
  
  public static void method(int arr[]){
    int banana;
    
    for(int i = 0; i< arr.length ; i++){
      for (int j = i+1; j < arr.length; j++){
        if (arr[i] > arr[j]){
          banana = arr[i];
          arr[i] = arr[j];
          arr[j] = banana;
        }
        
      }
      
    }
    
  }
  
}
