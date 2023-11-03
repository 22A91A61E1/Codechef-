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
		        int C=sc.nextInt();
		        if(A>B && B>C)
		        {
		                System.out.println(B);
		        }
		        else if(B>A && A>C)
		        {
		                System.out.println(A);
		        }
		        else if(C>A && A>B)
		        {
		                System.out.println(A);
		        }
		        else if(C>B && B>A)
		        {
		                System.out.println(B);
		        }
		        else if(A>C && C>B)
		        {
		                System.out.println(C);
		        }
		        else if(B>C && C>A)
		        {
		                System.out.println(C);
		        }
		}
	}
}
