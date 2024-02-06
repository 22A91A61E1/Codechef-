/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		        int X1=sc.nextInt();
		        int Y1=sc.nextInt();
		        int X2=sc.nextInt();
		        int Y2=sc.nextInt();
		        double a=Math.sqrt((X1*X1)+(Y1*Y1));
		        double b=Math.sqrt((X2*X2)+(Y2*Y2));
		        if(a==b)
		        {
		                System.out.println("Equal");
		        }
		        else if(a>b)
		        {
		                System.out.println("Alex");
		        }
		        else if(a<b)
		        {
		                System.out.println("Bob");
		        }
		}

	}
}
