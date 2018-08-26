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
		String s,r="";
		Scanner S=new Scanner(System.in);
		s=S.nextLine();
	{
		for(int i=s.length()-1;i>=0;i--)
		r=r+s.charAt(i);
	}
	if(s.equals(r))
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}
}
