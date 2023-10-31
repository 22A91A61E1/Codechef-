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
		        int x1=sc.nextInt();
		        int y1=sc.nextInt();
		        int x2=sc.nextInt();
		        int y2=sc.nextInt();
		        int m=x1-x2;
		        int n=y1-y2;
		        int a;
		        int b;
		        if(m>n)
		        {
		          if(n<0)
		         {
		               a=-n;
		               
		                       System.out.println(Math.max(m,a));
		               
		               
		         }
		        }
		        else if(n>m)
		        
		        {
		                if(m<0)
		                {
		                        b=-m;
		                        System.out.println(Math.max(n,b));
		                        
		                }
		        }
		        if(m>=0 && n>=0)
		        {
		                System.out.println(Math.max(m,n));
		        }
		        
		        
		        
		        
		}
	}
}
