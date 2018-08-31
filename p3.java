/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int i,rev=0;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		while(i!=0)
		{
			rev=rev*10;
			rev=rev+i%10;
			i=i/10;
		}
		System.out.println(rev);
	}
}
