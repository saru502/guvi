/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,i,temp=0,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<k;i++)
		{
			temp=a[n-1];
			for(j=n-1;j>=0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
