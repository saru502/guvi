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
		int r,n,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println(sum);
	}
}
