/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,q,i,j,count=0;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		q=Sc.nextInt();
		for(i=n+1;i<q;i++)
		{
			for(j=2;j<=n;j++)
			{
				if(i%j==0)
				{
					count=0;
					break;
				}
				else
				{
					count=1;
				}
			}
			if(count==1)
			{
				System.out.println(i);
			}
		}
	}
}
