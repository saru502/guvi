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
		String str;
		int l,n,i;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		l=str.length();
		char a[]=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)%2==0)
			{
				n=str.length()/2;
				a[n-1]='*';
				a[n]='*';
				for(i=0;i<str.length();i++)
				System.out.println(a[i]);
			}
			else
			{
				n=str.length()/2;
				a[n]='*';
				for(i=0;i<str.length();i++)
				System.out.println(a[i]);
			}
		}
	}
}
