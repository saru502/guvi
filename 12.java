/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,t,p,r;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		t=n;
		p=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			p=p*10+r;
		}
		if(t==p)
		{
			System.out.println("yes");
		}
		else
		System.out.println("no");
	}
}
