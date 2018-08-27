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
		int n,m,gcd=0,i,lcm;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		for(i=1;i<=n && i<=m;i++)
		{
			if(n%i==0 && m%i==0)
			{
				gcd=i;
			}
		}
			lcm=(n*m)/gcd;
			
		
			System.out.println(lcm);
	}
}
