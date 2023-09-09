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
		        int a=(((N*50)*20)/100)+(((N*50)*20)/100)+((N*50)*30)/100;
		        if((N*50)>a)
		        {
		                System.out.println((N*50)-a);
		        }
		        else
		        {
		                System.out.println(0);
		        }
		}
	}
}
