

package old;

public class SimpInherit
{
	protected int a;
	protected int b;

	SimpInherit()
	{
	};

	SimpInherit(int d, int e)
	{
		a = d;
		System.out.println("a:" + a);
		b = e;
		System.out.println("b:" + b);
	}

	public void sum()
	{
	};

}

class FirSub extends SimpInherit
{
	public int c;

	FirSub()
	{
		super(0123, 6);
		c = 8;
		System.out.println("c:" + c);
	}

	@Override
	public void sum()
	{
		System.out.print("sum:");
		System.out.print(a + b + c);
	}

}

class SecSub extends FirSub
{
	public int d;

	SecSub()
	{
		d = 10;
		System.out.println("d:" + d);
	}

	@Override
	public void sum()
	{
		int sum = a + b + c + d;

		System.out.print("Sum:" + sum);
	}

	public void sub()
	{
	};
}
