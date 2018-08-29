public class BinarySearch{	
	
	public static int binarySearch(int[] arr, int num){
		//write your code here
		
		int start=0;
		int end= arr.length-1;


		while(start<=end) {
			int	mid=(start+end)/2;
			if(arr[mid]==num){
				return mid;
				
			}else if(arr[mid]<num){
				start=mid+1;
			}

			else{
				end=mid-1;

			}

		}	

		return -1;

    }
}