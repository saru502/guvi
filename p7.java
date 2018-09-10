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
		char temp=0;
		int i;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		char a[]=str.toCharArray();
		int l=str.length();
		for( i=0;i<l;i+=2)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(i=0;i<l;i++)
		System.out.println(a[i]);
		
	}
}


