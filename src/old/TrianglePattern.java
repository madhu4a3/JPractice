

package old;

public class TrianglePattern
{

	/**
	 * @param args
	 */
	public void createTP()
	{
		int k = 1;
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < i + 1; j++)
			{
				System.out.print(" " + (k++));
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TrianglePattern tp = new TrianglePattern();
		tp.createTP();
	}

}
