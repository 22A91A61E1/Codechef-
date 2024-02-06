/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int x1=sc.nextInt();
		    int x2=sc.nextInt();
		    int y1=sc.nextInt();
		    int y2=sc.nextInt();
		    double d1=Math.sqrt(x1*x1+x2*x2);
		    double d2=Math.sqrt(y1*y1+y2*y2);
		    if(d1==d2)
		       System.out.println("EQUAL");
		    else if(d1>d2)
		       System.out.println("AlEX");
		    else 
		       System.out.println("BOB");
		}
	}
}
