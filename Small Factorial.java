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
		for(int j=0;j<T;j++)
		{
		        
		        int n=sc.nextInt();
		        int sum=1;
		        for(int i=n;i>=1;i--)
		        {
		               sum=sum*i; 
		        }
		        System.out.println(sum);
		        
		}
	}
}
