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
		try{
		    Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int o = sc.nextInt();
            int c = sc.nextInt();
            int remaining=20-o;
            int balls=6*remaining;
            int runs=6*balls;
            int total=runs+c;
            int diff=total-r;
            if(diff>0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
