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
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        int c=sc.nextInt();
		        int d=sc.nextInt();
		        int e=sc.nextInt();
		        
		              if((a+b)<=d && c<=e)
		                {
		                        System.out.println("YES");
		                }
		        
		              else if((a+c)<=d && b<=e)
		                {
		                        System.out.println("YES");
		                }
		       
		                else if((b+a)<=d && c<=e)
		                {
		                        System.out.println("YES");
		                }
		       
		              else if((b+c)<=d && a<=e)
		                {
		                        System.out.println("YES");
		                }
		       
		                else if((c+a)<=d && b<=e)
		                {
		                        System.out.println("YES");
		                }
		            else if((c+b)<=d && a<=e)
		                {
		                        System.out.println("YES");
		                }
		       
		        else{
		                System.out.println("NO");
		        }
		}
	}
}
