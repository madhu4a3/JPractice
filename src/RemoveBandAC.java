import java.util.Arrays;

public class RemoveBandAC {
	static char[] ca = "react".toCharArray();
	
	public static void main(String[] args){
		stringFilter(ca);
		if(ca!=null)
		System.out.println(new String(ca));
	}
	
	static void stringFilter(char[] str)
	{
		int n = str.length;

		int i = -1; // previous character
		int j = 0; // current character

		while (j < n)
		{
			/* check if current and next character forms ac */
			if (j < n-1 && str[j] == 'a' && str[j+1] == 'c')
				j += 2;

			/* if current character is b */
			else if (str[j] == 'b')
				j++;

			/* if current char is 'c && last char in output
			is 'a' so delete both */
			else if (i >= 0 && str[j] == 'c' && str[i] == 'a'){
				i--;j++;
			}
				

			/* else copy curr char to output string */
			else
				str[++i] = str[j++];
		}
		for(;i<n-1;)
		str[++i] = 0;
	}
}