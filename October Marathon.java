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
		int X=sc.nextInt();
		if(X<3)
		{
		        System.out.println("GOLD");
		}
		else if(X>=3 && X<6)
		{
		        System.out.println("SILVER");
		}
		else if(X>=6)
		{
		        System.out.println("BRONZE");
		}
	}
}
