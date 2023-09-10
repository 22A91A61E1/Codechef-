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
		        if(N>=1 && N<=10)
		        {
		                System.out.println("Lower Double");
		        }
		        else if(N>=11 && N<=15)
		        {
		                System.out.println("Lower Single");
		        }
		        else if(N>=16 && N<=25)
		        {
		                System.out.println("Upper Double");
		        }
		        else{
		                System.out.println("Upper Single");
		        }
		}
	}
}
