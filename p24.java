/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str;
		
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		str=s.next();
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)>='0' && str.charAt(i)<='9')
		{
			flag=true;
		
		}
		else
		{
		     break;
		}
		}
		if(flag==true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
			
	
