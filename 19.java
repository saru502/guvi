/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,s=1,i;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		for(i=1;i<=n;i++)
		{
			s=s*i;
		}
		System.out.println(s);
	}
}