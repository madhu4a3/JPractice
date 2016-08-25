

package old;

public class Palindrome
{

	boolean isPalindrome(String s, int start, int end)
	{

		char[] str = s.toCharArray();
		boolean ispal = true;
		int i = start, j = end;
		System.out.print(ispal);
		for (; i < (str.length) / 2; i++, j--)
		{
			if (str[i] != str[j])
			{
				// String.format("%d-->%d", str[i],str[j]);
				System.out.print("si:" + str[i] + "-->" + "sj:" + str[j]);
				ispal = false;
				break;
			}
		}
		return ispal;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Palindrome pd = new Palindrome();
		boolean flag = pd.isPalindrome("aba", 0, ("aba".length()) - 1);
		if (flag)
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Given String is not a palindrome");
		}
	}

}
