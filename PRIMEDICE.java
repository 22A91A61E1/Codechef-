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
		        int n=A+B;
		        int cnt=0;
		        for(int j=1;j<=n;j++)
		        {
		        
		                if(n%j==0)
		                {
		                        cnt=cnt+1;
		                }
		        }
		        if(cnt==2)
		        {
		                System.out.println("Alice");
		        }
		        else{
		                System.out.println("Bob");
		        }
		}
		
	}
}
