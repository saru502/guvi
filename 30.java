/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int h1,h2,m1,m2,d,h3,h4,n;
		Scanner Sc=new Scanner(System.in);
		h1=Sc.nextInt();
		m1=Sc.nextInt();
		h2=Sc.nextInt();
		m2=Sc.nextInt();
		h3=h1*60+m1;
		h4=h2*60+m2;
		d=h3-h4;
		n=d/60;
		d=d%60;
		System.out.println(n+" "+d);
	}
}
