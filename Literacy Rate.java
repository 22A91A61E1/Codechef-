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
		        long P=sc.nextInt();
		        long L=sc.nextInt();
		        long a=(L*100)/P;
		        if(a>=75)
		        {
		                System.out.println("YES");
		        }
		        else{
		                System.out.println("NO");
		        }
		}

	}
}
