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
		for(int j=0;j<T;j++)
		{
		        int arr[]=new int[5];
		        for(int i=0;i<5;i++)
		        {
		                arr[i]=sc.nextInt();
		        }
		        int count=0;
		        for(int i=0;i<5;i++)
		        {
		           if(arr[i]==1)
		           {
		                   count=count+1;
		           }
		                  
		        }
		        if(count>=4)
		        {
		                System.out.println("YES");
		        }
		        else{
		                System.out.println("NO");
		        }
		}

	}
}
