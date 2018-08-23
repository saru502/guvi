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
		int i,j,temp=0;
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(a[i]<a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		System.out.println(a[0]);
	}
}
