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
		int m,n;
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		if(m%2==0)
		{
			n=m/2;
			System.out.println(n);
		}
		else
		System.out.println(m);
	}
}
