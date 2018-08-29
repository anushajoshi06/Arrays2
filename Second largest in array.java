public class SecondLargest{	
	
	public static int secondLargestElement(int[] arr) {
		
      int largest = arr[0];
		int secondLargest = arr[0];
for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				 secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		return secondLargest;
	}
}