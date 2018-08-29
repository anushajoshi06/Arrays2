public class ArrayEquilibrium{	
	
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
      int i, j;
  int leftsum, rightsum;
 
 
  for ( i = 0; i < arr.length; i++)
  {
    leftsum = 0;  
    rightsum = 0; 
    for ( j = 0; j < i; j++)
      leftsum  += arr[j];
 
  
    for( j = i+1; j < arr.length; j++)
      rightsum += arr[j];
 
    
    if (leftsum == rightsum)
      return i;
    }
 
 
  return -1;
	}
}