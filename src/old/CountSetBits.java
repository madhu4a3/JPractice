

package old;

public class CountSetBits
{
//count no.of set bits
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i = 3, count = 0;
		while (i > 0)
		{
			i &= i - 1;
			count++;
		}
		System.out.println(count);
	}

}
