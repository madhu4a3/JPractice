

package old;

public class StrConcat
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String a = "madhu";
		String b = "kiran";
		int resLength = a.length() + b.length();
		char[] res = new char[resLength];
		int j = 0, i = 0;

		for (; j < a.length(); j++, i++)
		{
			res[i] = a.charAt(j);
		}

		 j = 0;
		System.out.println(new String(res));

		for (; i < resLength && j < b.length(); j++, i++)
		{
			// System.out.println("i is: " + i);

			res[i] = b.charAt(j);

		}

		System.out.println(new String(res));
	}
}
