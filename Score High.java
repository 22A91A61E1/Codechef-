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
		        int na=sc.nextInt();
		        int nb=sc.nextInt();
		        int nc=sc.nextInt();
		        int nd=sc.nextInt();
		        int a=Math.max(na,nb);
		        int b=Math.max(nc,nd);
		        int high=Math.max(a,b);
		        System.out.println(high);
		}
	}
}
