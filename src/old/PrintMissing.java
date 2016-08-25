

package old;

import java.util.Arrays;


public class PrintMissing
{

	private static final int LIMIT = 100;

	static void printMissing(int[] l, int len)
	{
		Boolean[] seen = new Boolean[LIMIT];
		Arrays.fill(seen, false);
		for (int i = 0; i < len; i++)
		{
			if (l[i] < LIMIT)
			{
				seen[l[i]] = true;
			}
		}

		int i = 0;
		for (;i < LIMIT;)
		{
			// If i is missing
			if (seen[i] == false)
			{
				// Find if there are more missing elements after i
				int j;
				for (j = i + 1;j < LIMIT && seen[j] == false;j++);
					

				// Print missing single or range
				if (i + 1 == j)
				{
					System.out.println("" + i);
				}
				else
				{
					System.out.format("%d-%d\n", i, j - 1);
				}
				// Update u
				i = j;
			}
			else
				i++;
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 88, 105, 3, 2, 200, 0, 10 };

		printMissing(arr, arr.length - 1);

	}
}
