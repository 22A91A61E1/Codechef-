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
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        int c=21-a-b;
		        if(c>10)
		        {
		                System.out.println("-1");
		        }
		        else{
		                System.out.println(c);
		        }
		}
	}
}
