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
		        int C=sc.nextInt();
		        if(A>=B && A>=C )
		        {
		                if(B>=C)
		                {
		                        System.out.println(A+B);
		                }
		                else if(C>=B)
		                {
		                        System.out.println(A+C);
		                }
		                        
		        }
		        else if(B>=A && B>=C)
		        {
		                if(A>=C)
		                {
		                        System.out.println(B+A);
		                }
		                else if(C>=A)
		                {
		                        System.out.println(B+C);
		                }
		        }
		        else if(C>=B && C>=A)
		        {
		                if(A>=B)
		                {
		                        System.out.println(C+A);
		                }
		                else if(B>=A)
		                {
		                        System.out.println(C+B);
		                }
		        }
		        else if(A==B && B==C && C==A)
		        {
		                System.out.println(A+B);
		        }
		}
	}
}
