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
        	int t=sc.nextInt();
        	for(int i=0;i<t;i++)
        	{
                int n=sc.nextInt();
                int count=0;
                for(int j=n;j>0;j=j-2)
                {
                    count=count+(n*n);
                    n=n-2;
                }
                
                System.out.println(count);
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
