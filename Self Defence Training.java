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
		        int n=sc.nextInt();
		        int arr[]=new int[n];
		        int j;
		        for(j=0;j<n;j++)
		        {
		                arr[j]=sc.nextInt();
		        }
		        int count=0;
		        for(j=0;j<n;j++)
		        {
		        if(arr[j]>=10 && arr[j]<=60)
		        {
		                count=count+1;
		        }
		        }
		        System.out.println(count);
		}
	}
}
