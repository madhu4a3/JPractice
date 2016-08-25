

package old;

public class Prime
{

	static int flag = 0;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		getNumbers(20);
	}

	static void getNumbers(int n)
	{
		int i;
		for (i = 2; i <= n / 2; ++i)
		{
			if (prime(i) != 0)
			{
				if (prime(n - i) != 0)
				{
					flag = 1;
					System.out.println("n: " + n + " i: " + i + " n minus i: " + (n - i));
					break;
				
				}

			}
		}
		if (flag == 0)
		{

			System.out.println("Can't be expressed as sum of two prime numbers");
		}

	}

	static int prime(int n) /* Function to check prime number */
	{
		int i, flag = 1;
		/*
		 *  // Corner cases
    if (n <= 1)  return 0;
    if (n <= 3)  return 1;
 
    // This is checked so that we can skip 
    // middle five numbers in below loop
    if (n%2 == 0 || n%3 == 0) return 0;
 
    for (int i=5; i*i<=n; i=i+6)
        if (n%i == 0 || n%(i+2) == 0)
           return 0;
 
    return 1;
		 */
		for (i = 2; i <= n / 2; ++i)
			if (n % i == 0){
				flag = 0;
				break;
			}
				
		// System.out.println("flag: " + flag);
		return flag;
	}

}
