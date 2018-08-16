/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int d=0,n,r;
	  Scanner s=new Scanner(System.in);
	  n=s.nextInt();
	  while(n>0)
	  {
	  r=n%10;
	  n=n/10;
	  d++;
	  }
	System.out.println(d);
}
}
