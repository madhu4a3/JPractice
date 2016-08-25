

package old;

public class LongestPalindrome
{
	public static void main(String args[])
	{
		String str = " hello . you uoy era woh..";
		char[] a = str.toCharArray();
		int low = Integer.MAX_VALUE;
		int upper = Integer.MIN_VALUE;
		System.out.println("low-->" + low + "\t" + "upper-->" + upper);
		System.out.println("upper-low-->" + (upper - low));

		for (int i = 0; i < str.length(); i++)
		{
			int start = i;
			int end = i;
			while (start >= 0 && end < str.length())
			{
				if (a[start] == a[end])
				{
					 System.out.println("start:"+start+"\t"+"end:"+end);
					 System.out.println("astart:"+a[start]+"\t"+"aend:"+a[end]);
					 System.out.println("upper-low-->"+(upper - low));
					System.out.println("end-start-->"+(end-start));
					if (end - start > upper - low)
					{
						upper = end;
						low = start;
					}
				

					end++;
					start--;
					System.out.format("exceuting end++ %d end and start dec %d\n",end,start);
				}
				else
				{
					break;
				}

			}

		}
		for (int i = 0; i < str.length(); i++)
		{
			int start = i;
			int end = i + 1;
			while (start >= 0 && end < str.length())
			{
				if (a[start] == a[end])
				{
					System.out.println("start:" + start + "\t" + "end:" + end);
					System.out.println("starta:" + a[start] + "\t" + "aend:" + a[end]);
					System.out.println("upper-low-->" + (upper - low));
					System.out.println("end-start-->" + (end - start));
					if (end - start > upper - low)
					{
						upper = end;
						low = start;
					}
					end++;
					start--;
				}
				else
				{
					break;
				}
			}

		}
		for (int i = low; i <= upper; i++)
		{
			System.out.print(a[i]);
		}
	}

}
