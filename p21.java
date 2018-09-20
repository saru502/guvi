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
		int x,y,x1,y1,x2,y2;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		x1=s.nextInt();
		y1=s.nextInt();
		x2=s.nextInt();
		y2=s.nextInt();
		a=(y1-y2)*x+(x1-x2)*y+(x2*y1-x1*y2);
		if(a=0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
