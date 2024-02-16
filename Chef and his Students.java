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
		        String s=sc.next();
		        int count=0;
		        for(int j=0;j<s.length()-1;j++)
		        {
		        if(s.charAt(j)=='<' && s.charAt(j+1)=='>')
		        {
		                count=count+1;
		                
		        }
		        }
		        System.out.println(count);
		}

	}
}
