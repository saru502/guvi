/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,p,q;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		p=n/60;
		q=n%60;
		System.out.println(p+" "+q);
	}
}
