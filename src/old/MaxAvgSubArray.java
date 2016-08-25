

package old;

public class MaxAvgSubArray
{

	public static int findMaxAverage(int[] ar, int n, int k)
	{
		if (k > n)
			return -1;
		int max_sum, sum = ar[0], max_end;
		for (int i = 1; i < k; i++)
			sum += ar[i];
		max_sum = sum;
		max_end = k - 1;
		for (int i = k; i < n; i++)
		{
			sum = sum + ar[i] - ar[i - k];
			if (sum > max_sum)
			{
				max_sum = sum;
				max_end = i;
			}
		}
		return max_end - k + 1;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[] = { 78, 12, 1, -6, 50, 2 };
		int k = 4;
		System.out.println("Max Avg subarray begins at index:" + findMaxAverage(arr, arr.length, 2));

	}

}
