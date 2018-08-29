public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
		
       int min = arr[0], minindex=0;
    for (int i=0; i<arr.length; i++)
    {
        if (min > arr[i])
        {
            min = arr[i];
            minindex = i;
        }
    }
    return minindex;

	}
}