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
		        int A=sc.nextInt();
		        int B=sc.nextInt();
		        int c=(A*100)/100;
		        int d=(B*200)/100;
		        int e=100-c;
		        int f=200-d;
		        if(e>f)
		        {
		                System.out.println("SECOND");;
		        }
		        else if(e<f)
		        {
		                System.out.println("FIRST");
		        }
		        else{
		                System.out.println("BOTH");
		        }
		}
	}
}
