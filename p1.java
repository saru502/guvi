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
		int i;
		Scanner s=new Scanner(System.in);
		str=s.next();
		for(i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
	}
}
