/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String n1,n2;
		int r1,r2;
		Scanner s=new Scanner(System.in);
		n1=s.next();
		n2=s.next();
		r1=n1.length();
		r2=n2.length();
		if(r1>r2)
		{
			System.out.println(n1);
		}
		else if(r1==r2)
		{
			System.out.println(n2);
		}
		else
		{
			System.out.println(n2);
		}
			
	}
}
