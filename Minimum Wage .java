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
		                int X=sc.nextInt();
		                int Y=sc.nextInt();
		                int Z=sc.nextInt();
		                if(Z/2<X*Y)
		                {
		                        System.out.println("0");
		                }
		                if((Z/2)>=X*Y)
		                {
		                        System.out.println((Z/2)/(X*Y));
		                }
		        }
	}
}
