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
		int i,j,flag=1,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				for(j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						flag=0;
						break;
					}
				}
				if(flag==1)
				{
					System.out.println(i);
				}
			}
		}
	}
}
