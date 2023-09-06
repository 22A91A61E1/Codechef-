 # Codechef-
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
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		        int X=sc.nextInt();
		        if(X<=100)
		        {
		                System.out.println(X);
		        }
		        else if(100<X && X<=1000)
		        {
		                System.out.println(X-25);
		        }
		        else if(1000<X && X<=5000)
		        {
		                System.out.println(X-100);
		        }
		        else
		        {
		                System.out.println(X-500);
		        }
		}
	}
}
