

package old;

public class DupsWOBuffer
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		remDup(new char[] { 'a', 'a', 'k', 'j', 'a', 'i' });
	}

	public static void remDup(char[] str)
	{
		if (str == null)
			return;
		if (str.length < 2)
			return;
		int tail = 1;
		for (int i = 1; i < str.length; i++)
		{
			int j;
			for (j = 0; j < tail; j++)
			{
				//System.out.format("j is:%d  i is:%d ",j, i);
				if (str[i] == str[j])
				{
				//	System.out.println("Breaking at j: " + j);
					break;
				}

			}
			System.out.println("j is: "+j);
			if (j == tail)
			{
				System.out.format("now j is -->%d ,tail is ---> %d, i is --->%d", j, tail, i);
				System.out.println();
				str[tail] = str[i];
				++tail;
				System.out.format("After copy now j is -->%d ,tail is ---> %d, i is --->%d", j, tail, i);

			}
		}
		str[tail] = 0;
		System.out.println(str);
	}

}
