import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,q,r,total=0,s,i;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		q=Sc.nextInt();
		for(i=n+1;i<q;i++)
		{
			s=i;
			while(i!=0)
			{
				r=i%10;
				total=total+r*r*r;
				i=i/10;
			}
			if(s==total)
			{
				System.out.println(s+"");
			}
		}
	}
}
