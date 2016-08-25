

package old;

public class TurnOffBitN
{

	public static int turnOFFK(int num, int k)
	{

		if (k <= 0)
			return num;

		return num & ~(1 << k - 1);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(turnOFFK(4, 2));

	}

}
