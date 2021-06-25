/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try
		{
		    Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                int b=sc.nextInt();
                b-=2;
                b/=2;
                b=b*(b+1)/2;
                System.out.println(b);
            }
            
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
