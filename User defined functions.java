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
	    Scanner sc = new Scanner(System.in);
            //write main function here
            int A,B;
            A=sc.nextInt();
            B=sc.nextInt();
            listGenerator(A);
            listGenerator(B);

        sc. close();
    }

    // User-defined function to generate and print a list of numbers from 1 to limit
    public static void listGenerator(int limit) {
          //write the user defined function code here
          for(int i=1;i<=limit;i++)
          {
                  System.out.print(i+" ");
          }
          System.out.println();

	}
}

