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
		int a,i=2;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		while(i<=a)
		{
			if(i==a)
			{
			System.out.println("yes");
			break;
		}
		i=i*2;
		}
		if(i!=a)
		{
			System.out.println("no");
		}
	}
}
