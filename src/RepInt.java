



public class RepInt
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 3, 3, 4, 5, 5, 5 };
		//Set<Integer> setInterger = new HashSet<Integer>();

		/*
		 * int countOfInteger = 1; int repeatIntegerValue = 0; for (int j :
		 * intArray) { Boolean bool = setInterger.add(j); if (!bool) {
		 * repeatIntegerValue = j; countOfInteger++; } else if (bool &&
		 * countOfInteger > 1) { System.out.println(" value " +
		 * repeatIntegerValue + " count " + countOfInteger); countOfInteger = 1;
		 * } } if(countOfInteger > 1) { System.out.println(" value " +
		 * repeatIntegerValue + " count " + countOfInteger); } Collections.f
		 */

		int i = 0;
		int count = 1;
		for (;i < array.length;i++)
		{
			if (((i + 1) != array.length) && array[i] == array[i + 1])
			{
				count++;
			}
			else
			{
				System.out.println(array[i] + " is repeated " + count + " times");
				count = 1;
			}
			
		}
	}

}
