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
		        int N=sc.nextInt();
		        int X=sc.nextInt();
		        int P=sc.nextInt();
		        int a=N-X;
		        int r=X*3;
		        int m=a*4;
		        if(((N*3)-m)>=P)
		        {
		                System.out.println("PASS");
		        }
		        else{
		                System.out.println("FAIL");
		        }
		}
	}
}
