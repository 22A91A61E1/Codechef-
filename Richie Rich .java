import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		        int A=sc.nextInt();
		        int B=sc.nextInt();
		        int X=sc.nextInt();
		        int z=((B-A)/X);
		        System.out.println(z);
		}

	}
}
