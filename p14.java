
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
		String s1,s2,s3;
		int i;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		s1=s.next();
		s2=s1.replaceAll("[aeiouAEIOU]","");
		s3=new StringBuilder(s2).reverse().toString();
		System.out.println(s3);
	}
}
