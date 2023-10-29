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
		        int N=sc.nextInt();
		        int A=sc.nextInt();
		        int B=sc.nextInt();
		        int sum=0;
		        int flag=0;
		        int i;
		        for(i=1;i<=N;i++)
		        {
		                
		                if(i%2==0)
		                {
		                     sum=sum+1;   
		                }
		                else if(i%2!=0)
		                {
		                        flag=flag+1;
		                }
		                
		        }
		        System.out.println((sum*A)+(flag*B));
		}
	}
}
