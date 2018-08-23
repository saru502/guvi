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
		int n=0,i;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		str=s.next();
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				flag=true;
			}
		}
			if(flag==true)
			{
				System.out.println("no");
			}
			else
			System.out.println("yes");
	}
}
