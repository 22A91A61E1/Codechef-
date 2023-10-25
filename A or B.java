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
		        int A=sc.nextInt();
		        int B=sc.nextInt();
		        //int X=500;
		        //int B=1000;
		        int r;
		        int s;
		        //int m;
		        //int n;
		        
		            r=(500-(A*2))+(1000-((A+B)*4));    
		            s=(1000-(B*4))+(500-((A+B)*2));
		            if(r<s)
		            {
		                    System.out.println(s);
		            }
		            else{
		                    System.out.println(r);
		            }
		}
	}
}
