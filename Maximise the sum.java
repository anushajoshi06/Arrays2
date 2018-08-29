public class Solution {

	public static long maximumSumPath(int[] input1, int[] input2) {
		
		 int  i = 0, j = 0;
			 
		
			 
			 int result = 0, sum1 = 0, sum2 = 0;
			 
			 while(i<input1.length &&j<input2.length)
			 {
				
				 if(input1[i] < input2[j])
				 {
					 sum1 += input1[i];
					 i += 1;
					 
				 }
				 
				 
				 else if(input1[i] > input2[j])
				 {
					 sum2 += input2[j];
					 j += 1;
				 }
				 
				 
				 else
				 {
					
					 if(sum1>sum2)
					 {
						 result += sum1;
					 } else {
						 result += sum2;
					 }
					 
					
					 sum1 = 0;
					 sum2 = 0;
					 
					  while(i<input1.length && j<input2.length && input1[i] == input2[j])
					 {
						 result += input1[i];
						 i += 1;
						 j += 1;
					 }
					 
					 
				 }
			 }
			 
					 while(i<input1.length)
			 {
				 sum1 += input1[i];
				 i += 1;
			 }
			 
			
			 while(j<input2.length)
			 {
				 sum2 += input2[j];
				 j += 1;
			 }
			 
			
			 if(sum1>sum2)
			 {
				 result += sum1;
			 } else {
				 result += sum2;
			 }
			 
			 return result;
	}
}