/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,max;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		
		{
			a[i]=Sc.nextInt();
		}
		max=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
			{
			max=a[i];
			}
		}
		System.out.println(max);
	}
}
