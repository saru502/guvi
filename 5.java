/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double n1,n2,n3;
		Scanner Sc=new Scanner(System.in);
		n1=Sc.nextDouble();
		n2=Sc.nextDouble();
		n3=Sc.nextDouble();
		if(n1>=n2 && n1>=n3)
		{
			System.out.println(n1);
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println(n2);
		}
		else
		System.out.println(n3);
	}
}
