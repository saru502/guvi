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
		int count1=0,count2=0;
		Scanner s=new Scanner(System.in);
		str=s.next();
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)==')')
		{
			count1=count1+1;
		}
		if(str.charAt(i)=='(')
		{
			count2=count2+1;
		}
		}
		if(count1==count2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
