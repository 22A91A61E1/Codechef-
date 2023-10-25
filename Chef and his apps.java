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
		        int S=sc.nextInt();
		        int X=sc.nextInt();
		        int Y=sc.nextInt();
		        int Z=sc.nextInt();
		        if(X+Y+Z<=S)
		        {
		                System.out.println("0");
		        }
		        else if((X+Z)<=S || (Y+Z)<=S)
		        {
		                System.out.println("1");
		        }
		        else{
		                System.out.println("2");
		        }
		        
		}
	}
}
