# Codechef-
// Update the '_' in the code below
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
        Scanner read = new Scanner(System.in);
        
        
        int t = read.nextInt();
        for(int i=0; i<t; i++)
        {
            String s = read.next();
            
            String x = s + s;
           
            System.out.println(x);
        }
	}
}
