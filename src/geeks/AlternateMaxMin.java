package geeks;

import java.util.Arrays;

public class AlternateMaxMin {

	int[] arr = {1,2,3,4,5,6, 7};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlternateMaxMin amm = new AlternateMaxMin();
		for(int i: amm.arr){
			System.out.print(i+ " ");
		}
		System.out.println();
		amm.rearrange(amm.arr, amm.arr.length);
		for(int i: amm.arr){
			System.out.print(i+ " ");
		}
	}
	
	void rearrange(int arr[], int n)
	{
	    // Traverse through all numbers
	    for (int i=0; i<n; i++)
	    {
	        int temp = arr[i];
	 
	        int k = i;
	        // If number is negative then we have already
	        // processed it. Else process all numbers which
	        // are to be replaced by each other in cyclic way
	        while (temp > 0)
	        {
	            // Find the index where arr[i] should go
	            int j = (k < n/2)? 2*k + 1 : 2*(n-1-k);
	 
	            // If arr[i] is already at its correct
	            // position, mark it as negative
	            if (k == j)
	            {
	                arr[k] = -temp;
	                break;
	            }
	 
	            // Swap the number 'temp' with the current number
	            // at its target position
	            int t = arr[j];
	            arr[j] = temp;
	            temp = t; 
	 
	            // Mark the number as processed
	            arr[j] = -arr[j];
	 
	            // Next process the previous number at target position
	            k = j;
	        }
	    }
	 
	    // Change the number to original value
	    for (int i=0; i<n; i++)
	    	
	        arr[i] = -arr[i];
	}

}
