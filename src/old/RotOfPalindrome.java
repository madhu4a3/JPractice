

package old;

public class RotOfPalindrome
{

	public static boolean isPalindrome(String s)
	{
		boolean flag = true;
		for (int i=0,j=s.length()-1;i < j; i++, j--)
		{
			if (s.charAt(i) != s.charAt(j))
				flag = false;
		}

		return flag;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(isRotationOfPalindrome("aaaadc"));
	}

	public static boolean isRotationOfPalindrome(String sr)
	{

		// StringBuilder sb = new StringBuilder();
		if (isPalindrome(sr))
			return true;

		int n = sr.length();
		for (int i = 0; i < n - 1; i++)
		{

			String str1 = sr.substring(i + 1, n - i - 1);
			System.out.printf("Values of i+1: %d, n-i-1: %d\n", i+1, n-i-1);
			
			String str2 = sr.substring(0, i + 1);
			System.out.printf("String1: %s, String2: %s\n", str1, str2);
			// Check if this rotation is palindrome
			if (isPalindrome(str1 + str2))
				return true;
		}
		return false;

	}

}
