/*Quick Sort

Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 1000
Sample Input:
6 
2 6 8 5 4 3
Sample Output:
2 3 4 5 6 8
*/


public class Solution {
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
       quickSortt(input, 0, input.length - 1);
		
	}
  public static void quickSortt(int input[], int low, int high) 
    {
        int i = low, j = high;
        int temp;
        int pivot = input[(low + high) / 2];
 
        /** partition **/
        while (i <= j) 
        {
            while (input[i] < pivot)
                i++;
            while (input[j] > pivot)
                j--;
            if (i <= j) 
            {
                /** swap **/
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
 
                i++;
                j--;
            }
        }
 
        /** recursively sort lower half **/
        if (low < j)
            quickSortt(input, low, j);
        /** recursively sort upper half **/
        if (i < high)
            quickSortt(input, i, high);
    }
	
}