/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int s,e,i;
		Scanner Sc=new Scanner(System.in);
		s=Sc.nextInt();
		e=Sc.nextInt();
		for(i=s+1;i<=e;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+"\t");
			}
		}
	}
}
