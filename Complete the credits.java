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
		        int X=sc.nextInt();
		        if(X>65)
		        {
		                System.out.println("Overload");
		        }
		        else if(X<35)
		        {
		                System.out.println("Underload");
		        }
		        else if(X<=65 && X>=35)
		        {
		                System.out.println("Normal");
		        }
		        
		}
		{
		        
		}
	}
}
