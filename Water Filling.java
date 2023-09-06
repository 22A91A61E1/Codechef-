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
		        int B1=sc.nextInt();
		        int B2=sc.nextInt();
		        int B3=sc.nextInt();
		        if((B1==0 && B2==0) || (B2==0 && B3==0) || (B3==0 && B1==0))
		        {
		                System.out.println("Water filling time");
		        }
		        else{
		                System.out.println("Not now");
		        }
		}
		        
	}
}
