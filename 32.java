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
		int i,n,count=0,word=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
			else
			{
				word++;
			}
		}
		System.out.println(word+1);
	}
}
