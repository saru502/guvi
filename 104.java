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
		int n,k,p,a,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		p=n;
		for(i=0;i<k-1;i++)
		{
			n=p*n;
		}
		System.out.println(n);
	}
}