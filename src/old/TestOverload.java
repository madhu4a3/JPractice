

package old;

public class TestOverload
{

	/**
	 * @param args
	 */
	public void print(short e)
	{
		System.out.print(" i am short print-->" + e);
	}

	public void print(int a)
	{
		System.out.print("i am int print-->" + a);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i = 9;
		new TestOverload().print(i);

	}

}
