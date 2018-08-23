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
		int i,n=1;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for(i=0;i<str.length();i++)
		{
			if((str.charAt(i)=='0')||(str.charAt(i)=='1'))
			{
			flag=true;
			}
			else
			{
			flag=false;
			break;
		}
		}
	if(flag)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
}
}
