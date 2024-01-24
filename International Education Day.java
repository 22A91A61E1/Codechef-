import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		if((A*C)>=(B*C))
		{
		        System.out.println(A*C);
		}
		else if((A*C)<(B*C))
		{
		        System.out.println(B*C);
		}

	}
}
