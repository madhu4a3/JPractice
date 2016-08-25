import java.util.Arrays;


public class MoveZeros
{

	public static void main(String[] args)
	{
		new MoveZeros().rearrangeZeros(new int[] { 0, 1, 0, 3, 12 });

	}

	public void rearrangeZeros(int[] a)
	{
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != 0)
			{
				a[count++] = a[i];
			}

		}
		while (count < a.length)
		{
			a[count++] = 0;
		}
		System.out.println(Arrays.toString(a));
	}
}
